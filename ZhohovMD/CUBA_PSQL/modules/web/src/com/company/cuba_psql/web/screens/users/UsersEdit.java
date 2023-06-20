package com.company.cuba_psql.web.screens.users;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba_psql.entity.Users;

@UiController("users.edit")
@UiDescriptor("users-edit.xml")
@EditedEntityContainer("usersDc")
@LoadDataBeforeShow
public class UsersEdit extends StandardEditor<Users> {
}