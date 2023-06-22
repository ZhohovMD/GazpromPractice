package com.company.hospital.web.screens.wards;

import com.haulmont.cuba.gui.screen.*;
import com.company.hospital.entity.Wards;

@UiController("hospital_Wards.browse")
@UiDescriptor("wards-browse.xml")
@LookupComponent("wardsesTable")
@LoadDataBeforeShow
public class WardsBrowse extends StandardLookup<Wards> {
}