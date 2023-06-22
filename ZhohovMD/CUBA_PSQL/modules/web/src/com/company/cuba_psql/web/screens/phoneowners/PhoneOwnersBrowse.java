package com.company.cuba_psql.web.screens.phoneowners;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba_psql.entity.PhoneOwners;

@UiController("cubapsql_Phone_owners.browse")
@UiDescriptor("phone-owners-browse.xml")
@LookupComponent("phoneOwnersesTable")
@LoadDataBeforeShow
public class PhoneOwnersBrowse extends StandardLookup<PhoneOwners> {
}