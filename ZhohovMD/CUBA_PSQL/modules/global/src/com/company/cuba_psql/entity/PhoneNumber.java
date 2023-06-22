package com.company.cuba_psql.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.checkerframework.common.aliasing.qual.Unique;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CUBAPSQL_PHONE_NUMBER")
@Entity(name = "cubapsql_Phone_number")
@NamePattern("%s|phNumber")
public class PhoneNumber extends StandardEntity {
    private static final long serialVersionUID = 6917184171375396943L;

    @NotNull
    @Unique
    @Column(name = "PH_NUMBER",nullable = false)
    private String phNumber;

    @NotNull
    @Column(name = "TARIFF_NAME", nullable = false)
    private String tariffName;

    @NotNull
    @Column(name = "BALANCE", nullable = false)
    private Double balance;

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }
}