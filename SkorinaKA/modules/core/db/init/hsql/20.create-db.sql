-- begin CUBAPROJECT1_SESSION
alter table CUBAPROJECT1_SESSION add constraint FK_CUBAPROJECT1_SESSION_ON_SPEAKER foreign key (SPEAKER_ID) references CUBAPROJECT1_SPEAKER(ID)^
create index IDX_CUBAPROJECT1_SESSION_ON_SPEAKER on CUBAPROJECT1_SESSION (SPEAKER_ID)^
-- end CUBAPROJECT1_SESSION
-- begin CUBAPROJECT1_SPEAKER
create unique index IDX_CUBAPROJECT1_SPEAKER_UNIQ_EMAIL on CUBAPROJECT1_SPEAKER (Email)^
-- end CUBAPROJECT1_SPEAKER
