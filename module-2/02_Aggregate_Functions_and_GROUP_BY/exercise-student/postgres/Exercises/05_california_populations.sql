-- 5. The sum of the population of all cities in California. Name the column 'california_population'.
-- Expected answer is around 20,000,000
-- (1 row)
SELECT SUM(population) AS california_population FROM state WHERE state_abbreviation = 'CA';
