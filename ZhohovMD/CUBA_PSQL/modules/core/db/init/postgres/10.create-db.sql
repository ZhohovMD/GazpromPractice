-- begin USERS
create table users (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    date_of_birth timestamp not null,
    --
    primary key (ID)
)^
-- end USERS
-- begin PHONE_OWNERS
create table phone_owners (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    user_id uuid not null,
    phone_number uuid not null,
    --
    primary key (ID)
)^
-- end PHONE_OWNERS
-- begin PHONE_NUMBER
create table phone_number (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ph_number varchar(255) not null,
    tariff_name varchar(255) not null,
    balance double precision not null,
    --
    primary key (ID)
)^
-- end PHONE_NUMBER
