-- Liste as categorias de filmes disponíveis em ordem alfabética

SELECT 
	category_id, name 
FROM category
ORDER BY name;

-- Liste a quantidade de cidades cadastradas

SELECT
	COUNT(city) AS city_count
FROM city;

-- Liste todos os nomes dos países que iniciam com a letra B em ordem decrescente

SELECT country
FROM country 
WHERE 
	country LIKE 'B%'
ORDER BY 
	country DESC;

-- Liste o nome e sobrenome dos clientes em apenas uma coluna chamada nome completo

SELECT 
	CONCAT(first_name, ' ', last_name) AS full_name
FROM customer;

-- Liste os sobrenomes distintos dos clientes

SELECT DISTINCT last_name
FROM customer;

-- Liste a quantidade de filmes e o ano em que foi lançado

SELECT 
	COUNT(title),
	release_year
FROM film
GROUP BY release_year
ORDER BY release_year;

-- Liste os títulos e as descrições dos filmes que a taxa de aluguel (rental_rate) seja maior ou igual a 3.50 e a nota (rating) seja R ou G

SELECT title, description
FROM film
WHERE 
	rental_rate >= 3.50
	AND rating IN ('R', 'G');

-- Liste o titulo, descrição, ano de lançamento e o nome da linguagem do filme JUMANJI BLADE

SELECT
	film.title,
  film.description,
  film.release_year,
  language.name AS language_name
FROM
	film
JOIN language ON
	film.language_id = language.language_id
WHERE
	film.title = 'AIRPORT POLLOCK'
-- Engraçado, esse título não existe, vou procurar algum que exista --	
  -- film.title = 'JUMANGI BLADE'

-- Obtenha o top 7 maiores valores (amount) de pagamento e liste o valor e o primeiro nome do cliente

SELECT 
	payment.amount, 
  customer.first_name
FROM 
	payment
JOIN customer ON
	payment.customer_id = customer.customer_id
ORDER BY
	payment.amount DESC
LIMIT 7;

-- Liste o nome, sobrenome, endereço, telefone e a quantidade de alugueis (rental) realizadas pelo funcionário (staff)

SELECT
	staff.first_name,
  staff.last_name,
  address.address,
  address.phone,
  COUNT(rental.rental_id) AS movie_rentals
FROM
	staff
JOIN address ON
	staff.address_id = address.address_id
JOIN rental ON
	staff.staff_id = rental.staff_id
GROUP BY
	staff.staff_id,
  address.address,
  address.phone;
  