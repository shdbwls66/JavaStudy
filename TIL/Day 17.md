# DB 기초
## 데이터베이스
여러 사람들이 공유할 목적으로 통합, 관리하는 데이터의 집합

데이터를 쌓는 창고 역할

### DBMS
데이터베이스 관리 시스템

이름 그대로 데이터베이스와 데이터를 제어, 관리함



### 데이터베이스 용어
- **테이블**

  - 데이터베이스에서 데이터를 구성하기 위한 가장 기본적인 단위

  - 행과 열로 구성, 행은 여러 속성으로 구성

- **행**

  - 테이블의 가로로 배열된 데이터의 집합
  
  - 행은 반드시 고유한 식별자인 기본키를 가짐
  
  - 레코드 라고도 부름

- **열**

  - 행에 저장되는 유형의 데이터
  
  - 각 요소에 대한 속성을 나타내며 무결성 보장

- **기본키**

  - 행을 구분할 수 있는 식별자
  
  - **테이블에서 유일**해야 하며, 중복 값 가질 수 없음
  
  - 데이터를 수정하거나 삭제하고 조회할 때 사용
  
  - 다른 테이블과 관계를 맺어 데이터를 가져올 수 있음
  
  - 수정 X, 유효한 값(null X)


## SQL
데이터베이스에서 데이터를 추가, 조회, 수정, 삭제할 때 사용하는 언어

- `CRUD` : `추가(Create), 조회(Read), 수정(Update), 삭제(Delete)의 앞 글자를 딴 것

### 명령어 종류
SQL 명령어는 목적에 따라 크게 세 가지로 구분

- **DDL**

  - 데이터베이스나 테이블 등을 생성, 삭제하거나 그 구조를 변경하기 위한 명령어
  
  - 주요 명령어: `CREATE`, `ALTER`, `DROP` 등

- **DML**

  - 데이터베이스에 저장된 데이터를 처리하거나 조회, 검색하기 위한 명령어
  
  - 주요 명령어: `INSERT`, `UPDATE`, `DELETE`, `SELECT` 등

- **DCL**

  - 데이터베이스에 저장된 데이터를 관리하기 위하여 데이터의 보안성 및 무결성 등을 제어하기 위한 명령어
  
  - 주요 명령어: `GRANT`, `REVOKE` 등



## RDBMS (관계형 데이터베이스)
데이터를 2차원의 테이블 구조로 저장

사람이 쉽게 읽을 수 있는 형태로 데이터를 다루어 관리가 쉬움

### 테이블
테이블은 행과 열로 구성된 자료구조

| 학번 | 이름 | 학과 번호 |
| --- | --- | --- |
| 20200123 | 김땡땡 | 01 |
| 20190234 | 박땡땡 | 02 |

작성된 테이블에서 행은 각 학생을 나타내고 열은 학생의 속성을 나타냄

또한 여기서 학번은 학생의 고유 식별자


### 관계형 데이터베이스의 특징

관계형 데이터베이스는 테이블 간의 관계를 정의하여, 데이터 사이의 연관성을 표현

테이블 간 관계:

- 1 : 1 관계: 한 개의 행이 다른 한 개의 행에 대응
- 1 : N 관계 : 일 대 다 관계. 한 개의이 다른 여러 개의 행에 대응
- N : M 관계: 다 대 다 관계. 여러 개의 행이 다른 여러 개의 행에 대응

일 대 다 관계를 한번 표현 해보면..

- 학생 (여기가 N)

| 학번(기본키) | 이름 | 학과 번호 | 전화 번호 |
| --- | --- | --- | --- |
| 20200123 | 김땡땡 | 01 | 010-1234-1234 |
| 20190234 | 박땡땡 | 02 | 010-3434-1234 |
| 20200278 | 노유진 | 02 | 010-1234-6767 |

- 학과 테이블 (여기가 1)

| 학과 번호(기본키) | 학과명 |
| --- | --- |
| 01 | 영어영문 |
| 02 | 경영정보 |



# DML
데이터를 조작하는데 사용되는 명령어

데이터를 조회, 삽입, 수정, 삭제 시킴

**DML 실습 환경 세팅**

```SQL
-- 데이터베이스 생성
CREATE database test_db;students
use test_db;

-- 테이블 생성
CREATE TABLE students (
	name VARCHAR(255) NOT NULL,
  age INT NOT NULL,
  address VARCHAR(255)
);

-- 데이터 삽입
INSERT INTO students (name, age, address) VALUES
('이황', 28, '경상북도'),
('정약용', 29, '경기도'),
('김정호', 30, '전라북도'),
('박지원', 31, '전라북도'),
('김홍도', 32, '경기도'),
('신윤복', 33, '서울특별시'),
('김광균', 34, '서울특별시'),
('한용운', 35, '경상남도'),
('박두진', 36, '경기도');
```


## SELECT
`SELECT`, `FROM`, `WHERE` 이용해 **데이터 조회**

```sql
SELECT 조회할 열 (전체 조회는 *)
FROM 조회할 테이블
WHERE 데이터 필터링
```

### 모든 열 조회
students 테이블 조회

```sql
-- 테이블 출력
SELECT * 
FROM students;
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/3511c13e-86ec-475f-92ac-f3ec327dc4b2)


