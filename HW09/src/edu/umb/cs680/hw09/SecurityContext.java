package edu.umb.cs680.hw09;

public class SecurityContext {

    State st;
    EncryptedString Password ;

    public SecurityContext(EncryptedString Password) {
       this.Password=Password;
       LoggedOut instance=LoggedOut.getInstance();
        instance.Security(this);
        this.st=instance;


    }
    public  State getWrittenState(){
        return this.st;
    }
    public void ChangeState (State s) {
        st=s;
    }
    public void logout () {
         st.logout();
        }
    public void login(EncryptedString a){
     st.login(a);
    }
    public EncryptedString getPassword(){
        return this.Password;
    }

    public boolean isActive(){
        if(this.st instanceof LoggedIn){
            return true;
        }
        else {
            return false;
        }
    }

    }

