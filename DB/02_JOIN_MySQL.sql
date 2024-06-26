use test_db;
SELECT *
FROM students AS A INNER JOIN classes AS B
	ON A.name = B.name;

SELECT *
FROM students AS A LEFT OUTER JOIN classes AS B
	ON A.name = B.name;

SELECT *
FROM students AS A RIGHT OUTER JOIN classes AS B
	ON A.name = B.name;