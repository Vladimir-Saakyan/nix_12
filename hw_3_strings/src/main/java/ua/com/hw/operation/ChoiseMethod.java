package ua.com.hw.operation;

import ua.com.hw.operation.methods.Reverse;

public class ChoiseMethod {
    static Scan scan = new Scan();
    int number = scan.sc.nextInt();
    public static void run(int number){
        System.out.println("Hello!!!\n" +
                "which method will you choose?\n" +
                "===============================\n" +
                "-1- Reverse");
        int method = number;

        switch (method){
            case 1: System.out.println("you run the 'REVERSE' ");
                Reverse.run();
            case 0: break;
        }
    }
}
