package edu.umb.cs680.hw09.ModelABC;

import edu.umb.cs680.hw09.PrintingFrameWork.Command;

public class PrintJob implements Command {
    private Printer printer = Printer.getPrinter();


    @Override
    public void execute() {
        printer.print();
    }
}
