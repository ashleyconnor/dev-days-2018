DROP TABLE IF EXISTS movies;

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE movies (
  id                     UUID PRIMARY KEY NOT NULL,
  name                   TEXT NOT NULL,
  director               TEXT NOT NULL,
  release_year           SMALLINT NOT NULL
  );


INSERT INTO movies (id, name, director, release_year)
 VALUES
 ('98f4071e-5aa9-480a-be15-f2e14df21951', 'Terminator 2', 'James Cameron', 1991),
 ('5f3ba0b5-8c39-4065-999a-60fc3d2a2dbb', 'Ex Machina', 'Alex Garland', 2014),
 ('895bf1ce-6f16-40f4-b2a6-b4202192f69d', 'Pulp Fiction', 'Quentin Tarantino', 1994);