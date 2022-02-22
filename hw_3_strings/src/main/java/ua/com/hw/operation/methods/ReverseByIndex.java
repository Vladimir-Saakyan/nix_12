package ua.com.hw.operation.methods;

import ua.com.hw.operation.Scan;

public class ReverseByIndex {
    public static void run(){
        System.out.println("enter the line");
        Scan.scanForLine();
        Scan.scanForIndex();

        String line = Scan.scanForLine();

        System.out.println("enter number simbol for start reverse");
        int reverseStart = Scan.scanForIndex();
        System.out.println("enter number simbol for end reverse");
        int reversOver = Scan.scanForIndex();
        String reverseLine = "";
        char[] arr = line.toCharArray();
        for(int i = reverseStart -1; i >= reversOver-1; i++ ){
            reverseLine = reverseLine + arr[i];
        }
        System.out.println(arr);

    }
}
