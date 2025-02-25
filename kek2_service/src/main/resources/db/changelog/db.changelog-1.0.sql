--liquibase formatted sql

--changeset vernov:1
create table if not exists users (
     id text primary key ,
     username text unique ,
     registration_dt timestamp ,
     role varchar(32)
    );