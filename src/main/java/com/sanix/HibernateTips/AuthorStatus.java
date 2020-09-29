package com.sanix.HibernateTips;

import javax.persistence.Entity;

@Entity
public enum AuthorStatus {

    PUBLISHED, SELF_PUBLISHED, NOT_PUBLISHED;
}
