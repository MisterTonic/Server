package com.twitter.clone.Post;
import com.twitter.clone.Account.Account;
import com.twitter.clone.Comment.Comment;
import java.util.ArrayList;
import java.time.Instant;


public class Post {
    private String post;
    private Account sender;
    private ArrayList<Account> likedby;
    private ArrayList<Comment> replies;
    //private Post share;
    private Instant timestamp; 
    public Post (String p, Account s, ArrayList<Account> l, ArrayList<Comment> r, Instant t){
        this.post = p;
        this. sender = s;
        this.likedby = l;
        this.replies = r;
        //this.share = sh;
        this.timestamp = t;
    }
    public String getPost() {
        return post;
    }
    public Account getSender() {
        return sender;
    }
    public ArrayList<Account> getLikedby() {
        return likedby;
    }
    public ArrayList<Comment> getReplies() {
        return replies;
    }
    public Instant getTimestamp() {
        return timestamp;
    }
}
