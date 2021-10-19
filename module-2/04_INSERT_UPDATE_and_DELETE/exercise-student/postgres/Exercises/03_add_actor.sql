-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)

START TRANSACTION;

INSERT INTO person (person_name)
VALUES ('Eric Staltz');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ((SELECT movie_id FROM movie WHERE title = 'Back to the Future'), (SELECT person_id FROM person WHERE person_name = 'Eric Staltz'));

COMMIT TRANSACTION;