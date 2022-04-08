--insert data in user table
insert into user values(101, sysdate(), 'AB');
insert into user values(102, sysdate(), 'Jill');
insert into user values(103, sysdate(), 'Jam');
-- insert data in post table, also mapping it to user table
insert into post values(1101,'1st Post',101);
insert into post values(1103,'3rd Post',103);