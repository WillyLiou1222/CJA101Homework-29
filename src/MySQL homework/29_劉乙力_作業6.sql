/*1. 顯示和Blake同部門的所有員工之姓名和進公司日期。
2. 顯示所有在Blake之後進公司的員工之姓名及進公司日期。
3. 顯示薪資比公司平均薪資高的所有員工之員工編號,姓名和薪資，並依薪資由高到低排列。
4. 顯示和姓名中包含T的人在相同部門工作的所有員工之員工編號和姓名。
5. 顯示在Dallas工作的所有員工之姓名, 部門編號和職稱。
6. 顯示直屬於”King”的員工之姓名和薪資。
7. 顯示銷售部門”Sales” 所有員工之部門編號,姓名和職稱。
8. 顯示薪資比公司平均薪資還要高且和名字中有T的人在相同部門上班的所有員工之員工編號,姓名和薪資。
9. 顯示和有賺取佣金的員工之部門編號和薪資都相同的員工之姓名,部門編號和薪資。
10.顯示和在Dallas工作的員工之薪資和佣金都相同的員工之姓名,部門編號和薪資。
11.顯示薪資和佣金都和Scott相同的所有員工之姓名,進公司日期和薪資。(不要在結果中顯示Scott的資料)
 12.顯示薪資比所有職稱是”Clerk”還高的員工之姓名,進公司日期和薪資，並將結果依薪資由高至低顯示。*/
 -- 1
 select ename, hiredate from emp where deptno = (select deptno from emp where ename = 'Blake');
 -- 2
 select ename, hiredate from emp where hiredate > (select hiredate from emp where ename = 'Blake');
 -- 3
 select empno ,ename, sal from emp where sal > (select avg(sal) from emp) order by sal desc;
 -- 4
select empno, ename from emp where deptno in (select deptno from emp where ename like '%T%');
-- 5
select ename, deptno, job from emp where deptno = (select deptno from dept where loc = 'DALLAS');
-- 6
select ename, sal from emp where mgr in (select mgr from emp where mgr = '7839');
-- 7
select deptno, ename, job from emp where deptno = (select deptno from dept where dname = 'Sales');
-- 8
select empno ,ename, sal from emp where sal > (select avg(sal) from emp) and deptno in (select deptno from emp where ename like '%T%');
-- 9
select e1.ename, e1.deptno, e1.sal 
from emp e1 
where (deptno,sal) 
in (select deptno,sal from emp e2 where comm > 0 and e1.empno != e2.empno);
-- 10
select e1.ename, e1.deptno, e1.sal 
from emp e1 
where (ifnull(comm,-1),sal) 
in (select ifnull(comm,-1),sal from emp e2 where  e1.empno != e2.empno and
e2.deptno = (select deptno from dept where loc = 'DALLAS'));
-- 11
select e1.ename, e1.hiredate, e1.sal 
from emp e1 
where (ifnull(comm,-1),sal) 
in (select ifnull(comm,-1),sal from emp e2 where ename = 'Scott' and e1.empno != e2.empno);
-- 12
select e1.ename, e1.hiredate, e1.sal
from emp e1 join emp e2 on e1.empno = e2.empno
where e1.sal > (select max(e1.sal) from emp as e1 where e1.job = 'Clerk')
order by e1.sal desc;