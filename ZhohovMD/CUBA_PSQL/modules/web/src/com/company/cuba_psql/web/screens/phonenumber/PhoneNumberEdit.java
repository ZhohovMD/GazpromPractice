package com.company.cuba_psql.web.screens.phonenumber;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba_psql.entity.PhoneNumber;

@UiController("cubapsql_Phone_number.edit")
@UiDescriptor("phone-number-edit.xml")
@EditedEntityContainer("phoneNumberDc")
@LoadDataBeforeShow
public class PhoneNumberEdit extends StandardEditor<PhoneNumber> {
}