-- liquibase formatted sql

-- changeset Azamat:create_user
CREATE TABLE users
(
    id          BIGSERIAL PRIMARY KEY,
    name  VARCHAR(255) NOT NULL,
    age int NOT NULL,
    email       VARCHAR(255) NOT NULL UNIQUE,
);