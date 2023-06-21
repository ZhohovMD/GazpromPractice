package com.company.hospital.web.screens.wards;

import com.haulmont.cuba.gui.screen.*;
import com.company.hospital.entity.Wards;

@UiController("hospital_Wards.edit")
@UiDescriptor("wards-edit.xml")
@EditedEntityContainer("wardsDc")
@LoadDataBeforeShow
public class WardsEdit extends StandardEditor<Wards> {
}