/*1. 顯示所有員工之姓名,所屬部門編號,部門名稱及部門所在地點。
2. 顯示所有有賺取佣金的員工之姓名,佣金金額,部門名稱及部門所在地點。
3. 顯示姓名中包含有”A”的員工之姓名及部門名稱。
4. 顯示所有在”DALLAS”工作的員工之姓名,職稱,部門編號及部門名稱
5. 顯示出表頭名為:Employee, Emp#, Manager, Mgr#，分別表示所有員工之姓名,員工編號,主
管姓名, 主管的員工編號。 (自我連結)
6. 查看SALGRADE資料表的結構，並建立一查詢顯示所有員工之姓名,職稱,部門名稱,薪資及薪
資等級。  (非對等連結)
7. 顯示出表頭名為: Employee, Emp Hiredate, Manager, Mgr Hiredate的資料項，來顯示所有比
他的主管還要早進公司的員工之姓名,進公司日期和主管之姓名及進公司日期。  (自我連結)
8. 顯示出表頭名為: dname, loc, Number of People, Salary的資料來顯示所有部門之部門名稱,部
門所在地點,部門員工數量及部門員工的平均薪資，平均薪資四捨五入取到小數第二位。 (員工 & 部門聯集 做匯總)
9. 顯示出所有部門之編號、名稱及部門員工人數(Emp#)，包含沒有員工的部門。*/
-- 1
select e.ename, e.deptno , d.dname, d.loc from emp e join dept d on e.deptno = d.deptno;
-- 2
select e.ename, e.comm, d.dname, d.loc from emp e join dept d on e.deptno = d.deptno where e.comm != 'null';
-- 3
select e.ename, d.dname from emp e join dept d on e.deptno = d.deptno where e.ename like '%A%';
-- 4
select e.ename, e.job, e.deptno ,d.dname from emp e join dept d on e.deptno = d.deptno where loc = 'DALLAS';
-- 5
select e1.ename as 'Employee', e1.empno as 'Emp#', e2.ename as 'Manager', e1.mgr as 'Mgr#' from emp e1 join emp e2 on (e2.empno = e1.mgr);
-- 6
select e.ename, e.job, d.dname , e.sal, s.grade from emp e join dept d on e.deptno = d.deptno                                                            join salgrade s on e.sal between s.losal and s.hisal;
-- 7
select e1.ename as 'Employee', e1.hiredate as 'Emp Hiredate', e2.ename as 'Manager', e2.hiredate as 'Mgr Hiredate' from emp e1 join emp e2 on (e2.empno = e1.mgr) where e1.hiredate < e2.hiredate;
-- 8
select d.dname as 'dname', d.loc as 'loc', count(e.ename) as 'Number of People', round(avg(e.sal)) as 'Salary' from dept d join emp e on d.deptno = e.deptno group by d.dname, d.loc;
-- 9
select d.deptno ,d.dname, count(e.ename) from dept d left join emp e on d.deptno = e.deptno group by d.deptno, d.dname;