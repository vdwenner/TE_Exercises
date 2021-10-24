SELECT s.*, p.park_id, park_name, date_established, p.area as park_area, has_camping   
FROM
        state S
        LEFT OUTER JOIN park_state ps
                ON ps.state_abbreviation = s.state_abbreviation
                LEFT OUTER JOIN park p 
                        ON P.park_id = ps.park_id
ORDER BY
        s.state_abbreviation,  p.date_established, p.park_name;

/*
CREATE VIEW state_parks AS
SELECT s.*, p.park_id, park_name, date_established, p.area as park_area, has_camping   
FROM
        state S
        LEFT OUTER JOIN park_state ps
                ON ps.state_abbreviation = s.state_abbreviation
                LEFT OUTER JOIN park p 
                        ON P.park_id = ps.park_id
ORDER BY
        s.state_abbreviation, p.date_established, p.park_name;*/
        
SELECT * FROM state_parks WHERE state_abbreviation = 'CA';

SELECT * FROM city WHERE state_abbreviation = 'CA';

SELECT (SELECT count(*) FROM state_parks WHERE state_abbreviation = 'CA') * (SELECT COUNT(*) FROM city WHERE state_abbreviation = 'CA');

--DROP VIEW state_parks

SELECT c.*, sp.*
FROM city c
        LEFT OUTER JOIN state_parks sp
                ON sp.state_abbreviation = c.state_abbreviation
WHERE sp.state_abbreviation = 'CA'                