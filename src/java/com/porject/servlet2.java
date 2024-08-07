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
import static java.lang.System.out;

/**
 *
 * @author Admin
 */
public class servlet2 extends HttpServlet {

    
  
    @Override 
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException 
    {
        String choice=req.getParameter("choice");
        int ch = Integer.parseInt(choice);
        
        
       if(ch==1){
       
            RequestDispatcher disp = req.getRequestDispatcher("index.html");
            disp.forward(req, resp);
       }
            
       else if(ch==2)
       {
         ServletContext context=getServletContext();  
        context.setAttribute("option",choice);  
   
           RequestDispatcher disp = req.getRequestDispatcher("servlet3");
            disp.forward(req, resp);
       }
           
            
        else if(ch==0)
         {  
             resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.print("<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>Thanks for Visiting</title>"
                + "<style>"
                + "body { font-family: Arial, sans-serif; background-color: #f8f9fa; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }"
                + ".message { text-align: center; background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }"
                + ".message h1 { color: #007bff; }"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<div class='message'>"
                + "<h1>Thanks for visiting</h1>"
                + "</div>"
                + "</body>"
                + "</html>");
            out.close();
           
         }
        }
    }

 

