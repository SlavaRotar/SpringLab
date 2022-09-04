drop table if exists cartoons cascade;
drop table if exists day_of_week cascade;
drop table if exists employee cascade;
drop table if exists films cascade;
drop table if exists license cascade;
drop table if exists news cascade;
drop table if exists show cascade;
drop sequence if exists employee_sequence;
drop sequence if exists id;
create sequence employee_sequence start 1 increment 1;
create sequence id start 1 increment 1;

create table cartoons
(id int8 not null,
name varchar(255),
primary key (id));

create table day_of_week
(id int8 not null,
day varchar(255),
primary key (id));

create table employee
(id int8 not null,
dob date,
name varchar(255),
position varchar(255),
primary key (id));

create table films
(id int8 not null,
name varchar(255),
primary key (id));

create table license
(id int8 not null,
date date,
license_date int4,
name varchar(255),
primary key (id));
create table news
(id int8 not null,
airtime time,
day varchar(255),
name varchar(255),
primary key (id));

create table show
(id int8 not null,
name varchar(255),
primary key (id));