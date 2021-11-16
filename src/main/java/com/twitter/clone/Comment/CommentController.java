package com.twitter.clone.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import com.twitter.clone.Database;
import org.springframework.beans.factory.annotation.Autowired;


//add @restcontroller
@RestController
@RequestMapping(path = "/comment")
public class CommentController {
    private final CommentService s;
    @Autowired
    public CommentController(CommentService serv){
        this.s = serv;

    } 
    @GetMapping
    public ArrayList<Comment> getcomment(){
        Comment c = new Comment(null, null, "null", null, null);
        Database.add(c);
        return this.s.getComment();
    }
}
