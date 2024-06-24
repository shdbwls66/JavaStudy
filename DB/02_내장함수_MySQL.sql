use test_db;

-- address가 경으로 시작하는 데이터 출력 
SELECT *
FROM students
WHERE address LIKE '경%';

-- name이 이로 시작하는 학생
SELECT *
FROM students
WHERE name LIKE '이%';

-- name이 이로 시작하는 두글자
SELECT *
FROM students
WHERE name LIKE '이_'; -- 언더바는 글자 수 제한

-- 전라북도와 경기도에 거주하는 학생
SELECT *
FROM students
WHERE address IN ('전라북도', '경기도');

-- AND 사용
SELECT *
FROM students
WHERE address = '경기도' AND age = 29;

-- OR 사용
SELECT *
FROM students
WHERE address = '경기도' OR address = '전라북도';
-- WHERE address IN ('전라북도', '경기도'); 와 결과 같음

-- 부정 (<>, !=, NOT)
SELECT *
FROM students
WHERE NOT address = '경기도';

SELECT *
FROM students
WHERE address <> '경기도';

SELECT *
FROM students
WHERE address != '경기도';

-- null
insert into students(name, age, address)
values ('인간 1호', 23, null);

SELECT *
FROM students
WHERE address is null;

SELECT *
FROM students
WHERE address is not null;

-- sum
SELECT SUM(age)
FROM students;

-- avg
SELECT AVG(age)
FROM students;

-- max
SELECT MAX(age)
FROM students;

-- min
SELECT MIN(age)
FROM students;

-- count
SELECT COUNT(DISTINCT address)
FROM students;

SELECT CONCAT(name, '(', age, ')')
FROM students;

-- length
SELECT address, LENGTH(address)
FROM students;

-- 거주지 글자수가 3 초과하는 것
SELECT *
FROM students
WHERE char_length(address) > 3; -- mySQL의 LENGTH은 바이트 수 출력

-- replace
SELECT REPLACE(address, '기도', '특별시')
FROM students;

-- now
SELECT NOW();

-- subdate
SELECT subdate(now(), interval 1 year);
SELECT subdate(now(), interval 1 month);
SELECT subdate(now(), interval 1 day);

DELETE
FROM students;

set sql_safe_updates=0;

