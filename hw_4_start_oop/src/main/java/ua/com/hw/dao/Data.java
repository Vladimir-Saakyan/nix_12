package ua.com.hw.dao;

import ua.com.hw.entity.Client;

import java.util.Arrays;
import java.util.UUID;

public class Data {
    private Client[] clients = new Client[0];
    private int size = 0;

    public void create(Client client){
        client.setId(generateId());
        clients = Arrays.copyOf(clients, size + 1);
        clients[size] = client;
        size++;
    }

    public void update(Client client){
        for (int i = 0; i<clients.length; i++){
            if(clients[i].getId().equals(client.getId())){
                clients[i] = client;
            }
        }
    }

    public void remove(String id){
        for (Client client:clients) {
            if (client.getId().equals(id)){
                for (int i = (Arrays.asList(clients).indexOf(client))+1; i<size; i++){
                    clients[i-1]= clients[i];
                }
                clients = Arrays.copyOf(clients, size -1);
                size--;
            }
        }
    }

    public Client findById(String id){
        for (Client client : clients){
            if(client.getId().equals(id)){
                return client;
            }
        }
        return null;
    }

    public Client[] findAll(){
        return clients;
    }

    private String generateId(){
        String id = UUID.randomUUID().toString();
        for (Client client : clients) {
            if (client.getId().equals(id)) return generateId();
        }
        return id;
    }
}
