package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Hello World!");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
    }
}