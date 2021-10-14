-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'
SELECT p.person_name, COUNT(m.movie_id) AS num_of_movies
FROM movie m
JOIN movie_actor ma
ON m.movie_id = ma.movie_id
JOIN person p
ON p.person_id = ma.actor_id
GROUP BY p.person_name, num_of_movies
WHERE p.person_name LIKE '%George%'
ORDER BY p.person_name DESC;






