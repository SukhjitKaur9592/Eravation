package servlet;

import dataLayer.DALUser;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class User extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if (request.getParameter("Registerbtn") != null) {
            
            beans.User us = new beans.User();
           
            us.setName(request.getParameter("txtName"));
            us.setGender(request.getParameter("rbtGender"));
            us.setAddress(request.getParameter("txtAddress"));
            us.setCity(request.getParameter("ddlCity"));
            us.setContactNo(request.getParameter("txtContact"));
            us.setEmailId(request.getParameter("txtMail"));
            us.setUserId(request.getParameter("txtUserId"));
            us.setPassword(request.getParameter("txtPassword"));
            us.setSecurityQuestion(request.getParameter("ddlSecurityQuestion"));
            us.setAnswer(request.getParameter("txtAnswer"));
            us.setProfilePic(("img1.jpg"));
            dataLayer.DALUser objDAL = new dataLayer.DALUser();
            objDAL.register(us);
            
            if (us == null) {
                response.sendRedirect("Registration.jsp?flag=-1");

            } else {
                            
                               response.sendRedirect("Login.jsp");
            }

        } else if (request.getParameter("Loginbtn") != null) {
            String a = request.getParameter("txtUserId");
            String b = request.getParameter("txtPassword");
            dataLayer.DALUser objDAL = new DALUser();
            beans.User us = objDAL.authenticateUser(a, b);
            if (us == null) {
                response.sendRedirect("Login.jsp?flag=-1");

            } else {
                HttpSession session = request.getSession();
                session.setAttribute("LRID", us.getUserNo());
                session.setAttribute("NM", us.getName());
                response.sendRedirect("UserPages/Welcome.jsp");

            }
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
