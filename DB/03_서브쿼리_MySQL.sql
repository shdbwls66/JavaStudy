SELECT name, age, (select avg(age) from students) as avg_age
FROM students
where age < 30;

SELECT *
FROM (
	SELECT * FROM CLASSES
    WHERE CLASS_NAME IN('데이터베이스', '알고리즘')
) AS A;

SELECT name, age, address
from students
WHERE NAME IN (
	SELECT NAME
	FROM CLASSES
    WHERE CLASS_NAME IN ('데이터베이스', '알고리즘')
);