create Database hotel;
create table roombooking (RoomNo varchar(10), Roomtype varchar(10), fare varchar(10),arrivaldate date,departuredate date,booked varchar(5));
create table CustomerRegistration (CustomerId varchar(10), name varchar(30),number varchar(15),email varchar(40),country varchar(40));
create table visitormanagement (name varchar(30),number varchar(15),email varchar(40),country varchar(40));
ALTER TABLE CustomerRegistration ADD PRIMARY KEY (CustomerId);

INSERT INTO roombooking values ('101','Deluxe','EUR 30',NULL,NULL,'no','yes'),('102','Deluxe','EUR 30',NULL,NULL,'no','yes'),('103','Deluxe','EUR 30',NULL,NULL,'no','yes'),('104','Deluxe','EUR 30',NULL,NULL,'no','yes'),('105','Deluxe','EUR 30',NULL,NULL,'no','yes'),('106','Deluxe','EUR 30',NULL,NULL,'no','yes'),('107','Deluxe','EUR 30',NULL,NULL,'no','yes'),('108','Deluxe','EUR 30',NULL,NULL,'no','yes');
INSERT INTO roombooking values ('201','Suite','EUR 90',NULL,NULL,'no','yes'),('202','Suite','EUR 90',NULL,NULL,'no','yes'),('203','Suite','EUR 90',NULL,NULL,'no','yes'),('204','Suite','EUR 90',NULL,NULL,'no','yes'),('205','Suite','EUR 90',NULL,NULL,'no','yes'),('206','Suite','EUR 90',NULL,NULL,'no','yes'),('207','Suite','EUR 90',NULL,NULL,'no','yes'),('208','Suite','EUR 90',NULL,NULL,'no','yes'),('209','Suite','EUR 90',NULL,NULL,'no','yes'),('210','Suite','EUR 90',NULL,NULL,'no','yes');
INSERT INTO roombooking values ('001','Cottage','EUR 140',NULL,NULL,'no','yes'),('002','Cottage','EUR 140',NULL,NULL,'no','yes'),('003','Cottage','EUR 140',NULL,NULL,'no','yes'),('004','Cottage','EUR 140',NULL,NULL,'no','yes'),('005','Cottage','EUR 140',NULL,NULL,'no','yes'),('006','Cottage','EUR 140',NULL,NULL,'no','yes'),('007','Cottage','EUR 140',NULL,NULL,'no','yes');
