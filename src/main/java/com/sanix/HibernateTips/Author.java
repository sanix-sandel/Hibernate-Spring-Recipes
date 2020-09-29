package com.sanix.HibernateTips;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author{

   @ManyToMany
   @JoinTable(name="BookAuthor", joinColumns={@JoinColumn(name="bookId", referencedColumnName="id")},
                                inverseJoinColumns = {@JoinColumn(name="authorId",
                                referencedColumnName="id")})
   @OrderBy(value="lastName ASC")
   private Set<Author> authors=new HashSet<Author>();
}
//Initialize an entity attribute automatically before
// it gets persisted. How to execute custom code before
//Hibernate persists an entity