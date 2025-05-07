/*1. 建立一個查詢來顯示部門(dept)資料表中的所有資料。
2. 建立一個查詢來顯示每一位員工的姓名、職稱、進公司日期及員工編號，並將員工編號
顯示在最前面。
3. 建立一個查詢來顯示所有員工所擔任的職稱有哪些?(重複的資料只顯示一次)
 4. 建立一個查詢來顯示每一位員工的姓名、職稱、進公司日期及員工編號，將員工編號顯
示在最前面。並將資料表頭重新命名為：Emp#, Employee, Job, Hire Date。
5. 建立一個查詢將員工姓名及職稱串接為一個資料項(資料中間利用一個逗號和一個空白
做區隔)，並將表頭重新命名為Employee and Title。*/
-- 1
select * from dept;
-- 2
select empno,ename,job,hiredate from emp;
-- 3
select distinct job from emp;
-- 4
select empno as "Emp#",ename as "Employee",job as "Job",hiredate as "Hire Date" from emp;
-- 5
select concat(ename,",",Job) as "Employee and Title" from emp;