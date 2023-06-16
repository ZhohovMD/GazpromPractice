create table CUBAPROJECT1_SESSION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    Topic varchar(255) not null,
    Start_Date timestamp not null,
    Duration integer not null,
    Speaker_ID varchar(36) not null,
    Description longvarchar,
    --
    primary key (ID)
);