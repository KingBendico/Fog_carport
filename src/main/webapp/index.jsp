<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%--<%@include file="includes/header.jsp" %>--%>
<%@include file="includes/header2.jsp" %>

<div class="jumbotron text-center" style="padding: 2px!important;">
    <br>
    <h1>Velkommen til Fog Carporte!</h1>
    <br>
</div>
<div class="col-xs-1 text-center">
    <div class="btn-group" role="group" aria-label="Button group with nested dropdown">
        <button type="button" class="btn btn-secondary" onclick="window.location='FrontController?target=carportFlat';">
            Carport med fladt tag
        </button>
        <button type="button" class="btn btn-secondary"
                onclick="window.location='FrontController?target=carportRaised';">Carport med rejsning
        </button>
    </div>
</div>
<br>
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel" align="center">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="5"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img class="d-block w-50" src="resources/img/carport1.png" alt="First slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-50" src="resources/img/carport2.png" alt="Second slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-50" src="resources/img/carport3.png" alt="Third slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-50" src="resources/img/carport4.png" alt="Fourth slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-50" src="resources/img/carport5.png" alt="Fifth slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-50" src="resources/img/carport6.png" alt="Sixth slide">
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

<c:if test="${requestScope.error!= null}">
    <h2>Error ! </h2>
    ${requestScope.error}
</c:if>

<%@include file="includes/footer.jsp" %>