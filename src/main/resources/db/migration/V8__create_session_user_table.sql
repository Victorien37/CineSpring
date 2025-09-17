CREATE TABLE session_user(
    session_id  BIGINT,
    user_id     BIGINT,
    PRIMARY KEY (session_id, user_id),
    FOREIGN KEY (session_id) REFERENCES sessions(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);