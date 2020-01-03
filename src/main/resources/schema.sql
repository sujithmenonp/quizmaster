create schema if not exists quiz_master;
create table if not exists quiz_master.guest (
     user_id varchar NOT NULL ,
     reg_time timestamp,
     name varchar,
     email varchar,
     pass varchar
);
create table if not exists quiz_master.question (
     question_id varchar NOT NULL,
     question varchar,
     is_active boolean
);
create table if not exists quiz_master.question_choice(
     choice_id varchar NOT NULL,
     question_id varchar,
     choice varchar,
     is_correct boolean
);
create table if not exists quiz_master.user_question_answer(
    user_id varchar NOT NULL,
    question_id varchar NOT NULL,
    choice_id uuid,
    is_correct boolean,
    answer_time integer
);