-- begin PHONE_OWNERS
alter table phone_owners add constraint FK_PHONE_OWNERS_ON_USER foreign key (USER_ID) references users(ID)^
alter table phone_owners add constraint FK_PHONE_OWNERS_ON_PHONE_NUMBER foreign key (PHONE_NUMBER) references phone_number(ID)^
create index IDX_PHONE_OWNERS_ON_USER on phone_owners (USER_ID)^
create index IDX_PHONE_OWNERS_ON_PHONE_NUMBER on phone_owners (PHONE_NUMBER)^
-- end PHONE_OWNERS
