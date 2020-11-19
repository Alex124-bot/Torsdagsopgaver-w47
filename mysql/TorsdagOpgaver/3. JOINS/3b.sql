USE sakila;
SELECT * FROM film AS f
JOIN film_category AS fc ON fc.film_id = category.category_id;