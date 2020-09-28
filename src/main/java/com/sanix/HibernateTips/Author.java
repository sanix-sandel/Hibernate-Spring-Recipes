package com.sanix.HibernateTips;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Author {

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name="id", updatable=false, nullable=false)
   private Long id;

   @ManyToMany(mappedBy="authors")
   private List<Book> books=new ArrayList<>();

   public void addBook(Book b){
      this.books.add(b);
      b.getAuthors().add(this);
   }

   public void removeBook(Book b){
      this.books.remove(b);
      b.getAuthors().remove(this);
   }
}
