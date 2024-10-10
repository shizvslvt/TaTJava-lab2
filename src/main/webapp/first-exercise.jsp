<jsp:useBean id="result" scope="request" type="lab2.tatjavalab2.model.FirstExerciseResult"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<div class="container">
    <div class="container-item">
        <h1>Calculation Results</h1>
        <small>(x: ${result.x}, n: ${result.n}, e: ${result.e})</small>
    <br>
        <table>
            <thead>
            <tr>
                <th>sum`s</th><th>calc`s</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Sum (all lump)</td><td>${result.sum1}</td>
            </tr>
            <tr>
                <td>Sum (abs(lump) > e)</td><td>${result.sum2}</td>
            </tr>
            <tr>
                <td>epsilon</td><td>${result.eps}</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
