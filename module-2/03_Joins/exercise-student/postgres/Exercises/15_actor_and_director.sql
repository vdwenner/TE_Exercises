-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT m.title, per.person_name
FROM movie m
INNER JOIN movie_actor ma
ON m.movie_id = ma.movie_id
INNER JOIN person p
ON p.person_id = ma.actor_id
INNER JOIN person per
ON m.director_id = per.person_id
WHERE p.person_name = per.person_name
