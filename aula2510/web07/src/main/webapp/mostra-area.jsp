<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-2"></div>
        <div class="col-8"><h1>Resultado</h1></div>
        <div class="col-2"></div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-2"></div>
        <div class="col-8">
            <p>Com base no raio: ${param.raio} a área do círculo é:</p>
            <%
                double raio = Double.parseDouble(request.getParameter("raio"));
                double resultado = Math.PI * Math.pow(raio, 2.0);
            %>
            <p class="lead">Valor calculado: <%=resultado%>
            </p>
        </div>
        <div class="col-2"></div>
    </div>
</div>
</body>
</html>

