package com.academy.neo4j.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.*;

@Node("Person")
@Getter
@Setter
public class PersonEntity {

    @Id
    private String name;

    private Integer born;
}
