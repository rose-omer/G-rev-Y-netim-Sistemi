package com.example.homework_2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name = "GorevEkleServlet", value = "/Gorevekle")
public class GorevEkleServlet extends HttpServlet {

    private  Gorevlerveri gorevlerveri = new Gorevlerveri();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String gorevadi=request.getParameter("gorevadi");
            String gorevonc=request.getParameter("gorevonceligi");
            String gorevyet=request.getParameter("gorevyetkilisi");
            Integer gorevtar=Integer.parseInt(request.getParameter("gorevtarihi"));
            Gorevler gorev1=new Gorevler(gorevadi,gorevonc,gorevyet,gorevtar);

            gorevlerveri.GorevEkle(gorev1);

            response.sendRedirect(request.getContextPath()+ "/gorevlerservlet");



        }catch (Exception ex) {
            throw new RuntimeException();
        }





    }

        public void destroy() {
        }
    }
