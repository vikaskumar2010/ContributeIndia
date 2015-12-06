create database contributeindia;

use contributeindia;

create table user_details(
	email_id VARCHAR(50) PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    address VARCHAR(255),
    city VARCHAR(50),
    pincode VARCHAR(10),
    state VARCHAR(50),
    tags VARCHAR(255)
    
);

INSERT INTO user_details (email_id,first_name,last_name,address,city,pincode,state,tags)
VALUES ('vikaskumar2010@gmail.com','Vikas','Kumar','Thimmareddy lane','Bangalore','560017','Karnataka','TEACHING');

SELECT * FROM user_details;