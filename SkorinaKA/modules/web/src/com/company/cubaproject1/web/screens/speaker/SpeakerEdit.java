package com.company.cubaproject1.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubaproject1.entity.Speaker;

@UiController("cubaproject1_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}