package com.company.hospital.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "HOSPITAL_WARDS")
@Entity(name = "hospital_Wards")
public class Wards extends StandardEntity {
    private static final long serialVersionUID = -4235686760249626357L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    @Column(name = "NAME")
    private String name;

    @Column(name = "MAX_COUNT")
    private Integer maxCount;

//    @OneToMany(mappedBy = "wards_items")
//    private List<People> peopleList;

}