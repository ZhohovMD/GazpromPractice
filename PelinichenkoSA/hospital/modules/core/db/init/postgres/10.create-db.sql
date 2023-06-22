-- begin HOSPITAL_WARDS
create table HOSPITAL_WARDS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    MAX_COUNT integer,
    --
    primary key (ID)
)^
-- end HOSPITAL_WARDS
-- begin HOSPITAL_DIAGNOSIS
create table HOSPITAL_DIAGNOSIS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end HOSPITAL_DIAGNOSIS
-- begin HOSPITAL_PEOPLE
create table HOSPITAL_PEOPLE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    PATHER_NAME varchar(255),
    wards_id uuid not null,
    diagnosis_id uuid not null,
    --
    primary key (ID)
)^
-- end HOSPITAL_PEOPLE
