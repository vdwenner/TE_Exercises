CREATE TABLE artist (
artist_id integer NOT NULL,
painting_id integer NOT NULL,
CONSTRAINT pk_artist_artist_id_painting_id PRIMARY KEY (artist_id, painting_id)
);

CREATE TABLE painting (
painting_id integer NOT NULL,
painting_name varchar(33) NOT NULL,
painting_description varchar(512),
CONSTRAINT pk_painting_painting_id_painting_name_painting_description PRIMARY KEY (painting_id, painting_name, painting_description)
);

CREATE TABLE customer (
customer_id integer NOT NULL,
customer_name integer NOT NULL,
customer_phone varchar (14),
customer_address varchar (200),
CONSTRAINT pk_customer_customer_id_customer_name_customer_phone_customer_address PRIMARY KEY (customer_id, customer_name, customer_phone, customer_address)
);

CREATE TABLE transaction_list (
transaction_id integer NOT NULL,
customer_id integer NOT NULL,
painting_id integer NOT NULL,
CONSTRAINT pk_transaction_list_transaction_id_customer_id_painting_id PRIMARY KEY (transaction_id, customer_id, painting_id)
);

ALTER TABLE painting
ADD FOREIGN KEY(artist_id)
REFERENCES artist(artist_id);

ALTER TABLE transaction_list
ADD FOREIGN KEY(painting_id)
REFERENCES painting(painting_id);

ALTER TABLE transaction_list
ADD FOREIGN KEY(customer_id)
REFERENCES customer(customer_id)




