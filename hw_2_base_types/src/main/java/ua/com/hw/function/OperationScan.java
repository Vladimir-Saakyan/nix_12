package ua.com.hw.function;

import java.util.Scanner;

public class OperationScan {


    static Scanner sc = new Scanner(System.in);



    public static int scanForChoiseMethod(){
        int value = sc.nextInt();
        return value;
    }


    public static String scanForInput(){
        String line = sc.nextLine();
        return line;
    }
}
