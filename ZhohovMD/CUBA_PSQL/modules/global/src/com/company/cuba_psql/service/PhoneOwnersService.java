package com.company.cuba_psql.service;

import com.company.cuba_psql.entity.Users;

public interface PhoneOwnersService {
    String NAME = "cubapsql_PhoneOwnersService";

    Boolean phoneOwnersCountControl(Users user);
}