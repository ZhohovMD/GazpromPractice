package com.company.cubatry.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubatry.entity.Session;

@UiController("cubatry_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
}