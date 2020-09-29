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

  public int getCalculatedAge(){
      //Calculate the value in a getter method
      log.info("Calculate age");
      return Period.between(dateOfBirth,
                            LocalDate.now()).getYears();
  }
}

//How to cache calculated attribute in the entity
//without storing it in the database