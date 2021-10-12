-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT population FROM state ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT * FROM state ORDER BY census_region DESC, state_name ASC;

-- The biggest park by area
SELECT * FROM park ORDER BY area ASC;


-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT * FROM city ORDER BY population;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT * FROM park ORDER BY date_established ASC;



-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT city_name || state_abbreviation FROM city;

-- The all parks by name and date established.
SELECT park_name, date_established FROM park ORDER BY date_established ASC;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT state_name, census_region FROM state ORDER BY state_name ASC;


-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS avg_population FROM state;

-- Total population in the West and South census regions
SELECT SUM(population) AS west_south_pop FROM state WHERE census_region IN ('West','South');

-- The number of cities with populations greater than 1 million
SELECT COUNT(*) AS cities_over_1mil FROM city WHERE population > 1000000;

-- The number of state nicknames.
SELECT COUNT(state_nickname) FROM state;
SELECT COUNT(*) AS states FROM state;

-- The area of the smallest and largest parks.
SELECT MIN(area) as smallest_area, MAX(area) as largest_area FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT state_abbreviation, COUNT(*) AS cities FROM city GROUP BY state_abbreviation ORDER BY cities DESC;
-- Determine the average park area depending upon whether parks allow camping or not.
select has_camping, AVG(area) AS avg_park_area FROM park GROUP BY has_camping;

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT state_abbreviation, SUM(population) as state_pop FROM city GROUP BY state_abbreviation ORDER BY state_abbreviation;

-- The smallest city population in each state ordered by city population.
SELECT state_abbreviation, MIN(population) as min_pop FROM city GROUP BY state_abbreviation ORDER BY min_pop;
-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)



-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,
SELECT state_abbreviation, MIN(population) AS min_pop FROM city GROUP BY state_abbreviation ORDER BY min_pop;

-- Include the names of the smallest and largest parks


-- List the capital cities for the states in the Northeast census region.

