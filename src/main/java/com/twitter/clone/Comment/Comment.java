package com.twitter.clone.Comment;
import java.util.ArrayList;
import com.twitter.clone.Account.Account;
import java.time.Instant;

public class Comment {
    private Account commenter;
    private ArrayList<Account> likedby; 
    private String comment;
    private ArrayList<Comment> replies;
    private Instant timestamp; 
    public Comment (Account c, ArrayList<Account> l, String cm, ArrayList<Comment> r, Instant t){
        this.commenter = c;
        this.likedby = l;
        this.comment = cm;
        this.replies = r;
        this.timestamp = t;
    }
    public Account getCommenter() {
        return commenter;
    }
    public ArrayList<Account> getLikedby() {
        return likedby;
    }
    public String getComment() {
        return comment;
    }
    public ArrayList<Comment> getReplies() {
        return replies;
    }
    public Instant getTimestamp() {
        return timestamp;
    }
}