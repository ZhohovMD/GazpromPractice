package com.company.cubatry.web.screens.session;

import com.company.cubatry.service.SessionService;
import com.haulmont.cuba.gui.components.Calendar;
import com.haulmont.cuba.gui.components.EditorScreenFacet;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubatry.entity.Session;

import javax.inject.Inject;
import java.time.LocalDateTime;

@UiController("cubatry_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {

    @Inject
    private SessionService sessionService;

    @Inject
    private CollectionContainer<Session> sessionsDc;
    @Inject
    private EditorScreenFacet<Session, SessionEdit> sessionEditDialog;

    @Subscribe("sessionsCalendar")
    private void onSessionsCalendarCalendarEventClick(Calendar.CalendarEventClickEvent<LocalDateTime> event) {
        sessionEditDialog.setEntityProvider(() -> (Session)event.getEntity());
        sessionEditDialog.show();
    }

    private void onSessionCalendarCalendarEventMove(Calendar.CalendarEventMoveEvent<LocalDateTime> event) {
        Session session = sessionService.resheduleSession((Session) event.getEntity(), event.getNewStart());
        sessionsDc.replaceItem(session);
    }


}