package ua.com.hw.operation.methods;

import ua.com.hw.operation.Scan;

public class ReverseByValue {

    public static void run(){
        System.out.println("enter the line");
        Scan.scanForLine();
        String line = Scan.scanForLine();

        System.out.println("enter the value for reverse");
        String value = Scan.scanForLine();

        String resultVal = "";
        char[] arr = value.toCharArray();
        for (int i = arr.length -1; i>=0; i--){
            resultVal = resultVal + arr[i];
        }

        line = line.replace(value, resultVal);

        System.out.println(line);
    }
}
