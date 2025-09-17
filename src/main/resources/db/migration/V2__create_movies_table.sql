CREATE TABLE movies (
    id          BIGINT          AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(200)    NOT NULL,
    director    VARCHAR(200)    NOT NULL,
    duration    INT(11)         NOT NULL,
    image       VARCHAR(255)    NOT NULL,
    sysnopsis   TEXT            NOT NULL,
    actors      TEXT            NOT NULL,
    release_date   DATETIME        NOT NULL,
    note        FLOAT,
    created_at  TIMESTAMP       NOT NULL    DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP       NOT NULL    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_at  TIMESTAMP       NULL
);