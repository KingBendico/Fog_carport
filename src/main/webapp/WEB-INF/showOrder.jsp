<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%--<%@include file="includes/header.jsp" %>--%>
<%@include file="../includes/header2.jsp" %>




<div class="card mb-4">
    <div class="card-header">
        Materialeliste
    </div>
    <div class="card-body">
        <div class="overflow-auto mb-3">
            <table class="table table-bordered table-sm table-hover text-nowrap mb-0">
                <thead>
                <tr>
                    <th scope="col">Vare #</th>
                    <th scope="col">Beskrivelse</th>
                    <th scope="col">Antal</th>
                    <th scope="col">Dato</th>

                </tr>
                </thead>
                <tbody>
                <c:set var="materialList" value="${sessionScope.carport.toString()}"/>
                <c:forEach var="materials" items="${materialList.blahblah.blahblah  }">
                    <tr>
                        <td>${materials.key.description}</td>
                        <td>${materials.key.description}</td>
                        <td>${materials.key.description}</td>
                        <td>${materials.key.description}</td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>


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