package com.company.practice.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.practice.entity.Session;

@UiController("practice_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
}