package dataLayer;

import java.sql.PreparedStatement;
import java.sql.*;

public class DALUser extends DBOperations {

    public DALUser() {
        makeConnection();
    }

    public void register(beans.User user) {
        try {
            
           
            PreparedStatement ps = con.prepareStatement("insert into Registrations values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, user.getName());
            ps.setString(2, user.getGender());
            ps.setString(3, user.getEmailId());
            ps.setString(4, user.getContactNo());
            ps.setString(5, user.getAddress());
            ps.setString(6, user.getCity());
            ps.setString(7, user.getUserId());
            ps.setString(8, user.getPassword());
            ps.setString(9, user.getSecurityQuestion());
            ps.setString(10, user.getAnswer());
            ps.setString(11, user.getProfilePic());
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
     public beans.User authenticateUser(String uid, String pwd) {
        beans.User user = null;
        try {
            PreparedStatement ps = con.prepareStatement("select * from Registrations where UserId=? and Password=?");
            ps.setString(1, uid);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            if (rs.next() == true) {
                user = new beans.User();
                user.setUserNo(rs.getInt("UserNo"));
                user.setName(rs.getString("Name"));
                user.setGender(rs.getString("Gender"));
                user.setAddress(rs.getString("Address"));
                user.setCity(rs.getString("City"));
                user.setContactNo(rs.getString("ContactNo"));
                user.setEmailId(rs.getString("Emailid"));
                user.setUserId(rs.getString("UserId"));
                user.setPassword(rs.getString("Password"));
                user.setSecurityQuestion(rs.getString("SecurityQuestion"));
                user.setAnswer(rs.getString("Answer"));
                user.setProfilePic(rs.getString("ProfilePic"));

            }
            rs.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return user;
    }
     public beans.User getUserData (int pUserNo){
      beans.User user=null;
      try{
          PreparedStatement ps= con.prepareStatement("Select * from Registrations where UserNo=?");
          ps.setInt(1, pUserNo);
          
          ResultSet rs= ps.executeQuery();
          if(rs.next()==true)
          {
              user=new beans.User();
              
               user.setUserNo(rs.getInt("UserNo"));
              user.setName(rs.getString("Name"));
                user.setGender(rs.getString("Gender"));
                user.setAddress(rs.getString("Address"));
                user.setCity(rs.getString("City"));
                user.setContactNo(rs.getString("ContactNo"));
                user.setEmailId(rs.getString("EmailId"));
                user.setUserId(rs.getString("UserId"));
                user.setPassword(rs.getString("Password"));
                user.setSecurityQuestion(rs.getString("SecurityQuestion"));
                user.setAnswer(rs.getString("Answer"));
                user.setProfilePic(rs.getString("ProfilePic"));
              
          }         
          rs.close();
            
      }         
      catch(Exception ex){
      System.out.println(ex);
    }
      return user;
}

}
