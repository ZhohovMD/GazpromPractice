package com.company.cuba_psql.service;

import com.company.cuba_psql.entity.PhoneNumber;
import com.company.cuba_psql.entity.Users;
import com.haulmont.cuba.core.global.DataManager;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(PhoneOwnersService.NAME)
public class PhoneOwnersServiceBean implements PhoneOwnersService {

    @Inject
    private DataManager dataManager;
    @Inject
    private Logger log;

    @Override
    public Boolean phoneOwnersCountControl(Users user) {
        log.info("Начало запроса 'phoneOwnersCountControl'");
        Long phoneNumberCount = dataManager.loadValue("select count(s) from cubapsql_Phone_owners s where " +
                        "s.users = :userId", Long.class)
                .parameter("userId", user)
                .one();
        log.info("Конец запроса 'phoneOwnersCountControl'");
        return phoneNumberCount < 5;
    }

    @Override
    public Boolean phoneOwnersNumbersControl(PhoneNumber phoneNumber) {
        log.info("Начало запроса 'phoneOwnersNumbersControl'");
        Long phoneNumberExist = dataManager.loadValue("select count(s) from cubapsql_Phone_owners s where " +
                        "s.phoneNumber = :phoneNumberId", Long.class)
                .parameter("phoneNumberId", phoneNumber)
                .one();
        log.info("Конец запроса 'phoneOwnersNumbersControl'");
        return phoneNumberExist < 1;
    }
}