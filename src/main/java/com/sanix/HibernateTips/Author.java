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

  @Column
  private LocalDate dateOfBirth;

  @Column
  private LocalDate dateOfBirth;

  @Transient
  private Integer age;

  public int getAge(){//Using a transient entity attribute
      if(this.age==null){
          log.info("calculate age");
          this.age=Period.between(dateOfBirth, LocalDate.now()).getYears();
      }else{
          log.info("Return cached value");
      }
      return age;
  }
}

//How to cache calculated attribute in the entity
//without storing it in the database