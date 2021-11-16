package com.twitter.clone.Exceptions;

public class AccountExceptions extends Exception{
        public AccountExceptions(String m, Throwable t) {
            super(m,t);
            
        }
        public AccountExceptions(String m) {
                super (m);
        }
}
