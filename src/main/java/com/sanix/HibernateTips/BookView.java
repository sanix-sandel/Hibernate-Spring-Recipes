package com.sanix.HibernateTips;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Immutable
public class BookView {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", updatable=false, nullable=false)
    private Long id;

    @Version
    @Column(name="version")
    private int version;

    @Column
    private String title;

    @Column
    @Temporal(TemporalType.DATE)
    private Date publishingDate;

    @Column
    private String authors;

}
