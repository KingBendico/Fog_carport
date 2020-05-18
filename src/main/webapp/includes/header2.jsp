<%--<c:choose>--%>
<%--    <c:when test="${sessionScope.role != '30'}">--%>
<%--        <c:redirect url="FrontController?target=index"/>--%>
<%--    </c:when>--%>
<%--</c:choose>--%>

<c:choose>
    <c:when test="${sessionScope.email != null}">
        <c:choose>
            <c:when test="${sessionScope.role == 30}">
                <%@include file="/includes/headerLogout.jsp" %>
            </c:when>
            <c:otherwise>
                <%@include file="/includes/headerLogout.jsp" %>
            </c:otherwise>
        </c:choose>
    </c:when>
    <c:otherwise>
        <%@include file="/includes/header.jsp" %>
    </c:otherwise>
</c:choose>