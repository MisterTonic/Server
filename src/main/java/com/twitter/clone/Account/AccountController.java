package com.twitter.clone.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import com.twitter.clone.Database;
import org.springframework.http.HttpStatus;
import com.twitter.clone.Exceptions.AccountExceptions;

//add @restcontroller
@RestController
@RequestMapping(path = "/account")
public class AccountController {
    private final AccountService s;
    @Autowired
    public AccountController(AccountService serv){
        this.s = serv;

    } 
    @GetMapping
    public ArrayList<Account> getAccounts(){
        Account a = new Account("First", "Last", 0, "Bio", null, "email@gmail.com");
        Database.add(a);
        return this.s.getAccounts();

    }
    @PostMapping
    public ResponseEntity<String> makeAcc(@RequestBody Account a){
        
        try {
                if (this.s.makeAccount(a) == true) {
                return new ResponseEntity<>("Congrats on making an account", HttpStatus.ACCEPTED);
                }
                return new ResponseEntity<>("Unexpected Error Occured", HttpStatus.INTERNAL_SERVER_ERROR);
            }   catch(AccountExceptions e) {
                return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
            }   catch(Exception e) {
                return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            }
    }
}
