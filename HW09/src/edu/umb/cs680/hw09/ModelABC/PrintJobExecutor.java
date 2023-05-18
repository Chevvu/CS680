package edu.umb.cs680.hw09.ModelABC;

import edu.umb.cs680.hw09.Authenticator;
import edu.umb.cs680.hw09.EncryptedString;
import edu.umb.cs680.hw09.LoggedIn;
import edu.umb.cs680.hw09.PrintingFrameWork.Command;
import edu.umb.cs680.hw09.PrintingFrameWork.*;
import edu.umb.cs680.hw09.SecurityContext;


public class PrintJobExecutor extends edu.umb.cs680.hw09.PrintingFrameWork.PrintJobExecutor {

    @Override
    protected void doAuthentication(EncryptedString password, SecurityContext context) throws Exception {
        if(Authenticator.authenticate(context,password)==1){
            context.login(password);
        }
        else{
            throw new Exception("fail to authenticate");
        }
    }


    @Override
    protected void doAccessControl() {

    }

    @Override
    protected void doPrint(Command job, SecurityContext context) {
        if(context.isActive()){
            job.execute();
        }
    }


    @Override
    protected void doErrorHandling() {

    }

}
