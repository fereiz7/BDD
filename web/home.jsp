<%-- 
    Document   : newjsp
    Created on : 19/11/2018, 11:01:28 PM
    Author     : emilio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="templates/head.jsp"></jsp:include>
        <script src="js/home.js"></script>
            <title>SIVO Home</title>
        </head>
        <body onload="requestEncuestas()">
        <jsp:include page="templates/header.jsp"></jsp:include>

        <div id="container" class="encuestas grid-container"></div>

        <jsp:include page="templates/footer.jsp"></jsp:include>
    </body>
</html>
