package com.sanix.HibernateTips;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Author{

    @Column
    @Generated(GenerationTime.ALWAYS)
    private LocalDateTime lastUpdate;
}