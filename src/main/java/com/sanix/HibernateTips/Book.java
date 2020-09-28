package com.sanix.HibernateTips;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", updatable=false, nullable=false)
    private Long id;

    @OneToMany(mappedBy="book")
    private List<Review> reviews=new ArrayList<>();

}
