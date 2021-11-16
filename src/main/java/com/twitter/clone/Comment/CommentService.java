package com.twitter.clone.Comment;
import com.twitter.clone.Database;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class CommentService {
    public ArrayList<Comment> getComment(){
        return Database.getComment();
    }
}
