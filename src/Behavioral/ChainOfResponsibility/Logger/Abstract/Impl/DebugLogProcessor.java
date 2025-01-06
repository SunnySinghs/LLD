package Behavioral.ChainOfResponsibility.Logger.Abstract.Impl;

import Behavioral.ChainOfResponsibility.Logger.Abstract.LogProcessor;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }


    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("Debug:" + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
