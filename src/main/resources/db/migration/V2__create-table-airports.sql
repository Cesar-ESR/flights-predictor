create table airports (

    id bigint not null  auto_increment,
    airport_iata char(3) not null,
    airport_name varchar(255),
    country_name varchar(50),
    city_name varchar(100),
    latitude decimal(9.6) not null,
    longitude decimal(9.6) not null,
    elevation int(4),
    timezone varchar(50),
    googleMaps varchar(255),

    primary key(id)

);