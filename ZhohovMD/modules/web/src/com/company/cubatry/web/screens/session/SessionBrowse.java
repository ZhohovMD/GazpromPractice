package com.company.cubatry.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubatry.entity.Session;

@UiController("cubatry_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
}