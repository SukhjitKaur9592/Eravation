<%@include file="header.jsp"%>

<script type="text/javascript" src="JScripts/Registration.js"></script>

<div class="container" style="padding-left: 150px; padding-right: 150px; padding-top: 20px" > 
    <div class="panel panel-default">
        <div class="panel-heading">
            <h1 style="color: #od3b4c;     text-align: center">
                Create new Account
            </h1>
        </div><!--div close-->
        
        
        <div class=" panel-body" >
            <form method="post" action="User">

                <label for ="txtName" class="control-label">Name:</label>
                <div class="row">
                    <div class="col-md-6">
                        <input type="text" class="form-control" id="txtName" name="txtName" placeholder="Name"/>

                    </div>
                    <div class="col-md-6">
                        <span id="sp1"></span>
                    </div>
                </div>

                <label for="rbtGender" class="control-label">Gender:</label>
                <div class="row">
                    <div class="col-md-3">
                        <input type="radio"  value="Male" id="rbtMale" name="rbtGender" />Male
                    </div> 
                    
                    <div class="col-md-3">
                        <input type="radio"  value="Female" id="rbtFemale" name="rbtGender"/> Female
                    </div> 
                    
                    <div class="col-md-3">
                        <span id="sp2"></span>
                    </div> 
                </div>

                <label for="txtMail" class="control-label" style="margin-top: 10px">e-mail:</label>
                <div class="row">
                    <div class="col-md-6">
                        <input type="text" class="form-control" id="txtMail" name="txtMail"  placeholder="e-mail"/>
                    </div> 
                    
                    <div class="col-md-6">
                        <div class="col-md-6">
                            <span id="sp3"></span>
                    </div> 
                    </div> 
                </div>

                <label for="txtContact" class="control-label">Contact No:</label>
                <div class="row">
                    <div class="col-md-6">
                        <input type="text" class="form-control" id="txtContact" name="txtContact" placeholder="Contact No"/>
                    </div>
                    
                    <div class="col-md-6">
                        <span id="sp4"></span>
                    </div>
                </div>

                <label for="txtAddress" class="control-label">Address:</label>
                <div class="row">
                    <div class="col-md-6">
                        <input type="text" class="form-control" id="txtAddress" name="txtAddress" placeholder="Address"/>
                    </div> 
                    
                     <div class="col-md-6">
                         <span id="sp5"></span>
                    </div> 
                </div>


                <label for="ddlCity" class="control-label">City:</label>
                <div class="row">
                    <div class="col-md-6">
                        <select class="form-control" id="ddlCity" name="ddlCity">
                            <option> Select City </option>
                            <option> Amritsar </option>
                            <option> Chandigarh </option> 
                            <option> Jalandhar </option>
                            <option> Patiala </option> 
                            <option> Ludhiana </option>
                        </select>
                    </div>
                     <div class="col-md-6">
                         <span id="sp6"></span>
                    </div> 
                </div> 

                <label for="txtUserId" class="control-label">User Id:</label>
                <div class="row">
                    <div class="col-md-6">
                        <input type="text" class="form-control" id="txtUserId" name="txtUserId" placeholder="User Id"/>
                    </div>
                    
                     <div class="col-md-6">
                         <span id="sp7"></span>
                    </div> 
                </div>  

                <label for="txtPasword" class="control-label">Password:</label>
                <div class="row">
                    <div class="col-md-6">
                        <input type="password" class="form-control" id="txtPassword" name="txtPassword" placeholder="password"/>
                    </div> 
                     <div class="col-md-6">
                         <span id="sp8"></span>
                    </div> 
                    
                </div>

               
                
                <label for="txtConfirmPassword" class="control-label"> Confirm Password:</label>
                <div class="row">
                    <div class="col-md-6">
                        <input type="password" class="form-control" id="txtConfirmPassword" name="txtConfirmPassword" placeholder="Confirm password"/>
                    </div>    
                     <div class="col-md-6">
                         <span id="sp9"></span>
                    </div> 
                </div>

                <label for="ddlSecurityQuestion" class="control-label">Security Question:</label>
                <div class="row">
                    <div class="col-md-6">
                        <select class="form-control" id="ddlSecurityQuestion" name="ddlSecurityQuestion">
                            <option> Select Question </option>
                            <option> Name of favorite book </option>
                            <option> Name of Birth place </option> 
                            <option> Favorite Song </option>
                            <option> First School Name </option> 
                            <option> Name of favorite Author </option>
                        </select>
                    </div>
                     <div class="col-md-6">
                         <span id="sp10"></span>
                    </div> 
                </div> 
                
                 <label for="txtAnswer" class="control-label">Answer:</label>
                <div class="row">
                    <div class="col-md-6">
                        <input type="password" class="form-control" id="txtAnswer" name="txtAnswer" placeholder="answer"/>
                    </div>
                     <div class="col-md-6">
                         <span id="sp11"></span>
                    </div> 
                </div>  

                <div class="row" style="padding-top: 20px">
                    
                    <div class="col-md-2">
                       
                    </div>
                    <div class="col-md-4">
                        <input type="submit" class="form-control btn-success btn-sm" name="Registerbtn" value="Submit" onclick="return validateData()">
                    </div>

                    <div class="col-md-4">
                        <input type="reset" class="form-control btn-info btn-sm" name="Resetbtn" value="Reset"/>
                    </div>
                    <div class="col-md-2">
                        
                    </div>

                  <%
                      if(request.getParameter("flag")!=null)
                      {
                  %>
                  <div class="row">
                      <div class="col-md-12">
                      "Some Server Error"
                      </div>
                  </div>
                  <%}%>
                </div>           

            </form>
        </div>
    </div>



   
</div>    
<%@include file="footer.jsp"%>