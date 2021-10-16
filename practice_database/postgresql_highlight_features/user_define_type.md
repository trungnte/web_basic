### CREATE TABLE without DOMAIN

CREATE TABLE mailing_list(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR NOT NULL,
	last_name VARCHAR NOT NULL,
	email VARCHAR NOT NULL,
	
	CHECK(
		first_name !~ '\s'
		AND last_name !~ '\s'
	)
);

### CREATE TABLE with DOMAIN

CREATE DOMAIN contact_name AS
	VARCHAR NOT NULL CHECK (value !~ '\s');
	
CREATE TABLE mailing_list_w_domain(
	id SERIAL PRIMARY KEY,
	first_name contact_name,
	last_name contact_name,
	email VARCHAR NOT NULL
);

# Test Domain:

Jame V with a whitespace

INSERT INTO mailing_list_w_domain (first_name, last_name, email)
	VALUES('Jame V','Doe','jame.doe@example.com');

```sh
ERROR:  value for domain contact_name violates check constraint "contact_name_check"
SQL state: 23514
```


### TYPE


CREATE TYPE film_summary AS (
	film_id INT,
	title VARCHAR,
	release_year SMALLINT
);

CREATE OR REPLACE FUNCTION get_film_summary(f_id INT)
	RETURNS film_summary AS
$$
SELECT
	film_id,
	title,
	release_year
FROM
	film
WHERE
	film_id = f_id ;
$$
LANGUAGE SQL;

## use function

SELECT * FROM get_film_summary (40);

psql:\dT 