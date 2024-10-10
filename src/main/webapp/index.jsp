<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<div class="container">
    <div class="container-item">
        <form action="first-exercise" method="post">
        <label for="x">x:</label>
        <input type="number" id="x" name="x" required step="0.1"><br>
        <label for="n">n:</label>
        <input type="number" id="n" name="n" required step="1"><br>
        <label for="e">e:</label>
        <input type="number" id="e" name="e" required step="0.000001"><br>
        <button type="submit" class="button">Calc</button>
    </form>
    </div>
    <div class="container-item">
    <form action="second-exercise" method="post">
        <label for="a">a:</label>
        <input type="number" id="a" name="a" required step="0.1"><br>
        <label for="b">b:</label>
        <input type="number" id="b" name="b" required step="0.1"><br>
        <label for="h">h:</label>
        <input type="number" id="h" name="h" required step="0.01"><br>
        <button type="submit" class="button">Calc</button>
    </form>
    </div>
</div>

</body>
</html>