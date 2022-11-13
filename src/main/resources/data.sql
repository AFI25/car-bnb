create table cars (
        id bigint auto_increment,
    user_id int NOT NULL,
    model varchar (255) NOT NULL,
    make varchar (255) NOT NULL,
    year_of_car varchar (255) NOT NULL,
    DESCRIPTION varchar (255) NOT NULL,
    primary Key (id)
);