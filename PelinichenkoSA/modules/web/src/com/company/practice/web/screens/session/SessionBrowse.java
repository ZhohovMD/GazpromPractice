package com.company.practice.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.practice.entity.Session;

@UiController("practice_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
}