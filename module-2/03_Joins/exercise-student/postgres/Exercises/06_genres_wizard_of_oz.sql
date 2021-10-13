-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT g.genre_name FROM movie m 
INNER JOIN movie_genre mg
ON m.movie_id = mg.movie_id
INNER JOIN genre g
ON g.genre_id = mg.genre_id
WHERE m.title = 'The Wizard of Oz';

