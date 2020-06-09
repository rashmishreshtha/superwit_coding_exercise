DROP TABLE IF EXISTS Person;
CREATE TABLE IF NOT EXISTS Person (
  PersonId int PRIMARY KEY,
  FirstName varchar(50),
  LastName varchar(50)
);

DROP TABLE IF EXISTS Address;
CREATE TABLE IF NOT EXISTS Address (
  AddressId int PRIMARY KEY,
  PersonId int,
  City varchar(50) NOT NULL,
  State varchar(50),
  FOREIGN KEY (personid) REFERENCES Person (PersonId)
);

INSERT INTO Person (PersonId,
FirstName,
LastName)
  VALUES (1, 'Peter', 'Chan'),
  (2, 'Ram', 'Seth'),
  (3, 'Sita', 'Setu')
;

INSERT INTO Address (AddressId,
PersonId,
City,
State)
  VALUES (1, 1, 'Los Angeles', 'CA'),
  (2, 1, 'Stevenson Ranch', 'CA'),
  (3, 2, 'Vermont', 'TX');
