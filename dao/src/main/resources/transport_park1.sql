CREATE DATABASE transport_park;
USE transport_park;

CREATE TABLE `user` (id int auto_increment, first_name varchar(40) not null,
 second_name varchar(40) not null, `password` VARCHAR(30) not null,
 passport_id varchar(40) not null,
 country_of_residence varchar(30) not null, city_of_residence varchar(30) not null, home_address varchar(60) not null,
 phone_number varchar(40) not null, order_for_rent_id int, primary key (id),
 FOREIGN KEY (order_for_rent_id) REFERENCES order_for_rent(id));

CREATE TABLE `transport` (id int auto_increment, mark_id int not null,
 model varchar(40) not null, seat_id int not null, 
 number_of_doors int not null,
 description varchar(200) not null, price decimal(10, 4) not null,
 order_for_rent_id int,
 last_update timestamp not null, primary key (id),
 FOREIGN KEY (mark_id) REFERENCES mark(id),
 FOREIGN KEY (seat_id) REFERENCES seat(id),
 FOREIGN KEY (order_for_rent_id) REFERENCES order_for_rent(id));
 
 CREATE TABLE `seat` (id int auto_increment, `number` int, 
 comfort_type varchar(30), primary key (id)); 
 
 CREATE TABLE `transport_fuel_characteristic` (
 transport_id int not null, fuel_characteristic_id int not null,
 primary key (transport_id, fuel_characteristic_id),
 FOREIGN KEY (transport_id) REFERENCES transport(id),
 FOREIGN KEY (fuel_characteristic_id) REFERENCES fuel_characteristic(id));
 
CREATE TABLE `bus`(transport_id int , stay_positions int not null, primary key (transport_id),
FOREIGN KEY (transport_id) REFERENCES transport(id));

CREATE TABLE `truck`(transport_id int , tonnage int not null, primary key (transport_id),
FOREIGN KEY (transport_id) REFERENCES transport(id));

CREATE TABLE `car`(transport_id int , max_speed int not null, primary key (transport_id),
FOREIGN KEY (transport_id) REFERENCES transport(id));

CREATE TABLE `fuel_characteristic` (id int auto_increment,
 type_of_fuel varchar(20) not null, fuel_consumption double not null,
 primary key (id));

CREATE TABLE `mark` (id int auto_increment, `name` varchar(30) not null,
 primary key (id));

CREATE TABLE `order_for_rent`( id int auto_increment, 
start_time timestamp not null, end_time timestamp not null, 
last_update timestamp, primary key (id)); 