-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
SELECT DISTINCT p.person_name, p.birthday
FROM movie m
INNER JOIN movie_actor ma
ON ma.movie_id = m.movie_id
INNER JOIN person p
ON p.person_id = ma.actor_id
WHERE m.release_date BETWEEN '1985-01-01' AND '1985-12-31'
AND p.birthday BETWEEN '1950-01-01' AND '1959-12-31';
