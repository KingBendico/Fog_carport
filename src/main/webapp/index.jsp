<%@include file="includes/header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<%@include file="includes/footer.jsp" %>