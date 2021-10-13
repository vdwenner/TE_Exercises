-- 18. The average length of movies in the "Science Fiction" genre. Name the column 'average_length'.
-- (1 row, expected result around 110-120)
SELECT AVG(m.length_minutes) AS average_length
FROM movie m
INNER JOIN movie_genre mg
ON m.movie_id = mg.movie_id
INNER JOIN genre g
ON g.genre_id = mg.genre_id
WHERE g.genre_name = 'Science Fiction';
