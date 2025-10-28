<html>
<head>
<title> Employee CRUD operation</title>
<link rel="stylesheet" type="text/css" href="css/emp.css">
</head>
<body>
<div>
CRUD OPERATION BY USING JSP AND MYSQL(WITHOUT API)
</div>
<div>
<h1>Add Employee</h1>
<form action="addEmp">
Employee Id:<input type="text" name="eid"> <br/>
Employee Name:<input type="text" name="ename"> <br/>
<input type="submit">
</form>

<h1>Get Employee</h1>
<form action="getEmp">
Employee Id:<input type="text" name="eid"> <br/>
<input type="submit">
</form>

<h1>Delete Employee</h1>
<form action="delEmp">
Employee Id:<input type="text" name="eid"> <br/>
<input type="submit">
</form>

<h1>Update Employee</h1>
<form action="updEmp">
Employee Id:<input type="text" name="eid"> <br/>
<input type="submit">
</form>
</div>
</body>
</html>