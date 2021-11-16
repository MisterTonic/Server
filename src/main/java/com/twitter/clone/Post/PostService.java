package com.twitter.clone.Post;
import java.util.ArrayList;
import com.twitter.clone.Database;
import org.springframework.stereotype.Component;

@Component
public class PostService {
    public ArrayList<Post> getPosts(){
        return Database.getPost();
    }
}
