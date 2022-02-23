package ua.com.hw;

import ua.com.hw.entity.Client;
import ua.com.hw.service.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Locale;

public class Application {
    public static void run() {
        System.out.println("Welcome to crud Client =)");
        System.out.println("Please enter to START");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String line  = reader.readLine();


            while (true){
//                navigation();
//                caseValue(reader);
                System.out.println();
                navigation();
                caseValue(reader);
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

    private static void findAll() {
        Client[] clients =Service.findall();
        for (Client client:clients){
            System.out.println("client -> " + client);
        }
    }

    private static void findById(BufferedReader reader) throws IOException {
        System.out.println("how id for find client");
        String id = reader.readLine();
        Service.findById(id);
    }

    private static void remove(BufferedReader reader) throws IOException {
        System.out.println("please, enter id Client");
        String id = reader.readLine();
        Service.remove(id);
    }

    private static void create(BufferedReader reader) throws IOException{
        Client client = new Client();
        System.out.println("please, enter Client name");

        String name = reader.readLine();
        System.out.println("please, enter Client order");
        String order = reader.readLine();
        client.setName(name);
        client.setOrder(order);
        Service.create(client);
    }
    private static void update(BufferedReader reader) throws IOException{
        System.out.println("please, enter id client:");
        String id = reader.readLine();
        Client client = Service.findById(id);

        System.out.print("enter the client name: -> ");
        String name = reader.readLine();
        client.setName(name);

        System.out.println("enter the client order: ->");
        String order = reader.readLine();
        client.setOrder(order.toUpperCase());

        System.out.println("client is update");

    }
}
