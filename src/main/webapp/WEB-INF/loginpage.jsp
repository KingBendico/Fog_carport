<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="../includes/header.jsp" %>

<!-- INDHOLDS DIV -->
<div class="jumbotron text-center" style="padding: 2px!important;">
    <br>
    <h1>Login</h1>
    <br>
</div>

<section>
    <div align="center">
        <div class="col-md-6">
            <div class="container">
                <form class="form-signin" action="FrontController" method="POST">
                    <input type="hidden" name="target" value="login">

                <%--    <h1 class="h3 mb-3 font-weight-normal">Login</h1>--%>
                    <label for="inputEmail" class="sr-only">Brugernavn (E-mail)</label>
                    <input name="email" type="email" id="inputEmail" class="form-control" placeholder="Email" required="" autofocus="">
                    <label for="inputPassword" class="sr-only">Adgangskode</label>
                    <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required="">
                    <div class="checkbox mb-3">
                        <label>
                            <input type="checkbox" value="remember-me"> Husk mig
                        </label>
                        <small><a href="FrontController?target=newUser"
                                  style="float: right;">Opret ny bruger?</a></small>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>


                </form>
            </div>
        </div>
    </div>
</section>


<%@include file="../includes/footer.jsp" %>