<html>
<head>
<title>Student CRUD operation</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div>
CRUD OPERATION BY USING JSP AND MYSQL(WITHOUT API)
</div>
<div>
<h1>Add Student</h1>
<form action="addStu">
Student Id:<input type="text" name="sid"> <br/>
Student Name:<input type="text" name="sname"> <br/>
Branch:<input type="text" name="branch"> <br/>
College:<input type="text" name="college"> <br/>
<input type="submit">
</form>

<h1>Get Student</h1>
<form action="getStu">
Student Id:<input type="text" name="sid"> <br/>
<input type="submit">
</form>

<h1>Delete Student</h1>
<form action="delStu">
Student Id:<input type="text" name="sid"> <br/>
<input type="submit">
</form>

<h1>Update Student</h1>
<form action="updStu">
Student Id:<input type="text" name="sid"> <br/>
<input type="submit">
</form>

</div>
</body>

</html>