package com.company.cuba_psql.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "phone_owners")
@Entity(name = "phone_owners")
@NamePattern("%s|phoneNumber")
public class PhoneOwners extends StandardEntity {
    private static final long serialVersionUID = 3789736246267989299L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private Users userId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "phone_number")
    private PhoneNumber phoneNumber;

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}