package org.example;

public class Logger {
    private static Logger instance;
    private Logger() {}
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    private String internalMessage = "This is an internal message";
    public String getInternalMessage() {
        return internalMessage;
    }
    public void setInternalMessage(String message) {
        this.internalMessage = message;
    }
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
