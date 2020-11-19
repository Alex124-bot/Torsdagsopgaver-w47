USE sakila;
SELECT first_name, last_name FROM actor WHERE actor_id = "201";
UPDATE actor SET first_name = "Kølig",
last_name = "Kaj"
WHERE actor_id = "201";