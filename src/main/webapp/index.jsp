<%-- 
    Document   : index
    Created on : Aug 22, 2017, 2:01:06 PM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.html" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Johannes Fog</title>
    </head>
    <body>
        <h1>Tast dine dimensioner ind ...</h1>




            <div class="form-group" align="center">
                    <form name="register" action="FrontController" method="POST" >
                        <input type="hidden" name="target" value="register">
                        Længde:<br>
                        <input type="number" name="length" value="">
                        <br>
                        Højde:<br>
                        <input type="number" name="height" value="">
                        <br>
                        dybde:<br>
                        <input type="number" name="depth" value="">



                        <br>
                        <br>
                        <input type="submit" value="Submit">
                    </form>

            </div>


        <c:if test = "${requestScope.error!= null}" >
           <h2>Error ! </h2>
            ${requestScope.error}
        </c:if>
    </body>
</html>
<%@include file="includes/footer.html" %>