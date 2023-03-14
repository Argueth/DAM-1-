create user if not exists 'frodo'@'localhost' identified by '112233';
create user if not exists 'frodo'@'%' identified by '112233';
create user if not exists 'sam'@'localhost' identified by '112233';
create user if not exists 'sam'@'%' identified by '112233';
create user if not exists 'gollum'@'localhost' identified by '112233';
create user if not exists 'gollum'@'%' identified by '112233';


grant select, update on *.* to 'frodo'@'localhost';
grant select, update on *.* to 'sam'@'localhost';
grant select, update on *.* to 'gollum'@'localhost';
grant select on *.* to 'frodo'@'%';
grant select on *.* to 'sam'@'%';
grant select on *.* to 'gollum'@'%';
flush privileges;


show grants for 'frodo'@'localhost';
show grants for 'frodo'@'%';
show grants for 'sam'@'localhost';
show grants for 'sam'@'%';
show grants for 'gollum'@'localhost';
show grants for 'gollum'@'%';


create user if not exists 'galadriel'@'localhost' identified by '112233';
create user if not exists 'galadriel'@'%' identified by '112233';
grant select, update, delete, insert on musica.* to 'galadriel'@'localhost';
grant select, update, delete, insert on biblioteca.libro to 'galadriel'@'%';
flush privileges;
show grants for 'galadriel'@'localhost';
show grants for 'galadriel'@'%';

select user, host from mysql.user where user = 'frodo' or user = 'sam' or user = 'gollum' or user = 'galadriel';
revoke select, update on *.* from 'frodo'@'localhost';
revoke select on *.* from 'frodo'@'%';
revoke select, update on *.* from 'sam'@'localhost';
revoke select on *.* from 'sam'@'%';
revoke select, update on *.* from 'gollum'@'localhost';
revoke select on *.* from 'gollum'@'%';
revoke select, update, delete, insert on musica.* from 'galadriel'@'localhost';
revoke select, update, delete, insert on biblioteca.libro from 'galdriel'@'%';
flush privileges;
drop user 'frodo'@'localhost';
drop user 'frodo'@'%';
drop user 'sam'@'localhost';
drop user 'sam'@'%';
drop user 'gollum'@'localhost';
drop user 'gollum'@'%';
drop user 'galadriel'@'localhost';
drop user 'galadriel'@'%';