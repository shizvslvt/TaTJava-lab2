<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="result" scope="request" type="lab2.tatjavalab2.model.SecondExerciseResult"/>
<!DOCTYPE html>
<html>
<head>
    <title>Second Exercise Results</title>
    <link rel="stylesheet" type="text/css" href="style/style.css">
</head>
<body>
<div class="container">
    <div class="container-item">
        <h1>Tabulation Results</h1>
        <small>(a: <%= result.getA() %>, b: <%= result.getB() %>, h: <%= result.getH() %>)</small>

        <table>
            <thead>
            <tr>
                <th>x</th>
                <th>y</th>
            </tr>
            </thead>
            <tbody>
            <%
                double[] xValues = result.getXValues();
                double[] yValues = result.getYValues();

                for (int i = 0; i < xValues.length; i++) {
            %>
            <tr>
                <td><%= xValues[i] %></td>
                <td><%= yValues[i] %></td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
