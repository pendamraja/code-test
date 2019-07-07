create table User_service(uid SERIAL PRIMARY KEY,username varchar NOT NULL,password varchar,organization varchar,role varchar);

create table User_information(uid SERIAL PRIMARY KEY,username varchar NOT NULL,interests varchar,address varchar,salary NUMERIC (5, 2),experience varchar);

select * from User_service;

drop table User_information;
