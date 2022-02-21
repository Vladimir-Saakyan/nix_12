package ua.com.hw.function.operation;

import ua.com.hw.function.ChoiseMethod;
import ua.com.hw.function.OperationScan;

public class CreateSummNumber {

    public static void run() {
        System.out.println("the first variant\n" +
                "press line please");

        String input = OperationScan.scanForInput();
        input = input.replaceAll("\\D","");
        String number[] = input.split("");

        Integer sumNumber=0;
        for(int i = 0; i < number.length; i++){
            Integer.parseInt(number[i]);
            sumNumber += Integer.valueOf(number[i]);
        }

        System.out.println("your sum element - " + sumNumber);



    }
}
