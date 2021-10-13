-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)
SELECT m.title
FROM movie m
INNER JOIN collection c
ON c.collection_id = m.collection_id
INNER JOIN person p
ON p.person_id = m.director_id
WHERE c.collection_name = 'Star Wars Collection'
AND p.person_name != 'George Lucas';
