<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="../includes/header.jsp" %>

<!-- INDHOLDS DIV -->
<div class="jumbotron text-center" style="padding: 2px!important;">
    <br>
    <h1>Opret ny bruger</h1>
    <br>
</div>
<section>
    <div align="center">
        <div class="col-md-6">
            <div class="container">
                <!-- Login Form -->
                <form class="form" role="form" name="register" action="FrontController" method="POST">
                    <input type="hidden" name="target" value="register">
                    <input required type="text" id="email" class="fadeIn second" name="email" placeholder="din e-mail">
                    <input required type="text" id="password1" class="fadeIn third" name="password1"
                           placeholder="din adgangskode">
                    <input required type="text" id="password2" class="fadeIn third" name="password2"
                           placeholder="din adgangskode igen">
                    <input required type="text" id="fullName" class="fadeIn third" name="fullName"
                           placeholder="dit navn">
                    <input required type="text" id="address" class="fadeIn third" name="address"
                           placeholder="din adresse">
                    <input required type="text" id="phone" class="fadeIn third" name="phone" placeholder="tlf. nummer">
                    <%--   <button type="button" style="float: center;" class="btn btn-primary" value="Button">Opret bruger</button>--%>
                    <input type="submit" class="btn btn-lg btn-primary btn-block" value="Opret bruger">
                </form>
            </div>
        </div>
    </div>
</section>

<%@include file="../includes/footer.jsp" %>