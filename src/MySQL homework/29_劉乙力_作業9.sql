-- 1. 使用EMP資料表中的員工編號(empno),姓名(ename)及部門編號(deptno)來建立一個EMP_VU view，並將姓名(ename)欄位名稱改成EMPLOYEE。
create view EMP_VU (empno,EMPLOYEE,deptno)
as
select empno, ename, deptno from emp; 
desc emp_vu;
-- 2. 使用EMP_VU view來顯示所有員工之姓名及部門編號。
select employee, deptno from EMP_VU;
-- 3. 新建一個名為DEPT20的view，包含在部門20的所有員工之員工編號，員工姓名，及部門編號。將View中的資料項目命名為EMPLOYEE_ID, EMPLOYEE, 及DEPARTMENT_NO。並設定不允許使用者透過DEPT20來更改員工所屬的部門編號。
create view DEPT20 (EMPLOYEE_ID, EMPLOYEE,DEPARTMENT_NO)
as
select E.EMPNO,E.ENAME,D.DEPTNO
from emp E
inner join DEPT D on D.DEPTNO = E.DEPTNO
where D.DEPTNO = 20
with check option;
-- 4. 使用DEPT20 view 顯示其所有資料內容。
select * from DEPT20;
-- 5. 試試看利用DEPT20 view將 Smith 轉調到部門30。
update DEPT20
set department_no = 30
where employee = 'Smith';
-- 6. 新建一個名為SALARY_VU的view，包含所有員工之姓名，部門名稱，薪資和薪資等級。將View中的資料項目分別命名為Employee, Department, Salary, Grade。
create view SALARY_VU
as
select e.ename as Employee, d.dname as Department, e.sal as Salary, sg.grade
from emp as e join salgrade as sg on e.sal between sg.losal and sg.hisal
			  join dept as d on e.deptno = d.deptno;
select * from salary_vu;
-- 7. 在EMP資料表中利用ename欄位建立一個non-unique index 命名為idx_emp_ename。
create index idx_emp_ename
on emp(ename);
show indexes from emp;