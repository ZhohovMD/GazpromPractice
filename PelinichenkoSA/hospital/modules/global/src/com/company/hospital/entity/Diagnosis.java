package com.company.hospital.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "HOSPITAL_DIAGNOSIS")
@Entity(name = "hospital_Diagnosis")
public class Diagnosis extends StandardEntity {
    private static final long serialVersionUID = -3891086222017740939L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Diagnosis(String name) {
        this.name = name;
    }

    @Column(name="NAME")
    private String name;

//    public Diagnosis(String name, List<People> peopleList) {
//        this.name = name;
//        this.peopleList = peopleList;
//    }
//
//    @OneToMany(mappedBy = "diagnosis_items")
//    private List<People> peopleList;
}