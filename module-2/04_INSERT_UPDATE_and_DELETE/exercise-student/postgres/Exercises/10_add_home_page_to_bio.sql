


-- 10. For all people born before 1950 and have a home page, add the home page to the end of their biography. (142 rows)
-- Note: Assume all biographies end in a period with no trailing spaces. You'll need to also add a space before the website address.


UPDATE person
SET biography = biography || ' ' || (SELECT biography FROM person WHERE birthday < '1950-01-01' AND home_page IS NOT NULL) || '.'
WHERE person_id = (person_id FROM person WHERE birthday < '1950-01-01' AND home_page IS NOT NULL);

BEGIN TRANSACTION;



UPDATE person SET biography = 
case 
 when homepage IS NOT NULL then (biography || ' ' || (SELECT biography FROM person WHERE birthday < '1950-01-01' AND home_page IS NOT NULL) || '.')
 when homepage IS NULL then biography
end
WHERE person_id = (SELECT person_id FROM person WHERE birthday < '1950-01-01' AND home_page IS NOT NULL);

SELECT person_name, biography FROM person WHERE birthday < '1950-01-01' AND home_page IS NOT NULL;



COMMIT TRANSACTION;

