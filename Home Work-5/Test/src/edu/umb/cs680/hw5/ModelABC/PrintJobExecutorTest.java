package edu.umb.cs680.hw5.ModelABC;

import edu.umb.cs680.hw4.EncryptedString;
import edu.umb.cs680.hw4.LoggedIn;
import edu.umb.cs680.hw4.SecurityContext;
import edu.umb.cs680.hw5.PrintingFrameWork.PrintJob;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintJobExecutorTest {

    @Test
    public void checklogin() throws Exception {
            SecurityContext print=new SecurityContext(new EncryptedString("password"));
            edu.umb.cs680.hw5.ModelABC.PrintJobExecutor job=new PrintJobExecutor();
            job.doAuthentication(new EncryptedString("password"),print);
            assertTrue(print.getWrittenState() instanceof LoggedIn);
    }

    @Test
    public void checkprinter() throws Exception {
        SecurityContext print=new SecurityContext(new EncryptedString("password"));
        edu.umb.cs680.hw5.ModelABC.PrintJobExecutor job=new PrintJobExecutor();
        job.doPrint(new PrintJob());
        //assertTrue(print.getWrittenState() instanceof LoggedIn);

    }

    @Test
    public void checkloginfail() throws Exception {
        SecurityContext print = new SecurityContext(new EncryptedString("password"));
        edu.umb.cs680.hw5.ModelABC.PrintJobExecutor job = new PrintJobExecutor();
        try {
            job.doAuthentication(new EncryptedString("password"), print);
            assertTrue(print.getWrittenState() instanceof LoggedIn);
        }catch(Exception e){
            assertEquals("failed to authenticate",e.getMessage());
        }
    }

}