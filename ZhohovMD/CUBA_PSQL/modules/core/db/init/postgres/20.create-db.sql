-- begin CUBAPSQL_PHONE_OWNERS
alter table CUBAPSQL_PHONE_OWNERS add constraint FK_CUBAPSQL_PHONE_OWNERS_ON_USER foreign key (USER_ID) references CUBAPSQL_USERS(ID)^
alter table CUBAPSQL_PHONE_OWNERS add constraint FK_CUBAPSQL_PHONE_OWNERS_ON_PHONE_NUMBER foreign key (PHONE_NUMBER) references CUBAPSQL_PHONE_NUMBER(ID)^
create index IDX_CUBAPSQL_PHONE_OWNERS_ON_USER on CUBAPSQL_PHONE_OWNERS (USER_ID)^
create index IDX_CUBAPSQL_PHONE_OWNERS_ON_PHONE_NUMBER on CUBAPSQL_PHONE_OWNERS (PHONE_NUMBER)^
-- end CUBAPSQL_PHONE_OWNERS
