-- 테이블 출력
SELECT * 
FROM students;

SELECT name, age
FROM students;

SELECT name AS col1, age AS col2
FROM students;

SELECT * 
FROM students
WHERE address = '서울특별시';

SELECT DISTINCT address
FROM students;

INSERT INTO students (name, age, address)
VALUES('노유진', 25, '울산광역시');

INSERT INTO students (name, age)
VALUES('이땡땡', 30);

INSERT INTO students (name, age, address)
VALUES('서땡땡', 24, '울산광역시'), ('김빡빡', 20, '울산광역시');

INSERT INTO students(name, age, address)
SELECT name, age, address FROM students WHERE age < 30;

UPDATE students
SET age = 33
WHERE name = '박두진';

UPDATE students
SET age = 46,
    address = '경기도'
WHERE name = '이황';

UPDATE students
SET address = '경기도'
WHERE age < 29;

DELETE
FROM students
WHERE name = '노유진';

DELETE
FROM students
WHERE age BETWEEN 30 AND 45;

DELETE
FROM students;

set sql_safe_updates=0;

