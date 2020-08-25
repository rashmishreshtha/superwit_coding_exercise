/*
Second Highest Salary
Write a SQL query to get the second highest salary from the Employee table.
Using nested query, returns null when only one salary record or salaries of all employees are equal;
 */
SELECT MAX(Salary)
FROM Salary s
WHERE Salary < (SELECT MAX(Salary) FROM Salary);
