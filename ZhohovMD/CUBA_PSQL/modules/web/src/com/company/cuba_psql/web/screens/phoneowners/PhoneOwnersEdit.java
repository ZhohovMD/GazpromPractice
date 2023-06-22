package com.company.cuba_psql.web.screens.phoneowners;

import com.company.cuba_psql.entity.PhoneNumber;
import com.company.cuba_psql.entity.Users;
import com.company.cuba_psql.service.PhoneOwnersService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.screen.*;
import com.company.cuba_psql.entity.PhoneOwners;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;

@UiController("cubapsql_Phone_owners.edit")
@UiDescriptor("phone-owners-edit.xml")
@EditedEntityContainer("phoneOwnersDc")
@LoadDataBeforeShow
public class PhoneOwnersEdit extends StandardEditor<PhoneOwners> {

    @Inject
    private PhoneOwnersService phoneOwnersService;

    @Inject
    private Logger log;

    @Named("commitAndCloseBtn")
    private Button saveButton;

    @Named("userIdField")
    private PickerField userField;

    @Named("phoneNumberField")
    private PickerField phNumberField;

    @Named("userIdFieldError")
    private Label<String> userLable;

    @Named("phoneNumberFieldError")
    private Label<String> phNumberLable;

    @Subscribe("userIdField")
    public void onUserIdFieldValueChange(HasValue.ValueChangeEvent<Users> event) {
        if (!phoneOwnersService.phoneOwnersCountControl(event.getValue())) {
            userLable.setVisible(true);
            saveButton.setEnabled(false);
            userField.setIcon("icons/cancel.png");
        }
        else {
            userLable.setVisible(false);
            saveButton.setEnabled(true);
            userField.setIcon("icons/ok.png");
        }
    }

    @Subscribe("phoneNumberField")
    public void onPhoneNumberFieldValueChange(HasValue.ValueChangeEvent<PhoneNumber> event) {
        if (!phoneOwnersService.phoneOwnersNumbersControl(event.getValue())) {
            phNumberLable.setVisible(true);
            saveButton.setEnabled(false);
            phNumberField.setIcon("icons/cancel.png");
        }
        else {
            phNumberLable.setVisible(false);
            saveButton.setEnabled(true);
            phNumberField.setIcon("icons/ok.png");
        }
    }



}