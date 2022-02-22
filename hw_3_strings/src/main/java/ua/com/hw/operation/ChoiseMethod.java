package ua.com.hw.operation;

import ua.com.hw.operation.methods.Reverse;
import ua.com.hw.operation.methods.ReverseByIndex;
import ua.com.hw.operation.methods.ReverseByValue;

public class ChoiseMethod {
    static Scan scan;

    public static void run() {
        System.out.println("Hello!!!\n" +
                "which method will you choose?\n" +
                "===============================\n" +
                "-1- Reversе\n" +
                "-2- Reverse by value\n" +
                "-3- Reverse for index\n" +
                "-0- exit");

        int method = scan.scanForMethod();
        System.out.println(method);
        switch (method) {
            case 1:
                System.out.println("you run the 'REVERSE' ");
                Reverse.run();
                break;
            case 2:
                System.out.println("you run the 'REVERSE By Value' ");
                ReverseByValue.run();
            case 3:
                System.out.println("you run the 'REVERSE BY INDEX'");
                ReverseByIndex.run();
            case 0:System.exit(0);
        }

    }}


