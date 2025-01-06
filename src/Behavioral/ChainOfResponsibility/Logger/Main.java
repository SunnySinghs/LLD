package Behavioral.ChainOfResponsibility.Logger;

import Behavioral.ChainOfResponsibility.Logger.Abstract.Impl.DebugLogProcessor;
import Behavioral.ChainOfResponsibility.Logger.Abstract.Impl.ErrorLogProcessor;
import Behavioral.ChainOfResponsibility.Logger.Abstract.Impl.InfoLogProcessor;
import Behavioral.ChainOfResponsibility.Logger.Abstract.LogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR, "Exception Occurred");
        logProcessor.log(LogProcessor.DEBUG, "Debug required here");
        logProcessor.log(LogProcessor.INFO, "Info Statement");
    }
}
