package com.twitter.clone.Account;
import java.util.ArrayList;
import com.twitter.clone.Database;
import org.springframework.stereotype.Component;
import com.twitter.clone.Exceptions.AccountExceptions;

@Component
public class AccountService {
    public ArrayList<Account> getAccounts(){
        return Database.getAccount();

    }
    private static boolean checkEmail(String email){
        if (email.contains(".com") || email.contains(".net") || email.contains(".org") || email.contains(".it") || email.contains(".fr") || email.contains(".co")){
            return !Database.findEmail(email);
        } else {
            return false;
        }
    }
    public Boolean makeAccount(Account newAcc)   throws AccountExceptions   {
        if (newAcc.getEmail().contains("@") && (checkEmail(newAcc.getEmail()))){
            if (newAcc.getFirstname().length() != 0){
            
            Database.add(newAcc);
            return true; 
            } 
        } throw new AccountExceptions("Illegitimate Email");
    }
}
