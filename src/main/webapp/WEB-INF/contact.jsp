<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%--<%@include file="includes/header.jsp" %>--%>
<%@include file="../includes/header2.jsp" %>

<!-- INDHOLDS DIV -->
<div class="jumbotron text-center" style="padding: 2px!important;">
    <br>
    <h1>Kontakt os</h1>
    <br>
</div>
<section>
    <div class="col-xl-12">
        <div class="container">
            <form action="FrontController">
                <label for="fname">Fornavn</label>
                <input type="text" id="fname" name="firstname" placeholder="Dit fornavn ...">
                <label for="lname">Efternavn</label>
                <input type="text" id="lname" name="lastname" placeholder="Dit efternavn ...">

                <%--    <label for="country">Country</label>
                    <select id="country" name="country">
                        <option value="australia">Australia</option>
                        <option value="canada">Canada</option>
                        <option value="usa">USA</option>
                    </select>--%>
                <label for="subject">Emne</label>
                <textarea id="subject" name="subject" placeholder="Skriv et eller andet ..."
                          style="height:200px"></textarea>
                <input type="submit" value="Submit" class="btn btn-primary">
            </form>
        </div>
    </div>
</section>

<c:if test="${requestScope.error!= null}">
    <h2>Error ! </h2>
    ${requestScope.error}
</c:if>

<%@include file="../includes/footer.jsp" %>