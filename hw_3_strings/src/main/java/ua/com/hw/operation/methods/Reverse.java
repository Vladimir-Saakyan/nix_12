package ua.com.hw.operation.methods;

import ua.com.hw.operation.ChoiseMethod;
import ua.com.hw.operation.Scan;

public class Reverse {

    public static void run() {
        System.out.println("kuku");

        Scan.scanForLine();

        String line = Scan.scanForLine();

        char[] arr = line.toCharArray();
        String result = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];
        }
        System.out.println(result);
        System.out.println("===============================");
        ChoiseMethod.run();
    }
}
