package com.company.cuba_psql.web.screens.phonenumber;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba_psql.entity.PhoneNumber;

@UiController("phone_number.browse")
@UiDescriptor("phone-number-browse.xml")
@LookupComponent("phoneNumbersTable")
@LoadDataBeforeShow
public class PhoneNumberBrowse extends StandardLookup<PhoneNumber> {
}