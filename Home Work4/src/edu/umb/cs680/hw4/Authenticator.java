package edu.umb.cs680.hw4;

public class Authenticator {

    public static int authenticate(SecurityContext stx,EncryptedString a){
        if(stx.getPassword().c.equals(a.c)){
            return 1;
        }
        return 0;
    }
}
