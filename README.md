# jsf_internship

16-JsfLoginMysql

Step 1: Create the table Users in mysql database as:
CREATE TABLE Users( 
uid int(20) NOT NULL AUTO_INCREMENT, 
uname VARCHAR(60) NOT NULL, 
password VARCHAR(60) NOT NULL, 
PRIMARY KEY(uid));

Step 2: Insert data into the table Users as;
INSERT INTO Users VALUES(1,'adam','adam');
