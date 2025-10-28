<html>
<body>
<div>
CRUD OPERATION BY USING JSP AND MYSQL(WITHOUT API)
</div>
<div>
<h1>Add Student</h1>
<form action="addStu">
Student Id:<input type="text" name="sid" value=${student.sid}> <br/>
Student Name:<input type="text" name="sname" value=${student.sname}> <br/>
Branch:<input type="text" name="branch" value=${student.branch}> <br/>
College:<input type="text" name="college" value=${student.college}> <br/>
<input type="submit">
</form>

</div>
</body>

</html>