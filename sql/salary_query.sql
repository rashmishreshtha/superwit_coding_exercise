SELECT MAX(Salary)
FROM Salary s
WHERE Salary < (SELECT MAX(Salary) FROM Salary);
