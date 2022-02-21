package ua.com.hw.function.operation;

import ua.com.hw.function.OperationScan;

public class CreateWorkSchool {
    public static void run(){
        System.out.println("the second variant\n" +
                "press line please");
        OperationScan.scanForInput();
        String input = OperationScan.scanForInput();
        input = input.replaceAll("\\d","");
        String text[] = input.split("");

        for (int t = 0; t<text.length;t++){

        }


    }
}
