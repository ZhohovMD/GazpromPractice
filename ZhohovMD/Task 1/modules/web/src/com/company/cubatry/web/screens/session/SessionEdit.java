package com.company.cubatry.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubatry.entity.Session;

@UiController("cubatry_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionsDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {

    public void onInitEntity(InitEntityEvent<Session> event) {
        event.getEntity().setDuration(1);
    }
}