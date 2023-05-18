package edu.umb.cs680.hw09.PrintingFrameWork;


import edu.umb.cs680.hw09.EncryptedString;
import edu.umb.cs680.hw09.SecurityContext;

public abstract class PrintJobExecutor {
    public void execute(Command job, EncryptedString password, SecurityContext context) throws Exception {
        doAuthentication(password, context);
        doAccessControl();
        doPrint(job, context);
        doErrorHandling();
    }
    protected abstract void  doAuthentication(EncryptedString password, SecurityContext context) throws Exception;


    protected abstract void doAccessControl();


    protected abstract void doPrint(Command job, SecurityContext context);


    protected abstract void doErrorHandling();


}
