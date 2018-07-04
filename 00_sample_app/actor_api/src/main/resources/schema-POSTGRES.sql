DROP TABLE IF EXISTS actors;

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE actors (
  id                     UUID PRIMARY KEY NOT NULL,
  movie_id               UUID NOT NULL,
  name                   TEXT NOT NULL
  );


INSERT INTO actors (id, movie_id, name)
 VALUES
--  Terminator 2
 (uuid_generate_v4(), '98f4071e-5aa9-480a-be15-f2e14df21951', 'Arnold Schwarzenegger'),
 (uuid_generate_v4(), '98f4071e-5aa9-480a-be15-f2e14df21951', 'Linda Hamilton'),
 (uuid_generate_v4(), '98f4071e-5aa9-480a-be15-f2e14df21951', 'Edward Furlong'),
--  Ex-machina
 (uuid_generate_v4(), '5f3ba0b5-8c39-4065-999a-60fc3d2a2dbb', 'Alicia Vikander'),
 (uuid_generate_v4(), '5f3ba0b5-8c39-4065-999a-60fc3d2a2dbb', 'Oscar Isaac'),
--  Pulp Fiction
 (uuid_generate_v4(), '895bf1ce-6f16-40f4-b2a6-b4202192f69d', 'John Travolta'),
 (uuid_generate_v4(), '895bf1ce-6f16-40f4-b2a6-b4202192f69d', 'Tim Roth'),
 (uuid_generate_v4(), '895bf1ce-6f16-40f4-b2a6-b4202192f69d', 'Samuel L. Jackson'),
 (uuid_generate_v4(), '895bf1ce-6f16-40f4-b2a6-b4202192f69d', 'Uma Thurman');