-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)
SELECT DISTINCT g.genre_name
FROM movie m
INNER JOIN movie_genre mg
ON m.movie_id = mg.movie_id
INNER JOIN genre g
ON g.genre_id = mg.genre_id
INNER JOIN movie_actor ma
ON ma.movie_id = m.movie_id
INNER JOIN person p
ON p.person_id = ma.actor_id
WHERE p.person_name = 'Robert De Niro' AND m.release_date > '2010-01-01';



