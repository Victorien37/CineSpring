CREATE TABLE movie_genre(
    movie_id BIGINT,
    genre_id BIGINT,
    PRIMARY KEY (movie_id, genre_id),
    FOREIGN KEY (movie_id) REFERENCES movies(id),
    FOREIGN KEY (genre_id) REFERENCES genres(id)
);