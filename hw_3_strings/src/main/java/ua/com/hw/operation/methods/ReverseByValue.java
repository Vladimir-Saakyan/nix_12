package ua.com.hw.operation.methods;

import ua.com.hw.operation.Scan;

public class ReverseByValue {
    public static void run(){
        System.out.println("enter line please");
        Scan.scanForLine();

        String line = Scan.scanForLine();
        System.out.println("your line - " + line);

        char[] arr = line.toCharArray();

        System.out.println("enter value for reverse please");

    }
}
