package edu.umb.cs680.hw09.ModelABC;

import edu.umb.cs680.hw09.PrintingFrameWork.PrintJobExecutor;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw09.*;

import static org.junit.jupiter.api.Assertions.*;

class PrintJobExecutorTest {

    @Test
    public void checklogin() throws Exception {
            SecurityContext print=new SecurityContext(new EncryptedString("password"));
           edu.umb.cs680.hw09.ModelABC.PrintJobExecutor printJobExecutor = new edu.umb.cs680.hw09.ModelABC.PrintJobExecutor();
           printJobExecutor.doAuthentication(new EncryptedString("password"), print);
            assertTrue(print.getWrittenState() instanceof LoggedIn);
    }

    @Test
    public void checkprinter() throws Exception {
        SecurityContext print=new SecurityContext(new EncryptedString("password"));
        edu.umb.cs680.hw09.ModelABC.PrintJobExecutor printJobExecutor = new edu.umb.cs680.hw09.ModelABC.PrintJobExecutor();
        printJobExecutor.execute(new PrintJob(), new EncryptedString("password"), print);
        //assertTrue(print.getWrittenState() instanceof LoggedIn);

    }

    @Test
    public void checkloginfail() throws Exception {
        SecurityContext print = new SecurityContext(new EncryptedString("password"));
        edu.umb.cs680.hw09.ModelABC.PrintJobExecutor printJobExecutor = new edu.umb.cs680.hw09.ModelABC.PrintJobExecutor();

        try {
            printJobExecutor.doAuthentication(new EncryptedString("password"), print);
            assertTrue(print.getWrittenState() instanceof LoggedIn);
        }catch(Exception e){
            assertEquals("failed to authenticate",e.getMessage());
        }
    }

}