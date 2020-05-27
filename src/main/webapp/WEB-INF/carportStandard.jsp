<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="../includes/header.jsp" %>


<div class="jumbotron text-center" style="padding: 2px!important;">
    <br>
    <h1>Standard Carporte</h1>
    <br>
</div>
<div class="col-sm-12" align="center">
    <div class="btn-group btn-group-toggle">
        <label class="btn btn-secondary">
            <input type="radio" name="FlatCarport" id="FlatCarport"
                   onclick="window.location='FrontController?target=carportFlat';" checked/> Carport med fladt tag
        </label>
        <label class="btn btn-secondary">
            <input type="radio" name="RaisedCarport" id="RaisedCarport"
                   onclick="window.location='FrontController?target=carportRaised';"/> Carport med
            rejsning
        </label>
        <label class="btn btn-secondary active">
            <input type="radio" name="StandardCarport" id="StandardCarport"
                   onclick="window.location='FrontController?target=carportStandard';"/> Standard carporte
        </label>
    </div>
</div>
<br>

<%@include file="../includes/footer.jsp" %>