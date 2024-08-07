/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.porject;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class servlet1 extends HttpServlet {

    @Override 
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
    {
        PrintWriter out=resp.getWriter();
        String name=req.getParameter("username");
        String pass=req.getParameter("userpass");
        
        
        if(pass.equals("Pass@123") && name.equals("Kedar"))
        {
            resp.sendRedirect("choice.html");
        }
       else {
       resp.setContentType("text/html");
       out.print("<h5>Login or Password is incorrect</h5>");
       RequestDispatcher dispatcher = req.getRequestDispatcher("/loginpage.html");
       dispatcher.include(req, resp);
}

        
        
        
        
    }

}
