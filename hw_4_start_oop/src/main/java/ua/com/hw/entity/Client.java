package ua.com.hw.entity;

import java.util.Objects;

public class Client extends BaseEntity{

    private String name;
    private String order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(order, client.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, order);
    }

    @Override
    public String toString(){
        return "Client{"+
                "id='"+ getId() + '\'' +
                "name - " + name + '\'' +
                "order - " + order+
                '}';
    }
}
