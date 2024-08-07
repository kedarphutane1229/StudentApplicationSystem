/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.porject;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class servlet3 extends HttpServlet {
    public List<Student> students = new ArrayList<Student>();
   @Override
   protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
   {
       PrintWriter out = resp.getWriter();
    ServletContext context = getServletContext();
    String option = (String) context.getAttribute("option");

    if ("2".equals(option)) {
        resp.setContentType("text/html");
        out.print("<h3>Student List:</h3>");
        for (Student student : students) {
            out.print("<p>Name: " + student.getName() + ", Roll No: " + student.getRollNo() + ", Address: " + student.getAddress() + "</p>");
        }
        context.removeAttribute("option"); // Clean up the context attribute after use
    } else {
        String name = req.getParameter("name");
        String rollno = req.getParameter("rollno");
        String address = req.getParameter("address");

        if (name == null || rollno == null || address == null) {
            resp.setContentType("text/html");
            out.print("Please fill all fields ");
            RequestDispatcher disp = req.getRequestDispatcher("index.html");
            disp.include(req, resp);
        } else {
            int rolln = Integer.parseInt(rollno);
            students.add(new Student(name, rolln, address));
            resp.setContentType("text/html");
            out.print("<h3>Information Submitted Successfully</h3>");
            RequestDispatcher disp = req.getRequestDispatcher("choice.html");
            disp.include(req, resp);
        }
    }
      
       
   }
}


