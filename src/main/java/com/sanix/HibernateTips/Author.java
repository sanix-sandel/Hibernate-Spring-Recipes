package com.sanix.HibernateTips;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Entity
public class Author{

    @PrePersist
    private void initializeCreatedAt(){
        this.createdAt=LocalDateTime.now();
        log.info("Set createdAt to "+this.createdAt);
    }
}
//Initialize an entity attribute automatically before
// it gets persisted. How to execute custom code before
//Hibernate persists an entity