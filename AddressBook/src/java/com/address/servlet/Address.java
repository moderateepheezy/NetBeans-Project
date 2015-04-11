package com.address.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author simpumind
 */
public class Address extends HttpServlet {

public static String fileName;
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        response.setContentType("text/html;charset=UTF-8");
 
            String firstname = request.getParameter("first");
            String middlename = request.getParameter("middle");
            String lastname = request.getParameter("last");
            String phone = request.getParameter("phone");
            String homeaddress = request.getParameter("homeAddress");
            String company = request.getParameter("company");
            String comPhone = request.getParameter("comPhone");
            String comAddress = request.getParameter("comAddress");
            
            fileName = CreateFile.doCreateFile(firstname, middlename, lastname, phone, 
                    homeaddress, company, comPhone, comAddress);
            
                 RequestDispatcher rd=request.getRequestDispatcher("Welcome");
                 
                 rd.forward(request,response);
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
