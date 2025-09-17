CREATE TABLE movie_user(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    movie_id    BIGINT REFERENCES movies(id),
    user_id     BIGINT REFERENCES users(id),
    note        INT(11)
);