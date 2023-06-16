-- begin CUBAPROJECT1_SESSION
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
)^
-- end CUBAPROJECT1_SESSION
-- begin CUBAPROJECT1_SPEAKER
create table CUBAPROJECT1_SPEAKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    First_Name varchar(255) not null,
    Last_Name varchar(255),
    Email varchar(255) not null,
    --
    primary key (ID)
)^
-- end CUBAPROJECT1_SPEAKER
