package com.company.cuba_psql.web.screens.phoneowners;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba_psql.entity.PhoneOwners;

@UiController("phone_owners.edit")
@UiDescriptor("phone-owners-edit.xml")
@EditedEntityContainer("phoneOwnersDc")
@LoadDataBeforeShow
public class PhoneOwnersEdit extends StandardEditor<PhoneOwners> {
}