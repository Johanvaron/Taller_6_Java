CREATE DATABASE db_boards;
USE db_boards;

CREATE TABLE users_tbl (
  user_id INT PRIMARY KEY,
  user_firstname VARCHAR(40) NOT NULL,
  user_lastname VARCHAR(40) NOT NULL,
  user_email VARCHAR(60) NOT NULL,
  user_password VARBINARY(256)
);

INSERT INTO users_tbl (user_firstname, user_lastname, user_email, user_password)
VALUES (UPPER('JOHAN'), UPPER('VARON'), 'JohanVaron@Varon.com',AES_ENCRYPT('!sbqjI393tUt','$2a$12$YDZbqlsHT3gWBDDqISjhouN9ZbCZfa/T4cSSY.BDRsIE9O7Gtq3H2'));

SELECT * FROM users_tbl;

SELECT *,
 CAST(AES_DECRYPT(user_password,
'$2a$12$YDZbqlsHT3gWBDDqISjhouN9ZbCZfa/T4cSSY.BDRsIE9O7Gtq3H2') AS CHAR(50))
end_data FROM users_tbl WHERE user_id = 0;