-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)

SELECT DISTINCT p.person_name
FROM person p
INNER JOIN movie m
ON m.director_id = p.person_id
INNER JOIN collection c
ON c.collection_id = m.collection_id
WHERE c.collection_name = 'Harry Potter Collection';
