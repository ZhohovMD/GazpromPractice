-- alter table HOSPITAL_PEOPLE add column WARDS_ID uuid ^
-- update HOSPITAL_PEOPLE set WARDS_ID = <default_value> ;
-- alter table HOSPITAL_PEOPLE alter column WARDS_ID set not null ;
alter table HOSPITAL_PEOPLE add column WARDS_ID uuid not null ;
-- alter table HOSPITAL_PEOPLE add column DIAGNOSIS_ID uuid ^
-- update HOSPITAL_PEOPLE set DIAGNOSIS_ID = <default_value> ;
-- alter table HOSPITAL_PEOPLE alter column DIAGNOSIS_ID set not null ;
alter table HOSPITAL_PEOPLE add column DIAGNOSIS_ID uuid not null ;
