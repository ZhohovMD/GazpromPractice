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
);