CREATE TABLE users (
    id          BIGINT          AUTO_INCREMENT  PRIMARY KEY,
    firstname   VARCHAR(100)    NOT NULL,
    lastname    VARCHAR(100)    NOT NULL,
    email       VARCHAR(150)    NOT NULL        UNIQUE,
    role        VARCHAR(100)    NOT NULL        DEFAULT "USER",
    created_at  TIMESTAMP       NOT NULL        DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP       NOT NULL        DEFAULT CURRENT_TIMESTAMP,
    deleted_at  TIMESTAMP       NULL
);