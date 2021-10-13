-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)


SELECT DISTINCT m.title, m.tagline 
FROM genre g
INNER JOIN movie_genre mg
ON mg.genre_id = g.genre_id
INNER JOIN movie m
ON m.movie_id = mg.movie_id
WHERE g.genre_name = 'Fantasy'
ORDER BY m.title;
