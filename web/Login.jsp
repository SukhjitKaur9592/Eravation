
<%@include file="header.jsp"%>
<div class="container" style="padding-left: 150px;padding-right: 150px;padding-top: 20px"> 
    <div class="panel panel-default" >
       
        <div class=" panel-body" >
            <form method="post" action="User">


                <div class="row" style="padding-top: 30px">
                    <div class="col-md-3">
                        <center> <label for ="UserId"class="control-label ">User Id:</label> </center>

                    </div>


                    <div class="col-md-6">
                        <input type="text" class="form-control"name="txtUserId" id="UserId" placeholder="User Id"/>
                    </div>

                </div>



                <div class="row" style="padding-top: 20px">
                    <div class="col-md-3">
                        <center> <label for ="Password"class="control-label">Password:</label> </center>
                    </div>

                    <div class="col-md-6">
                        <input type="password" class="form-control" name="txtPassword" id="Password" placeholder="Password"/>

                    </div>
                </div>



                <div class="row" style="padding-top: 20px;">

                    <div class="col-md-4">

                    </div>
                    <div class="col-md-4">
                        <input type="Submit" class="form-control btn-success btn-sm" name="Loginbtn" value="Login" style="margin-bottom: 20px"/>
                    </div>

                    <%
                        if (request.getParameter("flag") != null) {

                    %>

                    <div class="row" style="padding-top: 20px;">

                        <div class="col-md-4">

                        </div>
                        <div class="col-md-4">
                            User Id or Password is incorrect!
                        </div>
                        <%}%>





                        </form>



                    </div>
                </div>



        </div>          
    </div>



    <%@include file="footer.jsp"%>