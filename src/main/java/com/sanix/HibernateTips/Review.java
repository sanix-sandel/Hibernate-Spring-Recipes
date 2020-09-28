package com.sanix.HibernateTips;

import javax.persistence.*;

@Entity
public class Review {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", updatable=false, nullable=false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="fk_book")
    private Book book;
}
