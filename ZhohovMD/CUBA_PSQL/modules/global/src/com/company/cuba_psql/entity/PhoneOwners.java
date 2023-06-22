package com.company.cuba_psql.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.checkerframework.common.aliasing.qual.Unique;

import javax.persistence.*;

@Table(name = "CUBAPSQL_PHONE_OWNERS")
@Entity(name = "cubapsql_Phone_owners")
@NamePattern("%s|phoneNumber")
public class PhoneOwners extends StandardEntity {
    private static final long serialVersionUID = 3789736246267989299L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    private Users users;

    @NotNull
    @Unique
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PHONE_NUMBER")
    private PhoneNumber phoneNumber;

    public void setUsers(Users users) {
        this.users = users;
    }

    public Users getUsers() {
        return users;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}