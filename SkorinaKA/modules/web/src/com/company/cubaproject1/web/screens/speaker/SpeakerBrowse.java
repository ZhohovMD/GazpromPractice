package com.company.cubaproject1.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubaproject1.entity.Speaker;

@UiController("cubaproject1_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {
}