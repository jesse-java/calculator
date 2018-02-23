package com.naldojesse.web.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.http.HttpSession;
import com.naldojesse.web.models.Calculator;
import java.util.ArrayList;
import

@WebServlet("")
public class Calculators extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        ArrayList<Calculator> sResults;
        Calculator currentCalculator;

        HttpSession session = request.getSession();

        sResults = (ArrayList<Calculator>) session.getAttribute("sResults");
        currentCalculator = (Calculator) session.getAttribute("currentCalculator");


        if (request.getParameter("char") != null) {
            System.out.println(request.getParameter("char"));
            Double number = Double.valueOf(request.getParameter("char"));
            currentCalculator.performOperation(number);
        } else if (request.getParameter("operand") != null) {
            System.out.println(request.getParameter("operand"));
            String operand = request.getParameter("operand");
            currentCalculator.performOperation(operand);
        }  else if (request.getParameter("calculate") != null) {
            Calculator calc = currentCalculator.performOperation();
        }

        response.sendRedirect("/");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println(request.getParameter("char"));


        ArrayList<Calculator> sResults;
        Calculator currentCalculator;

        HttpSession session = request.getSession();


        if (session.getAttribute("sResults") == null) {
            session.setAttribute("sResults", new ArrayList());
        }

        if (session.getAttribute("currentCalculator") == null) {
            session.setAttribute("currentCalculator", new Calculator() );
        }

        sResults = (ArrayList<Calculator>) session.getAttribute("sResults");
        currentCalculator = (Calculator) session.getAttribute("currentCalculator");

        request.setAttribute("sResults", sResults);
        request.setAttribute("currentCalculator", currentCalculator);


        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
