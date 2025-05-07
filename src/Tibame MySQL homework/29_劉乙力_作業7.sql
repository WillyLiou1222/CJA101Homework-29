-- 1. 將下列的資料新增至MY_EMP 資料表中,不要列舉欄位。
INSERT INTO MY_EMP VALUES(1,'Patel','Ralph','rpatel',795);
select * from my_emp;
-- 2. 使用列舉欄位方式,將下列的資料新增至MY_EMP資料表中。
insert into my_emp (ID,LAST_NAME,FIRST_NAME,USERID,SALARY) VALUES(2,'Dancs','Betty','bdancs',860);
select * from my_emp;
-- 3. 將下列的資料新增至MY_EMP資料表中。
INSERT INTO MY_EMP
VALUES(3,'Biri','Ben','bbiri',1100),
      (4,'Newman','Chad','cnewman',750);
select * from my_emp;     
-- 4. 將員工編號為3的名字(last name)更改為Drexler。
 SET SQL_SAFE_UPDATES = 0;
update my_emp set last_name = 'Drexler' where ID = 3;
commit;
select * from my_emp; 
-- 5. 將薪資低於900元的所有員工薪資調整為1000元。
update my_emp set SALARY = 1000 where SALARY < 900;
commit;
select * from my_emp;
-- 6. 刪除Betty Dancs 的資料。
DELETE FROM my_emp WHERE LAST_NAME = 'Dancs' and FIRST_NAME = 'Betty';
select * from my_emp;
/*7.  啟動一個資料庫交易
將所有員工的薪資調升10%
設定一個交易儲存點
刪除所有MY_EMP資料表中的資料
確認資料已被你刪光了
放棄刪除資料的動作
確認交易*/
START TRANSACTION;
update my_emp set SALARY = SALARY * 1.10;
select * from my_emp;
SAVEPOINT TX1;
DELETE FROM my_emp;
select * from my_emp;
rollback;
select * from my_emp;
commit;