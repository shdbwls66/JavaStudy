ALTER TABLE students
ADD grade VARCHAR(10);

SELECT * FROM students;

ALTER TABLE students
RENAME COLUMN grade TO great;

ALTER TABLE students
MODIFY COLUMN name INT;

ALTER TABLE students DROP COLUMN great;
ALTER TABLE students DROP COLUMN grade;

