package com.sanix.HibernateTips;

import javax.persistence.*;

@Entity
public class Manuscript {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", updatable=false, nullable=false)
    private Long id;

    @OneToOne
    @JoinColumn(name="fk_book")
    private Book book;
}
