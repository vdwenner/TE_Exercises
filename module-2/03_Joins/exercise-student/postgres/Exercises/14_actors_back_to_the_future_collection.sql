-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)
SELECT DISTINCT p.person_name
FROM movie m
INNER JOIN movie_actor ma
ON ma.movie_id = m.movie_id
INNER JOIN person p
ON p.person_id = ma.actor_id
INNER JOIN collection c
ON c.collection_id = m.collection_id
WHERE c.collection_name = 'Back to the Future Collection';
