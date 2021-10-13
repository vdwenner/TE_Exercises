-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)
SELECT p.person_name, m.title 
FROM movie m
INNER JOIN movie_actor ma
        ON m.movie_id = ma.movie_id
INNER JOIN person p
        ON p.person_id = ma.actor_id
WHERE p.person_name LIKE '% Jones'
ORDER BY p.person_name ASC

