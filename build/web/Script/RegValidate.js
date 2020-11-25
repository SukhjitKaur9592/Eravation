function rValidate()
{
    var flag=true;
    var s1=document.getElementById("sp1");
    var s2=document.getElementById("sp2");
    var s3=document.getElementById("sp3");
    var s4=document.getElementById("sp4");
    var s5=document.getElementById("sp5");
    var s6=document.getElementById("sp6");
    var s7=document.getElementById("sp7");
    var s8=document.getElementById("sp8");
    var s9=document.getElementById("sp9");
    var s10=document.getElementById("sp10");
    var s11=document.getElementById("sp11");
   
    s1.innerHTML="";
    s2.innerHTML="";
    s3.innerHTML="";
    s4.innerHTML="";
    s5.innerHTML="";
    s6.innerHTML="";
    s7.innerHTML="";
    s8.innerHTML="";
    s9.innerHTML="";
    s10.innerHTML="";
    s11.innerHTML="";
    
    if(document.getElementById("txtName").value.length==0)
    {
        s1.innerHTML="name filed is empty";
         flag=false;
    }
    var rbt1=document.getElementById("rbtMale");
    var rbt2=document.getElementById("rbtFemale");
   
    if(rbt1.checked==false && rbt2.checked==false)
    {
        s2.innerHTML="gender is not selected";
         flag=false;
    }
    
    if(document.getElementById("txtMail").value.length==0)
    {
        s3.innerHTML="userid not entered";
         flag=false;
    }
    
    if(document.getElementById("txtContact").value.length<10)
    {
        s4.innerHTML="enter valid Contact No";
         flag=false;
    }
    
    if(document.getElementById("txtAddress").value.length==0)
    {
        s5.innerHTML="Enter Address ";
         flag=false;
    }
    
    if(document.getElementById("ddlCity").selectedIndex==0)
    {
        s6.innerHTML="select City";
         flag=false;
    }
    
     if(document.getElementById("txtUserId").value.length<8)
    {
        s7.innerHTML=" User Id must be min 8 character long";
         flag=false;
    }
     if(document.getElementById("txtPassword").value.length<9)
    {
        s8.innerHTML="password length must be min 8 character long";
         flag=false;
    }
     if(document.getElementById("txtConfirmPassword").value!=document.getElementById("txtPassword").value)
    {
        s9.innerHTML=" Re-enter Password carefully";
         flag=false;
    }
    
     if(document.getElementById("ddlSecurityQuestion").selectedIndex==0)
    {
        s10.innerHTML="Please select Security Question";
         flag=false;
    }
    
    if(document.getElementById("txtAnswer").value.length==0)
    {
        s11.innerHTML=" enter answer";
         flag=false;
    }
    
    return flag;
    
}