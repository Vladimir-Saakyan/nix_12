package ua.com.hw.function;

import ua.com.hw.function.operation.CreateKolSymbol;
import ua.com.hw.function.operation.CreateSummNumber;
import ua.com.hw.function.operation.CreateWorkSchool;

public class ChoiseMethod {
        static OperationScan scan;
    public static void choiseMethod(){
        System.out.println("    Hello! \npress number for start\n" +
                "=========================\n" +
                "1-sum of digits\n" +
                "2-number of each letter\n" +
                "3-work school\n" +
                "0-exit");
        int choise = scan.scanForChoiseMethod();
        switch (choise){
            case 1:
                System.out.println("your have run the variant - 1");
                CreateSummNumber.run();
                break;
            case 2:
                System.out.println("your have run the variant - 2");
                CreateKolSymbol.run();
                break;
            case 3:
                System.out.println("your have run the variant - 3");
                CreateWorkSchool.run();
                break;
            case 0:
                System.out.println("Bye");

        }
    }
}
