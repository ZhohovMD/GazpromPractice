package com.company.hospital.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "HOSPITAL_PEOPLE")
@Entity(name = "hospital_People")
public class People extends StandardEntity {
    private static final long serialVersionUID = -2082641552224520514L;

    @Column(name = "FIRST_NAME")
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

    public String getPatherName() {
        return patherName;
    }

    public void setPatherName(String patherName) {
        this.patherName = patherName;
    }

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PATHER_NAME")
    private String patherName;

    public People(String firstName, String lastName, String patherName, Wards wards, Diagnosis diagnosis) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patherName = patherName;
        this.wards = wards;
        this.diagnosis = diagnosis;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "wards_id")
    private Wards wards;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "diagnosis_id")
    private Diagnosis diagnosis;
}