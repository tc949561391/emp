<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head lang="ch">
<meta charset="utf-8">
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<div>
		<table>
			<tr>
				<th>empno</th>
				<th>ename</th>
				<th>job</th>
				<th>mgr</th>
				<th>hiredate</th>
				<th>sal</th>
				<th>comm</th>
				<th>deptno</th>
			</tr>
			<c:forEach items="${emps}" var="emp">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename }</td>
					<td>${emp.job}</td>
					<td>${emp.mgr}</td>
					<td>${emp.hiredate}</td>
					<td>${emp.sal}</td>
					<td>${emp.comm}</td>
					<td>${emp.deptno}</td>
				</tr>

			</c:forEach>

		</table>
	</div>
	<div>
		<table>
			<tr>
				<th>deptno</th>
				<th>dename</th>
				<th>local</th>
				<th>delete</th>

			</tr>
			<c:forEach items="${depts}" var="dept">
				<form action="${pageContext.request.contextPath}/detedept">
				<tr>
					<td>${dept.deptno}</td>
					<td>${dept.dname }</td>
					<td>${dept.loc}</td>
					<input type="hidden" value="${dept.deptno}" name="deptno">
					<td><input type="submit" value="delete"></td>
				</tr>
				</form>
			</c:forEach>

		</table>
	</div>

</body>
</html>
