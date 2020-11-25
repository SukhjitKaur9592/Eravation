<%@page import="dataLayer.DALUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<%
    int LRID=Integer.parseInt(session.getAttribute("LRID").toString());
    dataLayer.DALUser objDAL=new DALUser();
    beans.User us=objDAL.getUserData(LRID);
    
  %>  
  <table class="table">
      <tr>
          <th style="width:200px;">Name</th>
          <td><%=us.getName()%></td>
      </tr>
      <tr>
          <th>Gender</th>
          <td><%=us.getGender()%></td>
      </tr>
      
       <tr>
          <th>Address</th>
          <td><%=us.getAddress()%></td>
      </tr>
      <tr>
          <th>City</th>
          <td><%=us.getCity()%></td>
      </tr>
       <tr>
          <th>Contact No</th>
          <td><%=us.getContactNo()%></td>
      </tr>
       <tr>
          <th>Email Id</th>
          <td><%=us.getEmailId()%></td>
      </tr>
      
  </table>
<%@include file="footer.jsp"%>