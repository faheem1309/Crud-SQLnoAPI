<html>
<head>
<title>Library Management System</title>
<link rel="stylesheet" type="text/css" href="css/lib.css">
</head>
<body>
    <h1>Library Management</h1>

    <h2>Add Book</h2>
    <form action="addBook">
        Title: <input type="text" name="title"><br/>
        Author: <input type="text" name="author"><br/>
        Category: <input type="text" name="category"><br/>
        <input type="submit" value="Save">
    </form>
    
    <h2>Search Book</h2>
    <form action="getBook">
        Book ID: <input type="text" name="id"><br/>
        <input type="submit" value="Search">
    </form>
    
    <h2>Delete Book</h2>
    <form action="deleteBook">
        Book ID: <input type="text" name="id"><br/>
        <input type="submit" value="Delete">
    </form>
    
    <h2>Update Book</h2>
    <form action="updateBook">
        ID: <input type="text" name="id"><br/>
        Title: <input type="text" name="title"><br/>
        Author: <input type="text" name="author"><br/>
        Category: <input type="text" name="category"><br/>
        <input type="submit" value="Update">
    </form>
</body>
</html>