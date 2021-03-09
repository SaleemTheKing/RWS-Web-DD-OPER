-- !Ups

create table if not exists Bookmarks
(
    id              bigint primary key,
    gebruiker_email varchar references gebruiker(email)
);
