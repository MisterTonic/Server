package com.twitter.clone;
import java.time.Instant;
import java.util.ArrayList;
import java.io.File;

import com.twitter.clone.Comment.Comment;
import com.twitter.clone.Account.Account;
import com.twitter.clone.Post.Post;
import java.util.Scanner;

public class Database {
    private static ArrayList<Account> Account = new ArrayList<Account>();
    private static ArrayList<Comment> Comment = new ArrayList<Comment>();
    private static ArrayList<Post> Post = new ArrayList<Post>();
    public static void add(Account A){
        Account.add(A);
    }
    public static void add(Comment C){
        Comment.add(C);
    }
    public static void add(Post P){
        Post.add(P);
    }
    public static ArrayList<Account> getAccount() {
        return Account;
    }
    public static ArrayList<Comment> getComment() {
        return Comment;
    }
    public static ArrayList<Post> getPost() {
        return Post;
    }
    public static void LoadFiles() {
        try {
            System.out.println("Loading Account's File");
            File f = new File("C:\\Users\\luket\\Documents\\Workspace\\Java Stuff\\Twitter-Clone\\clone\\src\\main\\resources\\Assets\\Accounts.txt");
            Scanner s = new Scanner(f);
            while (s.hasNext()) {
                String name = s.nextLine();
                String lastname = s.nextLine();
                int age = s.nextInt();
                s.nextLine();
                String bio = s.nextLine();
                String dobString = s.nextLine();
                Instant dob = (dobString.contains("NULL"))?null: Instant.parse(dobString);
                String email = s.nextLine();
                System.out.println(name + " " + lastname + " " + bio + " " + email + " ");
                Account A = new Account(name,lastname,age,bio,dob,email);
                Account.add(A);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    public static boolean findEmail(String e){
        int counter = 0;
        while(true){
            System.out.println(counter);
            Account.get(counter);
            if (Account.get(counter).getEmail().compareTo(e) == 0){ 
                return true;
            }
            counter = counter + 1;
            if (counter >= Account.size() - 1){
                return false;
                //break; -> stops loop
            }
        }
    }
}

