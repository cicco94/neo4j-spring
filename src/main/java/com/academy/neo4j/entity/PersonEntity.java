package com.academy.neo4j.entity;

import org.springframework.data.neo4j.core.schema.*;

import java.io.Serializable;

@Node("Person")
public class PersonEntity implements Serializable {

    @Id
    private String name;

    private Integer born;

    public PersonEntity() {
    }

    public PersonEntity(String name, Integer born) {
        this.name = name;
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public Integer getBorn() {
        return born;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBorn(Integer born) {
        this.born = born;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "name='" + name + '\'' +
                ", born=" + born +
                '}';
    }
}
