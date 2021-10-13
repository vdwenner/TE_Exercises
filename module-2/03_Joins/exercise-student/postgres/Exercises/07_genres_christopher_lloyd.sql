-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.
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
WHERE p.person_name = 'Christopher Lloyd';
