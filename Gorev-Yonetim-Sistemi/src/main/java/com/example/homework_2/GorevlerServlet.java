package com.example.homework_2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name = "GorevlerServlet", value = "/gorevlerservlet")
public class GorevlerServlet extends HttpServlet {

    private  Gorevlerveri gorevlerveri = new Gorevlerveri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        List<Gorevler> gorevler= null;
        try {
            gorevler = gorevlerveri.gorevlergetir();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        List<Gorevler> acilgorevler= new ArrayList<>();
        List<Gorevler> stabilgorevler= new ArrayList<>();
        List<Gorevler> gereksizgorevler= new ArrayList<>();
        Date dateObj = Calendar.getInstance().getTime();
        DateFormat tarihFormat = new SimpleDateFormat("dd");
        String tarih = tarihFormat.format(dateObj);
        DateFormat tarihFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String tarih2 = tarihFormat2.format(dateObj);

        for (int i = 0; i <gorevler.size() ; i++) {
            if(gorevler.get(i).getGorevonc().length()==4 && gorevler.get(i).getGorevtar()>=Integer.parseInt(tarih)){
            acilgorevler.add(gorevler.get(i));

            }
            if(gorevler.get(i).getGorevonc().length()==6 && gorevler.get(i).getGorevtar()>=Integer.parseInt(tarih)){
                stabilgorevler.add(gorevler.get(i));
            }
            if(gorevler.get(i).getGorevonc().length()==8 && gorevler.get(i).getGorevtar()>=Integer.parseInt(tarih)){
                gereksizgorevler.add(gorevler.get(i));
            }



        }
        List<Gorevler> gecmisgorevler= new ArrayList<>();
        List<Gorevler> gecmemisgorevler= new ArrayList<>();
        for (int i = 0; i <gorevler.size() ; i++) {
            if(gorevler.get(i).getGorevtar()<Integer.parseInt(tarih)){
                gecmisgorevler.add(gorevler.get(i));

            }
            if(gorevler.get(i).getGorevtar()>=Integer.parseInt(tarih)){
                gecmemisgorevler.add(gorevler.get(i));

            }



        }
        request.setAttribute("tarih", tarih2);
        request.setAttribute("gecmis", gecmisgorevler);
        request.setAttribute("gecmemis", gecmemisgorevler);
        request.setAttribute("acilgorev", acilgorevler);
        request.setAttribute("stabilgorev", stabilgorevler);
        request.setAttribute("gereksizgorev", gereksizgorevler);

        RequestDispatcher ds = request.getRequestDispatcher("/dashboard.jsp");

        try {
            ds.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);


        }
    }

        public void destroy() {
        }
    }
