CREATE TABLE genres (
    id      BIGINT          AUTO_INCREMENT  PRIMARY KEY,
    name    VARCHAR(100)    NOT NULL        UNIQUE
);

INSERT INTO genres (name) VALUES
('Action'),
('Animation'),
('Comédie'),
('Drame'),
('Fantastique/Science-fiction'),
('Horreur'),
('Musical'),
('Thriller/Policier'),
('Western'),
('Romance'),
('Aventure');