package edu.umb.cs680.hw09;

public class LoggedIn implements State{
    private static LoggedIn instance = null;
    public static LoggedIn getInstance () {
        if (instance == null)
            instance = new LoggedIn();
        return instance;
    }

    private LoggedIn(){

    }
    SecurityContext stx;
    @Override
    public void login(EncryptedString a) {
        //Already logged in
    }

    @Override
    public void logout() {
                 LoggedOut e = LoggedOut.getInstance();
                e.Security(stx);
                stx.ChangeState(LoggedOut.getInstance());

    }

    public void Security(SecurityContext st){
        stx=st;
    }
}
