CREATE DATABASE Company;
USE Company;

/* creating employee table */

CREATE TABLE Employees (
e_id INT PRIMARY KEY AUTO_INCREMENT,
e_name VARCHAR(255) NOT NULL,
gender CHAR(1) NOT NULL,
e_address VARCHAR(255) NOT NULL,
e_designation VARCHAR(255) NOT NULL,
salary INT NOT NULL
);
/* inserting values */

INSERT INTO Employees(e_name, gender, e_address, e_designation, salary) VALUES
('Rahul','M','chrompet','trainee',5000),
('Ranjith','M','kovilinchery','trainee',5000),
('Sathish','M','pallavaram','trainee',5000),
('Surya','M','porur','trainee',5000),
('Tejas','M','gundy','trainee',5000);

SELECT * FROM Employees;

UPDATE Employees SET salary = 8000 WHERE e_id=4;

DELETE FROM Employees WHERE e_id=5;

INSERT INTO Employees(e_name, gender, e_address, e_designation, salary) VALUES
('shankar','M','velachery','trainee',8000);

ALTER TABLE Employees ADD active_status VARCHAR(255);

UPDATE Employees SET active_status='yes' WHERE e_id=1;
UPDATE Employees SET active_status='no' WHERE e_id=2;
UPDATE Employees SET active_status='yes' WHERE e_id=3;
UPDATE Employees SET active_status='yes' WHERE e_id=4;
UPDATE Employees SET active_status='yes' WHERE e_id=6;

DELETE FROM Employees WHERE active_status='no';

SELECT * FROM Employees;



