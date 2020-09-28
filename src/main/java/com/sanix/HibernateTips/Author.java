package com.sanix.HibernateTips;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Author {

   @Id
   @GeneratedValue
   @Column(name="id", updatable=false, nullable=false)
   private UUID id;
}
