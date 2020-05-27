<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%--<%@include file="includes/header.jsp" %>--%>
<%@include file="../includes/header2.jsp" %>

<div class="jumbotron text-center" style="padding: 2px!important;">
    <br>
    <h1>Carport med fladt tag</h1>
    <br>
</div>
<div class="col-sm-12" align="center">
    <div class="btn-group btn-group-toggle">
        <label class="btn btn-secondary active">
            <input type="radio" name="FlatCarport" id="FlatCarport"
                   onclick="window.location='FrontController?target=carportFlat';" checked/> Carport med fladt tag
        </label>
        <label class="btn btn-secondary">
            <input type="radio" name="RaisedCarport" id="RaisedCarport"
                   onclick="window.location='FrontController?target=carportRaised';"/> Carport med
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
                                    <form action="FrontController" name="flatMeasurements" method="POST"
                                          class="ng-pristine ng-valid">
                                        <input type="hidden" name="target" value="measurements">
                                        <div id="table" class="form-horizontal col-md-12 col-xs-12">
                                            <div class="form-group">
                                                <div class="col-md-12 col-xs-12">
                                                    <label title="Carport bredde" for="Input_694650445">
                                                        Carport bredde
                                                    </label>
                                                    <select class="form-control" id="Input_694650445"
                                                            name="Carport_bredde"
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
                                                          data-valmsg-for="Carport_bredde_7ff01a8f6940485598af35f558edbcb5"
                                                          data-valmsg-replace="true"></span>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12 col-xs-12">
                                                    <label title="Carport længde" for="Input_694650445">
                                                        Carport længde
                                                    </label>
                                                    <select class="form-control" id="Input_694650445"
                                                            name="Carport_laengde"
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
                                                          data-valmsg-for="Carport_laengde_3bafa64f20f64bf4b9094e8ca97fc727"
                                                          data-valmsg-replace="true"></span>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12 col-xs-12">
                                                    <label title="Tag" for="Input_694650445">
                                                        Tag
                                                    </label>
                                                    <select class="form-control" id="Input_694650445" name="Tag"
                                                            title="Tag">
                                                        <option selected="selected" value="Plasttrapezplader">
                                                            Plasttrapezplader
                                                        </option>
                                                     </select>
                                                    <span class="field-validation-valid"
                                                          data-valmsg-for="Tag_390c7f42911a44348f28de633874375f"
                                                          data-valmsg-replace="true"></span>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12 col-xs-12">
                                                    <label title="Redskabsrum bredde" for="Input_694650445">
                                                        Redskabsrum bredde
                                                    </label>
                                                    <select class="form-control" id="Input_694650445"
                                                            name="Redskabsrum_bredde" title="Redskabsrum bredde">
                                                        <option selected="selected" value="">
                                                            Ønsker
                                                            ikke redskabsrum
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
                                                          data-valmsg-for="Redskabsrum_bredde_b1e0bf706b6946668c81f84b5ea2d263"
                                                          data-valmsg-replace="true"></span>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12 col-xs-12">

                                                    <label title="Redskabsrum længde" for="Input_694650445">
                                                        Redskabsrum længde
                                                    </label>
                                                    <select class="form-control" id="Input_694650445"
                                                            name="Redskabsrum_laengde" title="Redskabsrum længde">
                                                        <option selected="selected" value="">
                                                            Ønsker
                                                            ikke redskabsrum
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
                                                          data-valmsg-for="Redskabsrum_laengde_906f5c0caf40445784db4c347e7660d8"
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
                                                        <input type="Submit" name="SubmitFlat" title="Submit"
                                                               value="Submit"
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