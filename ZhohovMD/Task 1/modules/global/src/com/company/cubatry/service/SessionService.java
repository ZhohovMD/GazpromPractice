package com.company.cubatry.service;

import com.company.cubatry.entity.Session;

import java.time.LocalDateTime;

public interface SessionService {
    String NAME = "cubatry_SessionService";

    Session resheduleSession(Session session, LocalDateTime newStartDate);
}