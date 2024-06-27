use test_db;
drop table accounts;

CREATE TABLE accounts (
	name VARCHAR(100) NOT NULL,
	balance INT NOT NULL
);

INSERT INTO accounts(name, balance) VALUES ('A', 10000);

SELECT * FROM accounts;

COMMIT;

BEGIN;
INSERT INTO accounts(name, balance) VALUES('B', 10000);
SELECT * FROM accounts;
ROLLBACK;
SELECT * FROM accounts;
COMMIT;

-- 실습
BEGIN;
INSERT INTO accounts(name, balance) VALUES ('B', 10000);
COMMIT;
SELECT * FROM accounts;

BEGIN;

UPDATE accounts SET balance = balance + 3000
WHERE name = 'A';

UPDATE accounts SET balance = balance - 3000
WHERE name = 'B';

COMMIT;
SELECT * FROM accounts;

set sql_safe_updates=0;

