package ua.com.hw.service;

import ua.com.hw.dao.Data;
import ua.com.hw.entity.Client;

public class Service {
    private final Data data = new Data();

    public void create(Client client){
        data.create(client);
    }

    public void update(Client client){
        data.update(client);
    }

    public void remove(String id) {
        data.remove(id);
    }

    public Client findById(String id) {
        return data.findById(id);
    }

    public Client[] findall(){
        return data.findAll();
    }
}
