package com.company.cuba_psql.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "phone_number")
@Entity(name = "phone_number")
@NamePattern("%s|phNumber")
public class PhoneNumber extends StandardEntity {
    private static final long serialVersionUID = 6917184171375396943L;

    @NotNull
    @Column(name = "ph_number",nullable = false)
    private String phNumber;

    @NotNull
    @Column(name = "tariff_name", nullable = false)
    private String tariffName;

    @NotNull
    @Column(name = "balance", nullable = false)
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