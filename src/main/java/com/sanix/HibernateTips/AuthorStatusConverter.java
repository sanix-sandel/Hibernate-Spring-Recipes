package com.sanix.HibernateTips;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)
public class AuthorStatusConverter implements
        AttributeConverter<AuthorStatus, String> {

    @Override
    public String convertToDatabaseColumn(AuthorStatus status){
        switch(status){
            case NOT_PUBLISHED:
                return "N";
            case PUBLISHED:
                return "P";
            case SELF_PUBLISHED:
                return "S";

            default:
                throw new IllegalArgumentException(
                        "AuthorStatus ["+status+"] not supported."
                );
        }
    }

    @Override
    public AuthorStatus convertToEntityAttribute(String dbData){
        switch(dbData){
            case "N":
                return AuthorStatus.NOT_PUBLISHED;
            case "P":
                return AuthorStatus.PUBLISHED;
            case "S":
                return AuthorStatus.SELF_PUBLISHED;

            default:
                throw new IllegalArgumentException(
                        "AuthorStatus["+dbData+"] not supported"
                );

        }
    }
}
//We want to persist the value PUBLISHED as P, SELF_PUBLISHED as S
//and NOT_PUBLISHED as N