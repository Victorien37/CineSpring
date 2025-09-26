CREATE TABLE users (
    id          BIGINT          AUTO_INCREMENT  PRIMARY KEY,
    firstname   VARCHAR(100)    NOT NULL,
    lastname    VARCHAR(100)    NOT NULL,
    email       VARCHAR(150)    NOT NULL        UNIQUE,
    admin       TINYINT(1)      NOT NULL        DEFAULT 0,
    created_at  TIMESTAMP       NOT NULL        DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP       NOT NULL        DEFAULT CURRENT_TIMESTAMP,
    deleted_at  TIMESTAMP       NULL
);