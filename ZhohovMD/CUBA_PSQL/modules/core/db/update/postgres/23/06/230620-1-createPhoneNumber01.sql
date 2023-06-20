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
);