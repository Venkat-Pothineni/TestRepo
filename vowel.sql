/*
    STATION table has id and city and country columns
	find the city names start and ends with vowel
*/
SELECT DISTINCT city
FROM station
WHERE LOWER(city) REGEXP '^[aeiou].*[aeiou]$';