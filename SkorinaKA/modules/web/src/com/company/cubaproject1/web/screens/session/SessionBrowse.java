package com.company.cubaproject1.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubaproject1.entity.Session;

@UiController("cubaproject1_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {

}