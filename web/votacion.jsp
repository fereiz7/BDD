<%-- 
    Document   : votacion
    Created on : 21/11/2018, 06:22:51 PM
    Author     : emilio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="templates/head.jsp"></jsp:include>
        <script src="js/home.js"></script>
            <title>SIVO Votacion</title>
        </head>
        <body onload="requestOpciones()">
        <jsp:include page="templates/header.jsp"></jsp:include>

        <div id="form-voto" class="card"></div>

        <jsp:include page="templates/footer.jsp"></jsp:include>
    </body>
</html>
