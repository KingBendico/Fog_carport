<%@ page import="PresentationLayer.Measurements" %><%--
  Created by IntelliJ IDEA.
  User: Bendico
  Date: 24-04-2020
  Time: 04:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@include file="includes/header.jsp" %>--%>
<%@include file="../includes/header2.jsp" %>
<html>
<head>
    <title>Dine mål</title>
</head>
<body>
<h1 align="center">Dine valg:</h1>
<section>
    <div align="center">
        <h5>
            Carport bredde: ${sessionScope.carportWidth} <% if (request.getParameter("Carport_bredde") != "") { %>
            cm <% } %>
            <br>
            Carport længde: ${sessionScope.carportLength} <% if (request.getParameter("Carport_laengde") != "") { %>
            cm <% } %>
            <br>
            Tag: ${sessionScope.roof}
            <% if (request.getParameter("Taghaeldning") != null) { %>
            <br>
            Taghældning: ${sessionScope.roofPitch} grader
            <% } %>
            <br>
            <% if (request.getParameter("Redskabsrum_bredde") != "") { %>Redskabsrum bredde: ${sessionScope.shedWidth}
            cm <% } %>
            <br>
            <% if (request.getParameter("Redskabsrum_laengde") != "") { %>Redskabsrum længde: ${sessionScope.shedLength}
            cm <% } %>
        </h5>
    </div>
</section>
<br>
<div align="center">
    ${sessionScope.svgdrawing}
    <div class="col-sm-4">
        <form action="FrontController" method="POST">
            <input type="hidden" name="target" value="isLoggedOn">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Bestil Carport</button>
        </form>

    </div>
</div>
<br>

<c:if test="${requestScope.error!= null}">
    <h2>Error ! </h2>
    ${requestScope.error}
</c:if>
</body>
</html>

<%@include file="../includes/footer.jsp" %>