### 특정 열 조회
`SELECT` 옆에 조회할 열 입력

```sql
-- 테이블 출력
SELECT name, age
FROM students;
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/8fd9d5e6-7ef7-4210-8db5-f5b55aaf016b)


### 열 이름 변경하여 출력
`AS` 이용

```sql
-- 테이블 출력
SELECT name AS col1, age AS col2
FROM students;
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/818c4155-832a-43f6-8a08-380f603eeceb)


### 조건 사용하여 데이터 필터링
`WHERE` 옆에 조건 작성

```sql
-- 테이블 출력
SELECT * 
FROM students
WHERE age >=33;
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/8c03da33-98b3-404b-a330-6f32431f6227)


```sql
-- 테이블 출력
SELECT * 
FROM students
WHERE address = '서울특별시';
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/e8afd084-a02c-432b-86d5-104d76791e8c)


### 중복된 행 제거
`DINSTINCT` 사용

```sql
-- 테이블 출력
SELECT DISTINCT address
FROM students
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/205ce6fb-416a-4e62-9ff3-e8686a535ab6)



## INSERT
`INSERT INTO` 문에 삽입할 열 선택하고 VALUES문에 삽입할 데이터를 입력

### 한 행 삽입

```sql
INSERT INTO students (name, age, address)
VALUES('노유진', 25, '울산광역시');
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/33554c15-7043-4dd3-adc0-38187c14c099)


### 특정 열만 삽입
INSERT INTO 문에서 선택되지 않은 열엔 NULL값 들어감
단, 테이블 생성할 때 NULL 값을 허용하지 않는 컬럼일 경우 무조건 데이터 값을 삽입 해야함

```sql
-- address 열만 null 값 허용하도록 테이블 재생성 하였음
INSERT INTO students (name, age)
VALUES('이땡땡', 30);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/11bee0f4-5793-4d16-a05a-a84b6cda5ab2)


### 여러 행 삽입
여러 행 한꺼번에 삽입 가능

```sql
INSERT INTO students (name, age, address)
VALUES('서땡땡', 24, '울산광역시'), ('김빡빡', 20, '울산광역시');
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/43a9f446-cc01-4951-aa7c-dbbfa94af5ae)


### 조회 후 삽입
INSERT문에 SELECT문을 추가하여 테이블 조회 후 필터링 한 걸 삽입

```sql
-- 나이가 30 미만인 학생들을 삽입
INSERT INTO students(name, age, address)
SELECT name, age, address FROM students WHERE age < 30;
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/b93b9bfd-db20-4014-a745-05223f16f787)



## UPDATE
`UPDATE`, `SET`, `WHERE` 세 가지를 사용하여 **데이터 수정**

### 필드 하나 수정
박두진 이라는 이름을 가진 학생의 나이를  36 → 33으로 수정

```sql
UPDATE students
SET age = 33
WHERE name = '박두진';
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/8e06fa1b-4a47-4fd1-8372-363d832deebd)


### 필드 여러 개 수정
이름이 이황인 학생의 나이는 46, 주소는 경기도로 수정

```sql
UPDATE students
SET age = 46,
    address = '경기도'
WHERE name = '이황';
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/0af4731b-05cc-4821-854a-44452cd670e5)


### 조건부 수정

나이가 29살 미만인 학생들의 주소를 ‘경기도’ 로 수정

```sql
UPDATE students
SET address = '경기도'
WHERE age < 29;
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/fa785cba-c6c8-4a3f-92ae-0267347553e5)



## DELETE
`DELETE FROM` `WHERE` 을 사용해 **데이터 삭제**

### 특정 행 삭제
노유진 이라는 이름을 가진 학생 삭제

```sql
DELETE
FROM students
WHERE name = '노유진';
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/1d8bc1db-87e6-46fe-b855-4ff87ab0da97)


### 여러 행 삭제
`BETWEEN AND` 사용

```sql
DELETE
FROM students
WHERE age BETWEEN 30 AND 45;
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/f6993d19-a9b3-433e-8340-87d7c9487a37)


### 모든 행 삭제

```sql
DELETE
FROM students;
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/73941683-1c39-48a6-9ca1-5c4dcd5059d5)

<hr>

# 참고
UPDATE문이나 DELETE문을 실행할 때 오류가 발생할 수 있음
```
Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column.
To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.
```

그럴 때 아래 코드를 실행하면 문제없이 UPDATE문과 DELETE문 사용 가능
```sql
set sql_safe_updates=0;
```
