package com.company.cubatry.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubatry.entity.Speaker;

@UiController("cubatry_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}