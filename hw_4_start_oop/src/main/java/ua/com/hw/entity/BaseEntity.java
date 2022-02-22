package ua.com.hw.entity;

import java.util.Objects;

public abstract class BaseEntity {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o ==null || getClass()!= o.getClass()) return false;
        BaseEntity baseEntity = (BaseEntity) o;
        return Object.equals(id, baseEntity.id);
    }
    @Override
    public int hashCode(){return Object.hash(id);}
}
