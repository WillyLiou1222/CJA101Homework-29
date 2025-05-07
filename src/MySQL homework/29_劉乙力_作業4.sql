/*1. 顯示所有員工的最高、最低、總和及平均薪資，依序將表頭命名為Maximum, Minimum, Sum
和Average，請將結果顯示為四捨五入的整數。
2. 顯示每種職稱的最低、最高、總和及平均薪水。
3. 顯示每種職稱的人數。
4. 顯示資料項命名為Number of Managers來表示擔任主管的人數。     (根據MGR Group By)
5. 顯示資料項命名為DIFFERENCE的資料來表示公司中最高和最低薪水間的差額。
6. 顯示每位主管的員工編號及該主管下屬員工最低的薪資，排除沒有主管和下屬員工最低薪資  (根據MGR Group By)
少於1000的主管，並以下屬員工最低薪資作降冪排列。
7. 顯示在2011及2013年進公司的員工數量，並給該資料項一個合適的名稱。*/
-- 1
select round(max(sal)) as 'Maximum', round(min(sal)) as 'Minimum', round(sum(sal)) as 'Sum', round(avg(sal)) as 'Average' from emp;
-- 2
select job, min(sal), max(sal), sum(sal), avg(sal) from emp group by job;
-- 3
select job, count(*) from emp group by job;
-- 4
select count(distinct mgr) as 'Number of Managers' from emp ;
-- 5
select max(sal)-min(sal) as 'DIFFERENCE' from emp;
-- 6
select distinct mgr, min(sal) from emp where mgr != 'null' group by mgr having min(sal) > 1000 order by min(sal) desc;
-- 7
select year(hiredate) as 'HYear', count(empno) as 'Number of People' from emp where hiredate like '2011%' or hiredate like '2013%' group by year(hiredate); 