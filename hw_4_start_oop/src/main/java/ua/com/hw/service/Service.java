package ua.com.hw.service;

import ua.com.hw.dao.Data;
import ua.com.hw.entity.Client;

public class Service {
    private static final Data data = new Data();

    public static void create(Client client){
        data.create(client);
    }

    public void update(Client client){
        data.update(client);
    }

    public static void remove(String id) {
        data.remove(id);
    }

    public static void findById(String id){
        data.findById(id);
    }
//    public static  Client findById(String id) {
//        return data.findById(id);
//    }

    public static Client[] findall(){
        return data.findAll();
    }
}
