--liquibase formatted sql

--changeset Danilov Alexey:1
create table currency
(
    id    bigserial,
    name  varchar(255) unique,
    value float
);
--rollback drop table currency;
