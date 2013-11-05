create table if not exists address(id varchar(36) not null, userid varchar(36) not null, strnum varchar(10), strname varchar(50), city varchar(30), state varchar(30), zip varchar(10), primary key(id), foreign key(userid) references user(id));
create trigger address_uid_on_insert before insert on address for each row set NEW.id=uuid();


Insert into "address" ("id","userid","strnum","strname","city","state","zip") values ('76ce3ab6-4266-11e3-ba33-baef7faeea8b','f781d91a-424d-11e3-ba33-baef7faeea8b','5709','Rain Creek Pkwy','Austin','Texas','78759');
Insert into "address" ("id","userid","strnum","strname","city","state","zip") values ('88697eb6-4266-11e3-ba33-baef7faeea8b','f781d91a-424d-11e3-ba33-baef7faeea8b','9879','Blah Rd','Austin','Texas','78759');
Insert into "address" ("id","userid","strnum","strname","city","state","zip") values ('a108fd34-4266-11e3-ba33-baef7faeea8b','fda6a50a-424d-11e3-ba33-baef7faeea8b','5709','Rain Creek Pkwy','Austin','Texas','78759');
Insert into "address" ("id","userid","strnum","strname","city","state","zip") values ('b550680e-4266-11e3-ba33-baef7faeea8b','fda6a50a-424d-11e3-ba33-baef7faeea8b','777','Creek Drive Way','Austin','Texas','78750');
Insert into "address" ("id","userid","strnum","strname","city","state","zip") values ('e24100fe-4265-11e3-ba33-baef7faeea8b','924fb58e-4082-11e3-a76c-7a5d62d40185','5709','Rain Creek Pkwy','Austin','Texas','78759');
Insert into "address" ("id","userid","strnum","strname","city","state","zip") values ('f09c4f8c-4265-11e3-ba33-baef7faeea8b','924fb58e-4082-11e3-a76c-7a5d62d40185','123','Some St','Austin','Texas','78759');


create table if not exists address(id varchar(36) not null, fname varchar(30) not null, mname varchar(30), lname varchar(30) not null, primary key(id));
create trigger user_uid_on_insert before insert on user for each row set New.id=uuid();

Insert into "user" ("id","fname","mname","lname") values ('924fb58e-4082-11e3-a76c-7a5d62d40185','Thu','P','Doan');
Insert into "user" ("id","fname","mname","lname") values ('f781d91a-424d-11e3-ba33-baef7faeea8b','Natalie','M','Kane');
Insert into "user" ("id","fname","mname","lname") values ('fda6a50a-424d-11e3-ba33-baef7faeea8b','Noah','M','Doan');