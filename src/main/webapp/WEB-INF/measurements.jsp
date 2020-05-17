<%@ page import="PresentationLayer.Measurements" %><%--
  Created by IntelliJ IDEA.
  User: Bendico
  Date: 24-04-2020
  Time: 04:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../includes/header.jsp" %>
<html>
<head>
    <title>Dine mål</title>
</head>
<body>


<h1 align="center">Dine valg:</h1>


<br>
<section>
    <div align="center">
        <h5>
            Carport bredde: ${sessionScope.carportWidth}
            <br>
            Carport længde: ${sessionScope.carportLength}
            <br>
            Tag: ${sessionScope.roof}
            <% if (request.getParameter("Taghaeldning") != null) { %>
            <br>
            Taghældning: ${sessionScope.roofPitch}
            <% } %>
            <br>
            Redskabsrum bredde: ${sessionScope.shedWidth}
            <br>
            Redskabsrum længde: ${sessionScope.shedLength}
        </h5>
    </div>

</section>
<div>
    ${sessionScope.svgdrawing}
</div>

<br>

<c:if test="${requestScope.error!= null}">
    <h2>Error ! </h2>
    ${requestScope.error}
</c:if>
</body>
</html>

<%@include file="../includes/footer.jsp" %>