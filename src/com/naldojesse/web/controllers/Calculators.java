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

@WebServlet("")
public class Calculators extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        ArrayList<Calculator> sResults;
        Calculator currentCalculator;

        HttpSession session = request.getSession();

        sResults = (ArrayList<Calculator>) session.getAttribute("sResults");
        currentCalculator = (Calculator) session.getAttribute("currentCalculator");


        if (request.getParameter("char") != null) {
            System.out.println(request.getParameter("input_box"));
            String inputStr = request.getParameter("input_box");
            inputStr += request.getParameter("char");
            currentCalculator.setCalcString(inputStr);

        }  else if (request.getParameter("calculate") != null) {
            currentCalculator.calculate();
            System.out.println(currentCalculator.getResults());
        }

        response.sendRedirect("/");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println(request.getParameter("char"));


        ArrayList<Double> sResults;
        Calculator currentCalculator;

        HttpSession session = request.getSession();


        if (session.getAttribute("sResults") == null) {
            session.setAttribute("sResults", new ArrayList());
        }

        if (session.getAttribute("currentCalculator") == null) {
            session.setAttribute("currentCalculator", new Calculator() );
        }

        sResults = (ArrayList<Double>) session.getAttribute("sResults");
        currentCalculator = (Calculator) session.getAttribute("currentCalculator");

        request.setAttribute("sResults", sResults);
        request.setAttribute("calcString", currentCalculator.getCalcString());





        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
