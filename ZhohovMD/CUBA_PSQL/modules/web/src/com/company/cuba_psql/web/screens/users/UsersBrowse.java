package com.company.cuba_psql.web.screens.users;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba_psql.entity.Users;

@UiController("users.browse")
@UiDescriptor("users-browse.xml")
@LookupComponent("usersesTable")
@LoadDataBeforeShow
public class UsersBrowse extends StandardLookup<Users> {
}