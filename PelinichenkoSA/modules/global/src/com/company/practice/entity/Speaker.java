package com.company.practice.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.springframework.stereotype.Indexed;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Table(name = "PRACTICE_SPEAKER", indexes = @Index(name = "LAST_NAME_INDEX", columnList = "LAST_NAME"))
@Entity(name = "practice_Speaker")
@NamePattern("%s %s|firstName,lastName")
public class Speaker extends StandardEntity {
    private static final long serialVersionUID = 6780540630130770226L;
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;
}