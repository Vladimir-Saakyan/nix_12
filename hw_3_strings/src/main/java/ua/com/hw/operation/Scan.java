package ua.com.hw.operation;

import java.util.Scanner;

public class Scan {
    static Scanner sc = new Scanner(System.in);

    public static int scanForMethod(){
        int number = sc.nextInt();
        return number;
    }
    public static String scanForLine(){
        String line = sc.nextLine();
        return line;
    }
}
