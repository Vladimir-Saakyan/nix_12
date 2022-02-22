package ua.com.hw.operation;

import ua.com.hw.operation.methods.Reverse;

public class ChoiseMethod {
    static Scan scan;

    public static void run() {
        System.out.println("Hello!!!\n" +
                "which method will you choose?\n" +
                "===============================\n" +
                "-1- Reverse");

        int method = scan.scanForMethod();
        System.out.println(method);
        switch (method) {
            case 1:
                System.out.println("you run the 'REVERSE' ");
                Reverse.run();
                break;
            case 2:
            case 0:System.exit(0);
        }

    }}


