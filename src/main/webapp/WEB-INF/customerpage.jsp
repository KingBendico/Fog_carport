<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<c:choose>
    <c:when test="${sessionScope.role != '30'}">
        <c:redirect url="FrontController?target=index"/>
    </c:when>
</c:choose>

<c:choose>
    <c:when test="${sessionScope.email != null}">
        <c:choose>
            <c:when test="${sessionScope.role == 30}">
                <%@include file="../includes/headerLogout.jsp" %>
            </c:when>
            <c:otherwise>
                <%@include file="../includes/headerLogout.jsp" %>
            </c:otherwise>
        </c:choose>
    </c:when>
    <c:otherwise>
        <%@include file="../includes/header.jsp" %>
    </c:otherwise>
</c:choose>



<!-- INDHOLDS DIV -->
<div class="jumbotron text-center" style="padding: 2px!important;">
    <br>
    <h1>${sessionScope.name}</h1>
    <br>
    <div class="context">
        <div class="container-fluid">
            <div class="row align-items-center">
                <div class="col">
                    <h3>Mine ordrer</h3>
                    <p>
                    <form action="FrontController" method="POST">
                        <input type="hidden" name="target" value="currentOrder">
                        <button class="btn btn-primary btn-block" class="submit">Se aktive ordrer</button>
                    </form>
                        <br>
                    <form action="FrontController" method="POST">
                        <input type="hidden" name="target" value="previousOrders">
                        <button class="btn btn-primary btn-block" class="submit">Se udførte ordrer</button>
                    </form>
                        <br>
                    </p>


                </div>
                <div class="col">
                    <table id="example" class="table table-striped table-bordered" style="width:100%">
                        <thead>
                        <tr>
                            <th>Mine data</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>

                        <tr>
                            <td>Navn</td>
                            <td>${sessionScope.name}</td>
                        </tr>
                        <tr>
                            <td>Kundenummer.</td>
                            <td>${sessionScope.userId}</td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td>${sessionScope.email}</td>
                        </tr>
                        <tr>
                            <td>Adgangskode</td>
                            <td>********</td>
                        </tr>
                        <tr>
                            <td>Telefon</td>
                            <td>${sessionScope.phone}</td>
                        </tr>
                        <tr>
                            <td>Adresse</td>
                            <td>${sessionScope.address}</td>
                        </tr>
                    </table>
                    <button type="button" class="btn btn-primary btn-block" value="Button">Skift adgangskode</button>
                </div>
            </div>
            <c:if test="${requestScope.error!= null}">
                <h2>Error ! </h2>
                ${requestScope.error}
            </c:if>
        </div>
    </div>
</div>

<%@include file="../includes/footer.jsp" %>