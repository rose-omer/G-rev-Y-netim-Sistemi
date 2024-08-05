package com.example.homework_2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "GorevSilServlet", value = "/gorevsil")
public class GorevSilServlet extends HttpServlet {

    private Gorevlerveri gorevlerveri =new Gorevlerveri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            String gorevid=request.getParameter("gorevid");

            gorevlerveri.GorevlSil(Integer.parseInt(gorevid));
            response.sendRedirect(request.getContextPath()+ "/gorevlerservlet");



        }catch (Exception ex) {
            throw new RuntimeException();
        }





    }

    public void destroy() {
    }
}