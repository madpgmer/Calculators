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
            <label for="arithmetic">First: </label>
            <input type="number" name="Farithmetic" id="Farithmetic">
            <br>
            <label for="arithmetic">Second: </label>
            <input type="number" name="Sarithmetic" id="Sarithmetic">
            <br>
            <button type="submit"><strong>+</strong></button>
            <button type="submit"><strong>-</strong></button>
            <button type="submit"><strong>*</strong></button>
            <button type="submit"><strong>%</strong></button>
        </form>
        
        <a href="AgeCalculatorServlet?">Age Calculator </a>
    </body>
</html>