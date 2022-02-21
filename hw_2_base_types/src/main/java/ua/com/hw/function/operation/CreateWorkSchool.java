package ua.com.hw.function.operation;

import ua.com.hw.function.ChoiseMethod;
import ua.com.hw.function.OperationScan;

public class CreateWorkSchool {
    public static void run(){
        System.out.println("the third variant\n" +
                "press number lesson");
        int lesson = OperationScan.scanForChoiseMethod();

        lesson = 540 + lesson * 45 + (lesson/2)*5 + ((lesson-1)/2) * 15;
        int h = lesson / 60;
        int m = lesson % 60;

        System.out.println("lesson ends at " + h+":"+m);


    }
}
