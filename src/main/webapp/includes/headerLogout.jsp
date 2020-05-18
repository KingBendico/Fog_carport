<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Fog Carporte</title>

    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <link href="resources/css/style.css" rel="stylesheet">


</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-expand-md navbar-dark sticky-top">
    <div class="container-fluid">
        <a class=navbar-brand" href="index.jsp"><img src="resources/img/logo.png"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">
                        <div class="nav-text">
                            Hjem
                        </div>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="FrontController?target=contact">
                        <div class="nav-text">
                            Kontakt
                        </div>
                    </a>



                </li>

                <!-- Dropdown Menu, Login -->
                <ul class="nav navbar-nav flex-row justify-content-between ml-auto">
                    <li class="dropdown order-1" style="margin-right:10px">
                        <button type="button" id="dropdownMenu1" data-toggle="dropdown"
                                class="btn btn-outline-primary dropdown-toggle">${sessionScope.email}<span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu dropdown-menu-right mt-2" style="width: 0;">
                            <li class="px-3 py-2">
                                <a class="dropdown-item text-center" href="FrontController?target=customerpage">Min side</a>
                                <a class="dropdown-item text-center" href="FrontController?target=logout">Log ud</a>
                            </li>
                        </ul>
                    </li>
                </ul>



<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link" href="FrontController?target=loginpage">--%>
<%--                        <div class="nav-text">--%>
<%--                            Login--%>
<%--                        </div>--%>
<%--                    </a>--%>

<%--                </li>--%>


            </ul>





        </div>


    </div>

</nav>
