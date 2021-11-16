package com.twitter.clone.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import com.twitter.clone.Account.Account;
import com.twitter.clone.Database;


//add @restcontroller
@RestController
@RequestMapping(path = "/post")
public class PostController {
    private final PostService p;
    @Autowired
    public PostController(PostService serv){
        this.p = serv;

    } 
    @GetMapping
    public List<Post> getpost(){
        Post p = new Post("Something", new Account(), null, null, null);
        Database.add(p);
        return this.p.getPosts();

    }
}

