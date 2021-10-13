-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'
SELECT DISTINCT p.person_name, COUNT(m.title)
FROM person p
INNER JOIN movie_actor ma
ON ma.actor_id = p.person_id
INNER JOIN movie m
ON ma.movie_id = m.movie_id
GROUP BY p.person_name
ORDER BY p.person_name DESC
