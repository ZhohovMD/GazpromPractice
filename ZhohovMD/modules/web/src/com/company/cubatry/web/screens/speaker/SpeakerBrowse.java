package com.company.cubatry.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubatry.entity.Speaker;

@UiController("cubatry_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {
}