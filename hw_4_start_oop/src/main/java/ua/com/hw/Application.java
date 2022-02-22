package ua.com.hw;

import ua.com.hw.entity.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Application {
    public static void run() {
        System.out.println("Welcome to crud Client =)");
        System.out.println("Please enter to START");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String line  = reader.readLine();
            navigation();
            while (true){
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }
    private static void navigation(){
        System.out.println("-1- create client");
        System.out.println("-2- update client");
        System.out.println("-3- delete client");
        System.out.println("-4- find client");
        System.out.println("-5- find all clients");
        System.out.println("-0- exit");
    }
    private static void caseValue(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        switch (line) {
            case "1" -> create(reader);
            case "2" -> update(reader);
            case "3" -> remove(reader);
            case "4" -> findById(reader);
            case "5" -> findAll();
            case "0" -> System.exit(0);
        }

    }

    private static void create(BufferedReader reader) throws IOException{
        System.out.println("please, enter Client name");
        String name = reader.readLine();
        System.out.println("please, enter Client order");
        String order = reader.readLine();
        Client client = new Client();
        client.setName(name);
        client.setOrder(ClientName.valueOf(name.toUpperCase()));
        servise.create(client);
    }
}
