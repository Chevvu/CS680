package edu.umb.cs680.hw4;

public class LoggedOut implements State {
    private static LoggedOut instance = null;

    public static LoggedOut getInstance() {
        if (instance == null)
            instance = new LoggedOut();
        return instance;
    }

 public void LoggedOut() {

        }
        SecurityContext stx;
        @Override
        public void login (EncryptedString a){
            if (Authenticator.authenticate(stx, a) == 1) {
                LoggedIn e = LoggedIn.getInstance();
                e.Security(stx);
                stx.ChangeState(LoggedIn.getInstance());
            } else {
                throw new RuntimeException();
            }
        }


        @Override
        public void logout () {
            //already LoggedOut
        }
        public void Security(SecurityContext st){
            stx=st;
        }
}
