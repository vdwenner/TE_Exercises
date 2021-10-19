-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)

START TRANSACTION;

INSERT INTO collection (collection_name)
VALUES ('Bill Murray Collection');


UPDATE movie

SET collection_id = (SELECT collection_id FROM collection WHERE collection_name = 'Bill Murrey Collection')
FROM movie m
LEFT JOIN movie_actor ma
ON m.movie_id = ma.movie_id
LEFT JOIN person p
ON p.person_id = ma.actor_id
WHERE p.person_name = 'Bill Murrey';

SELECT *
FROM movie m
INNER JOIN movie_actor ma
ON m.movie_id = ma.movie_id
INNER JOIN person p
ON p.person_id = ma.actor_id
WHERE p.person_name = 'Bill Murrey';

COMMIT;