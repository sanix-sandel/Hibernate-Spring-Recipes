package com.sanix.HibernateTips;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Author {

    @Enumerated(EnumType.ORDINAL)
    private AuthorStatus status;
    //When you use this mapping to persist an Author
    //entity with STATUS PUBLISHED
    //Hibernate will store the value 0 in the database

    //if you don't provide an @Enumerated annotation or don't
    //set an EnumType as its value, Hibernate also uses the
    //ordinal value as the default mapping

    /*if you want to use String representation of the enum value
    in the database you need to annotate the entity attribute with
    @Enumerated and set EnumType.STRING as its value
    When you persist the same entity in the database, Hibernate writes
    the value PUBLISHED into the database column STATUS

    */
}
