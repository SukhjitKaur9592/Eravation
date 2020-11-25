<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="UserPages/header.jsp" %>
<link href="StyleSheets/EditProfile.css" rel="stylesheet" type="text/css">

<div class="container">
    <form method="post" action ="User">
        <div class="panel panel-default" id="panel">
            <div class="panel-heading">
                <center><h1> Edit Profile</h1> </center>
            </div>
            <div class="panel-body" >
                <div class="row">
                    <div class="col-md-6">
                        <input type="text" id="" name="txtName">

                    </div>   
                </div> 
            </div>


        </div>

    </form>
</div>
<%@include file="UserPages/footer.jsp" %>
