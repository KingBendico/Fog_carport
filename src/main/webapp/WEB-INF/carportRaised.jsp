<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%--<%@include file="includes/header.jsp" %>--%>
<%@include file="../includes/header2.jsp" %>

<div class="jumbotron text-center" style="padding: 2px!important;">
    <br>
    <h1>Carport med rejsning</h1>
    <br>
</div>


    <div class="col-sm-12" align="center">
        <div class="btn-group btn-group-toggle">

            <label class="btn btn-secondary">
                <input type="radio" name="FlatCarport" id="FlatCarport"
                       onclick="window.location='FrontController?target=carportFlat';"/> Carport med fladt tag
            </label>
            <label class="btn btn-secondary active">
                <input type="radio" name="RaisedCarport" id="RaisedCarport"
                       onclick="window.location='FrontController?target=carportRaised';" checked/> Carport med
                rejsning
            </label>

        </div>
    </div>

<br>


<section>

    <p class="h3 text-center">
        Ønsket carport mål
    </p>

    <div class="container">
        <div class="row">
            <div class="pageheadline">

            </div>

            <div class="col-md-9">

                <div>
                    <div>

                        <div class="formbuilder-block">
                            <div class="row">
                                <div class="col-md-12" data-form-table-to-div="">

                                    <form action="FrontController" name="raisedMeasurements" method="POST"
                                          class="ng-pristine ng-valid">
                                        <input type="hidden" name="target" value="measurements">

                                        <div id="table" class="form-horizontal col-md-12 col-xs-12">

                        <div class="form-group">
                            <div class="col-md-12 col-xs-12">
                                <label title="Carport bredde" for="Input_974608667">
                                    Carport bredde
                                </label>
                                <select class="form-control" id="Input_974608667" name="Carport_bredde"
                                        title="Carport bredde">
                                    <option selected="selected" value="">Vælg bredde</option>
                                    <option value="240">240 cm</option>
                                    <option value="270">270 cm</option>
                                    <option value="300">300 cm</option>
                                    <option value="330">330 cm</option>
                                    <option value="360">360 cm</option>
                                    <option value="390">390 cm</option>
                                    <option value="420">420 cm</option>
                                    <option value="450">450 cm</option>
                                    <option value="480">480 cm</option>
                                    <option value="510">510 cm</option>
                                    <option value="540">540 cm</option>
                                    <option value="570">570 cm</option>
                                    <option value="600">600 cm</option>
                                    <option value="630">630 cm</option>
                                    <option value="660">660 cm</option>
                                    <option value="690">690 cm</option>
                                    <option value="720">720 cm</option>
                                    <option value="750">750 cm</option>
                                </select>
                                <span class="field-validation-valid"
                                      data-valmsg-for="Carport_bredde_4a6968db98be4b4e8b979f1cee472847"
                                      data-valmsg-replace="true"></span>

                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-12 col-xs-12">


                                <label title="Carport længde" for="Input_1745136595">
                                    Carport længde
                                </label>
                                <select class="form-control" id="Input_1745136595" name="Carport_laengde"
                                        title="Carport længde">
                                    <option selected="selected" value="">Vælg længde</option>
                                    <option value="240">240 cm</option>
                                    <option value="270">270 cm</option>
                                    <option value="300">300 cm</option>
                                    <option value="330">330 cm</option>
                                    <option value="360">360 cm</option>
                                    <option value="390">390 cm</option>
                                    <option value="420">420 cm</option>
                                    <option value="450">450 cm</option>
                                    <option value="480">480 cm</option>
                                    <option value="510">510 cm</option>
                                    <option value="540">540 cm</option>
                                    <option value="570">570 cm</option>
                                    <option value="600">600 cm</option>
                                    <option value="630">630 cm</option>
                                    <option value="660">660 cm</option>
                                    <option value="690">690 cm</option>
                                    <option value="720">720 cm</option>
                                    <option value="750">750 cm</option>
                                    <option value="780">780 cm</option>
                                </select>
                                <span class="field-validation-valid"
                                      data-valmsg-for="Carport_laengde_d3cfc86491a24ab4af819cf6e6a0164a"
                                      data-valmsg-replace="true"></span>

                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-12 col-xs-12">


                                <label title="Tagtype/farve" for="Input_1745136595">
                                    Tag
                                </label>
                                <select class="form-control" id="Input_1745136595" name="Tag" title="Tagtype/farve">
                                    <option selected="selected" value="">Vælg tagtype/farve</option>
                                    <option value="Betontagsten - Rød">Betontagsten - Rød</option>
                                    <option value="Betontagsten - Teglrød">Betontagsten - Teglrød</option>
                                    <option value="Betontagsten - Brun">Betontagsten - Brun</option>
                                    <option value="Betontagsten - Sort">Betontagsten - Sort</option>
                                    <option value="Eternittag B6 - Grå">Eternittag B6 - Grå</option>
                                    <option value="Eternittag B6 - Sort">Eternittag B6 - Sort</option>
                                    <option value="Eternittag B6 - Mokka (brun)">Eternittag B6 - Mokka (brun)</option>
                                    <option value="Eternittag B6 - Rødbrun">Eternittag B6 - Rødbrun</option>
                                    <option value="Eternittag B6 - Teglrød">Eternittag B6 - Teglrød</option>
                                    <option value="Eternittag B7 - Grå">Eternittag B7 - Grå</option>
                                    <option value="Eternittag B7 - Sort">Eternittag B7 - Sort</option>
                                    <option value="Eternittag B7 - Mokka (brun)">Eternittag B7 - Mokka (brun)</option>
                                    <option value="Eternittag B7 - Rødbrun">Eternittag B7 - Rødbrun</option>
                                    <option value="Eternittag B7 - Teglrød">Eternittag B7 - Teglrød</option>
                                    <option value="Eternittag B7 - Rødflammet">Eternittag B7 - Rødflammet</option>
                                </select>
                                <span class="field-validation-valid"
                                      data-valmsg-for="Tag_833aa65467444a3e87cd89dfbceb10d0"
                                      data-valmsg-replace="true"></span>

                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-12 col-xs-12">


                                <label title="Taghældning" for="Input_1745136595">
                                    Taghældning
                                </label>
                                <select class="form-control" id="Input_1745136595" name="Taghaeldning"
                                        title="Taghældning">
                                    <option value="15">15 grader</option>
                                    <option value="20">20 grader</option>
                                    <option selected="selected" value="25">25 grader</option>
                                    <option value="30">30 grader</option>
                                    <option value="35">35 grader</option>
                                    <option value="40">40 grader</option>
                                    <option value="45">45 grader</option>
                                </select>
                                <span class="field-validation-valid"
                                      data-valmsg-for="Taghaeldning_2361360b2c6d423386abf91279296f4c"
                                      data-valmsg-replace="true"></span>

                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12 col-xs-12">


                                <label title="Redskabsrum bredde" for="Input_1745136595">
                                    Redskabsrum bredde
                                </label>
                                <select class="form-control" id="Input_1745136595" name="Redskabsrum_bredde"
                                        title="Redskabsrum bredde">
                                    <option selected="selected" value="Ønsker ikke redskabsrum">Ønsker ikke
                                        redskabsrum
                                    </option>
                                    <option value="210">210 cm</option>
                                    <option value="240">240 cm</option>
                                    <option value="270">270 cm</option>
                                    <option value="300">300 cm</option>
                                    <option value="330">330 cm</option>
                                    <option value="360">360 cm</option>
                                    <option value="390">390 cm</option>
                                    <option value="420">420 cm</option>
                                    <option value="450">450 cm</option>
                                    <option value="480">480 cm</option>
                                    <option value="510">510 cm</option>
                                    <option value="540">540 cm</option>
                                    <option value="570">570 cm</option>
                                    <option value="600">600 cm</option>
                                    <option value="630">630 cm</option>
                                    <option value="660">660 cm</option>
                                    <option value="690">690 cm</option>
                                    <option value="720">720 cm</option>
                                </select>
                                <span class="field-validation-valid"
                                      data-valmsg-for="Redskabsrum_bredde_a923dd7e7d144d9f9157a90d184a3872"
                                      data-valmsg-replace="true"></span>

                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-12 col-xs-12">


                                <label title="Redskabsrum bredde" for="Input_1745136595">
                                    Redskabsrum længde
                                </label>
                                <select class="form-control" id="Input_1745136595" name="Redskabsrum_laengde"
                                        title="Redskabsrum bredde">
                                    <option selected="selected" value="Ønsker ikke redskabsrum">Ønsker ikke
                                        redskabsrum
                                    </option>
                                    <option value="150">150 cm</option>
                                    <option value="180">180 cm</option>
                                    <option value="210">210 cm</option>
                                    <option value="240">240 cm</option>
                                    <option value="270">270 cm</option>
                                    <option value="300">300 cm</option>
                                    <option value="330">330 cm</option>
                                    <option value="360">360 cm</option>
                                    <option value="390">390 cm</option>
                                    <option value="420">420 cm</option>
                                    <option value="450">450 cm</option>
                                    <option value="480">480 cm</option>
                                    <option value="510">510 cm</option>
                                    <option value="540">540 cm</option>
                                    <option value="570">570 cm</option>
                                    <option value="600">600 cm</option>
                                    <option value="630">630 cm</option>
                                    <option value="660">660 cm</option>
                                    <option value="690">690 cm</option>
                                </select>
                                <span class="field-validation-valid"
                                      data-valmsg-for="Redskabsrum_laengde_f1cea9650faa485ca81742dcbc98b93c"
                                      data-valmsg-replace="true"></span>

                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12 col-xs-12">
                                <hr>
                            </div>
                        </div>


                        <div class="form-group">
                            <div class="col-md-6 col-xs-12">

                                <div class="col-md-6 col-xs-12">
                                    <input type="Submit" name="SubmitRaised" title="Submit" value="Submit"
                                           class="btn btn-primary">

                                </div>
                            </div>
                        </div>

                    </div>

                    </form>
                </div>
            </div>
        </div>
    </div>


    </div>
    </div>
    </div>


    </div>
    </div>
</section>
<br>


<c:if test="${requestScope.error!= null}">
    <h2>Error ! </h2>
    ${requestScope.error}
</c:if>

<%@include file="../includes/footer.jsp" %>