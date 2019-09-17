CREATE TABLE SHOP (
  ID LONG  Primary key not null,
  name CHAR(50) ,
  tel CHAR(25) );


INSERT INTO shop(ID,name, tel) VALUES (1,'Київська,88','0988467236');
INSERT INTO shop(ID,name, tel) VALUES (2,'Бульвар Польський 13а','0983995114');
INSERT INTO shop(ID,name, tel) VALUES (3,'Хлібна,39/19','0971146295');
INSERT INTO shop(ID,name, tel) VALUES (4,'М-н Станишівський,3/2','0986408197');
INSERT INTO shop(ID,name, tel) VALUES (5,'пр-т Миру,61/2','0971084756');
INSERT INTO shop(ID,name, tel) VALUES (6,'Вільський Шлях,14','0985660818');
INSERT INTO shop(ID,name, tel) VALUES (7,'Івана Мазепи,5','0985660818');

COMMIT ;