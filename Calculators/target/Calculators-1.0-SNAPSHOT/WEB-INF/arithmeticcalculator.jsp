<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 12, 2022, 10:42:08 PM
    Author     : Madhu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="fArithmetic">First: </label>
            <input type="number" name="fArithmetic" id="fArithmetic" value="${fArithmetic}" >
            <br>
            <label for="sArithmetic">Second: </label>
            <input type="number" name="sArithmetic" id="sArithmetic" value="${sArithmetic}">
            <br>
            <button type="submit" name="calculation" value="add" id="addition"><strong>+</strong></button>
            <button type="submit" name="calculation" value="sub" id="subtraction"><strong>-</strong></button>
            <button type="submit" name="calculation" value="mul" id="multiplication"><strong>*</strong></button>
            <button type="submit" name="calculation" value="mod" id="division"><strong>/</strong></button>
        </form>
        <p>${output}</p>
        <a href="age">Age Calculator </a>
    </body>
</html>
