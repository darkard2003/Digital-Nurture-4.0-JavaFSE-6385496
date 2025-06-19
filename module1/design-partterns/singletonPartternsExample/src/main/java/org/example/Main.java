package org.example;


public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a log message.");
        System.out.println("Internal Message: " + logger.getInternalMessage());

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.setInternalMessage("Updated internal message");

        System.out.println("Internal Message from another instance: " + anotherLogger.getInternalMessage());
        System.out.println("Internal Message: " + logger.getInternalMessage());
    }
}