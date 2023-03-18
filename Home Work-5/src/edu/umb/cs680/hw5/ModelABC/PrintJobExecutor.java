package edu.umb.cs680.hw5.ModelABC;

import edu.umb.cs680.hw4.*;
import edu.umb.cs680.hw5.PrintingFrameWork.PrintJob;

public class PrintJobExecutor extends edu.umb.cs680.hw5.PrintingFrameWork.PrintJobExecutor{

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
    protected void doPrint(PrintJob j) {
        j.Printer();
    }

    @Override
    protected void doErrorHandling() {

    }
}
