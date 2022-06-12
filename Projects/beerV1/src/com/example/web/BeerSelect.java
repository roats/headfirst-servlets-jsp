package com.example.web;

import com.example.model.BeerExpert;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String c = request.getParameter("color");

        BeerExpert beerExpert = new BeerExpert();
        ArrayList<String> brands = beerExpert.getBrands(c);

        request.setAttribute("styles", brands);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");

        view.forward(request, response);

//        PrintWriter out = response.getWriter();

//        response.setContentType("text/html");

//        out.println("Beer Selection Advice");
//        out.println("<br><br>");
//        out.println("Got beer color " + c);

//        for (String brand : brands) {
//            out.println("<br>try: " + brand);
//        }

    }
}