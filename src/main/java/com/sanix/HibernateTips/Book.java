package com.sanix.HibernateTips;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", updatable=false, nullable=false)
    private Long id;

    @ManyToMany
    @JoinTable(
            name="book_author",
            joinColumns={@JoinColumn(name="fk_book")},
            inverseJoinColumns = {@JoinColumn(name="fk_author")}
    )
    private List<Author> authors=new ArrayList<>();

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
