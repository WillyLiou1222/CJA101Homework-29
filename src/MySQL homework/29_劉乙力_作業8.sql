-- 1. 利用下列資料來新建DEPARTMENT資料表。
CREATE TABLE DEPARTMENT
( id int not null,
  name varchar(24) not null
);
DESC DEPARTMENT;
-- 2. 利用DEPT資料表中的資料，將資料新增至DEPARTMENT資料表中(只新增相對的資料欄)。(回到P315頁)
INSERT INTO department(id,name)
    SELECT deptno, dname
    FROM dept;
select * from department;
-- 3. 利用下列資料來新建EMPLOYEE資料表。department
CREATE TABLE EMPLOYEE
( id int not null,
  last_name varchar(24) not null,
  first_name varchar(24) ,
  dept_id int
);
DESC EMPLOYEE;
--  4. 將EMPLOYEE資料表中last_name欄位的資料型態更改為varchar(40)。(alter teble modify)
ALTER TABLE EMPLOYEE MODIFY COLUMN last_name varchar(40);
-- 5. 使用EMP資料表的結構中之EMPNO, ENAME及DEPTNO之定義來新建EMPLOYEE2資料表，並將欄位名稱設定為ID, LAST_NAME及DEPT_ID。(P.363)
CREATE TABLE EMPLOYEE2
  AS
  SELECT EMPNO AS ID, ENAME AS LAST_NAME, DEPTNO AS DEPT_ID
    FROM emp;
DESC EMPLOYEE2;
-- 6. 刪除整個EMPLOYEE資料表。(Drop)
DROP TABLE EMPLOYEE;
-- 7. 將EMPLOYEE2資料表改名為EMPLOYEE。
ALTER TABLE EMPLOYEE2
RENAME TO EMPLOYEE;
-- 8. 將EMPLOYEE資料表中的LAST_NAME欄位刪除。
ALTER TABLE EMPLOYEE DROP COLUMN LAST_NAME;
DESC EMPLOYEE;
-- 9. 修改EMPLOYEE資料表，新增一個欄位SALARY 資料型態為INT。
 ALTER TABLE EMPLOYEE
   ADD SALARY int;
 DESC EMPLOYEE;
-- 10. 修改EMPLOYEE資料表，使用ID欄位新增一個Primary key的限制條件(constraint)，並為他命名。
ALTER TABLE EMPLOYEE
  ADD CONSTRAINT PK_EMPLOYEE_ID PRIMARY KEY(id);
SHOW INDEXES FROM employee;
-- 11. 在EMPLOYEE資料表新增一個外來鍵(foreign key)以確保員工不會被分派到一個不存在的部門。(參考dept的deptno欄位)
ALTER TABLE EMPLOYEE
  ADD CONSTRAINT FK_EMPLOYEE_DEPTID FOREIGN KEY(dept_id)
 REFERENCES DEPT(DEPTNO);
SHOW INDEXES FROM employee;