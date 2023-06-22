package com.company.cuba_psql.web.screens.phoneowners;

import com.company.cuba_psql.entity.Users;
import com.company.cuba_psql.service.PhoneOwnersService;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.HasValue;
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
    private Notifications notifications;
    @Inject
    private Logger log;

    @Named("commitAndCloseBtn")
    private Button saveButton;

    @Named("userIdField")
    private PickerField userField;

    @Subscribe("userIdField")
    public void onUserIdFieldValueChange(HasValue.ValueChangeEvent<Users> event) {
        if (!phoneOwnersService.phoneOwnersCountControl(event.getValue())) {
            notifications.create()
                    .withCaption("Ошибка!")
                    .withDescription("Абонент одновременно может иметь только 5 номеров!")
                    .withType(Notifications.NotificationType.ERROR)
                    .show();
            saveButton.setEnabled(false);
            userField.setIcon("icons/cancel.png");
        }
        else {
            saveButton.setEnabled(true);
            userField.setIcon("icons/ok.png");
        }
    }



}