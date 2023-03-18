package edu.umb.cs680.hw5.PrintingFrameWork;


import edu.umb.cs680.hw4.*;

public abstract class PrintJobExecutor {
    public void execute(PrintJob job, EncryptedString password, SecurityContext context) throws Exception {
        doAuthentication(password, context);
        doAccessControl();
        doPrint(job);
        doErrorHandling();
    }
    protected abstract void  doAuthentication(EncryptedString password, SecurityContext context) throws Exception;


    protected abstract void doAccessControl();


    protected abstract void doPrint(PrintJob j);


    protected abstract void doErrorHandling();


}
