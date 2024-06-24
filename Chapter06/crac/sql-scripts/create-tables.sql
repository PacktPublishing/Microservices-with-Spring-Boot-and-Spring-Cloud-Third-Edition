#
# Created with the command:
#
#   SPRING_PROFILES_ACTIVE=create-ddl-script java -jar microservices/review-service/build/libs/review-service-1.0.0-SNAPSHOT.jar
#
create table reviews (id integer not null, product_id integer not null, review_id integer not null, version integer not null, author varchar(255), content varchar(255), subject varchar(255), primary key (id)) engine=InnoDB;
create table reviews_seq (next_val bigint) engine=InnoDB;
insert into reviews_seq values ( 1 );
alter table reviews add constraint reviews_unique_idx unique (product_id, review_id);
