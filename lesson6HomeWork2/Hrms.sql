CREATE TABLE If Not Exists public.users
(
    id serial NOT NULL, 
    username varchar(30) NOT NULL,
    email varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    created_at date NOT NULL DEFAULT CURRENT_DATE,
    status boolean NOT NULL,
    CONSTRAINT pk_users PRIMARY KEY (id),
    CONSTRAINT uk_users_email UNIQUE (email),
    CONSTRAINT uk_users_username UNIQUE (username)
);

CREATE TABLE If Not Exists public.verifications
(
    id integer NOT NULL,
    email_activation_code varchar(50) NOT NULL,
    email_expiration_date timestamp(0) without time zone NOT NULL,
    is_confirmed boolean NOT NULL,
    confirmed_date date NOT NULL DEFAULT CURRENT_DATE,
    CONSTRAINT pk_verifications PRIMARY KEY (id)
);

CREATE TABLE If Not Exists public.employers
(
    user_id integer NOT NULL,
    verification_id integer NOT NULL,
    company_name varchar(100) NOT NULL,
    website_address varchar(100) NOT NULL,
    phone_number varchar(10) NOT NULL,
    is_activated boolean NOT NULL,
    CONSTRAINT pk_employers PRIMARY KEY (user_id),
    CONSTRAINT fk_employers_users FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT fk_employers_verifications FOREIGN KEY (verification_id)
        REFERENCES verifications (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

CREATE TABLE If Not Exists public.system_personnel
(
    user_id integer NOT NULL,
    first_name varchar(30) NOT NULL,
    last_name varchar(30) NOT NULL,
    CONSTRAINT pk_system_personnel PRIMARY KEY (user_id),
    CONSTRAINT fk_system_personnel_users FOREIGN KEY (user_id)
        REFERENCES users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE If Not Exists public.job_seekers
(
    user_id integer NOT NULL,
    first_name varchar(30) NOT NULL,
    last_name varchar(30) NOT NULL,
    nationality_id varchar(11) NOT NULL,
    year_of_birth integer NOT NULL,
    CONSTRAINT pk_job_seekers PRIMARY KEY (user_id),
    CONSTRAINT uk_job_seekers_nationality_id UNIQUE (nationality_id),
    CONSTRAINT fk_job_seekers_users FOREIGN KEY (user_id)
        REFERENCES users (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

CREATE TABLE If Not Exists public.job_positions
(
    id integer NOT NULL,
    name varchar(100) NOT NULL,
    CONSTRAINT pk_job_positions PRIMARY KEY (id),
    CONSTRAINT uk_job_positions_name UNIQUE (name)
);