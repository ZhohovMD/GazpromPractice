-- begin CUBAPSQL_USERS
create table CUBAPSQL_USERS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    DATE_OF_BIRTH date not null,
    --
    primary key (ID)
)^
-- end CUBAPSQL_USERS
-- begin CUBAPSQL_PHONE_OWNERS
create table CUBAPSQL_PHONE_OWNERS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID uuid not null,
    PHONE_NUMBER uuid not null,
    --
    primary key (ID)
)^
-- end CUBAPSQL_PHONE_OWNERS
-- begin CUBAPSQL_PHONE_NUMBER
create table CUBAPSQL_PHONE_NUMBER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PH_NUMBER varchar(255) not null,
    TARIFF_NAME varchar(255) not null,
    BALANCE double precision not null,
    --
    primary key (ID)
)^
-- end CUBAPSQL_PHONE_NUMBER
