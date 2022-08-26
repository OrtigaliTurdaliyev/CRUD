<%--
  Created by IntelliJ IDEA.
  User: abror
  Date: 20/08/22
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD STUDENT FORM</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js"
            integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js"
            integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK"
            crossorigin="anonymous"></script>


</head>
<body>

<form action="/add-students" method="post">
    <label for="firstName">First Name</label>
    <input  type="text" id="firstName" name="firstName" >

<br>
    <label for="lastname">Lastname</label>
    <input type="text" name="lastName" id="lastname">
<br>
    <label for="email">Email</label>
    <input type="text" name="email" id="email">

<br>
    <label for="course">Course</label>
    <input name="course" type="number" id="course">
<br>

    <button type="reset">Reset</button>
    <br>
    <button type="submit">Add</button>
<%--    <a href="/show-student" class="btn btn-outline-danger">ortga</a>--%>
</form>
</body>
</html>
