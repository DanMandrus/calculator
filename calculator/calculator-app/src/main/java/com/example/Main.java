package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        if (args.length != 3) {
            return;
        }

        String operation = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        Calculator calculator = new Calculator();
        int result = 0;

        switch (operation) {
            case "add":
                result = calculator.add(num1, num2);
                break;
            case "subtract":
                result = calculator.subtract(num1, num2);
                break;
            case "multiply":
                result = calculator.multiply(num1, num2);
                break;
            case "divide":
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Unknown operation: " + operation);
                return;
        }

        logger.info("Operation: " + operation + ", Num1: " + num1 + ", Num2: " + num2 + ", Result: " + result);
        System.out.println("Result: " + result);
    }
}