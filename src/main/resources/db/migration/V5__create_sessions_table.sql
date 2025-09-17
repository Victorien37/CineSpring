CREATE TABLE sessions(
    id          BIGINT      AUTO_INCREMENT   PRIMARY KEY,
    movie_id    BIGINT      NOT NULL,
    room_id     BIGINT      NOT NULL,
    start_at    DATETIME    NOT NULL,
    FOREIGN KEY (movie_id) REFERENCES movies(id),
    FOREIGN KEY (room_id) REFERENCES rooms(id)
);