package com.twitter.clone.Account;
import java.time.Instant;
import java.time.Clock;

public class Account {
    private String firstname;
    private String lastname;
    private int age;
    private String bio;
    private Instant dob;
    private String email;
    public Account(){ //Constructor; Default constructor because there is nothing within the paranthesis; Constructs "Account"/makes objects
        this.firstname = "";
        this.lastname = "";
        this.age = 0;
        this.bio = "";
        this.dob = Clock.systemDefaultZone().instant();
        this.email = "";
    }
    public Account (String f, String l, Integer a, String b, Instant dob, String e){
        this.firstname = f;
        this.lastname = l;
        this.age = a;
        this.bio = b;
        if (dob == null) {
            this.dob = Clock.systemDefaultZone().instant();
        } else {
            this.dob = dob;
        }
        this.email = e;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public String getBio() {
        return bio;
    }
    public Instant getDob() {
        return dob;
    }
    public String getEmail() {
        return email;
    }
}