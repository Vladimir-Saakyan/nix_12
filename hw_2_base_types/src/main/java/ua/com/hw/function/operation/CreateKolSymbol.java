package ua.com.hw.function.operation;

import ua.com.hw.function.ChoiseMethod;
import ua.com.hw.function.OperationScan;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateKolSymbol {

    public static void run() {
        System.out.println("the second variant\n" +
                "press line please");

        String input  = OperationScan.scanForInput().replaceAll("\\d","");
        String simbol[] = input.split("");

        List<String> list = List.of(simbol);
        Map<String, Integer> razbor = list.stream().collect(Collectors.toMap(e -> e, e->1,Integer::sum));
        razbor.forEach((k, v) -> System.out.println("simbol - " + k + " = " + v));

    }
}

