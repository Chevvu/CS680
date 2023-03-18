package edu.umb.cs680.hw5.ModelXYZ;

import edu.umb.cs680.hw4.EncryptedString;
import edu.umb.cs680.hw4.LoggedIn;
import edu.umb.cs680.hw4.SecurityContext;
import edu.umb.cs680.hw5.ModelABC.PrintJobExecutor;
import edu.umb.cs680.hw5.PrintingFrameWork.PrintJob;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintJobExecutorTest {

    @Test
    public void checkPrinter() throws Exception {
        SecurityContext print=new SecurityContext(new EncryptedString("password"));
        edu.umb.cs680.hw5.ModelXYZ.PrintJobExecutor job=new edu.umb.cs680.hw5.ModelXYZ.PrintJobExecutor();
        job.doPrint(new PrintJob());
       // assertTrue(print.getWrittenState() instanceof LoggedIn);
    }

}