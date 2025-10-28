<html>
<head>
    <title>Update Book</title>
</head>
<body>
<h2>Update Book Details</h2>

<form action="updateBook">
    Book ID: <input type="text" name="id" value="${book.id}" readonly><br/><br/>
    Title: <input type="text" name="title" value="${book.title}"><br/><br/>
    Author: <input type="text" name="author" value="${book.author}"><br/><br/>
    Category: <input type="text" name="category" value="${book.category }"><br/><br/>
    <input type="submit" value="Update">
</form>

<br/>
<a href="index.jsp">Back to Home</a>
</body>
</html>
