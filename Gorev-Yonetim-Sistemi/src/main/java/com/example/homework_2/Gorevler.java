package com.example.homework_2;

public class Gorevler {

    private int id;
    private String gorevadi;
    private String gorevonc;


    private String gorevyet;

    private int gorevtar;




    public Gorevler(String gorevadi, String gorevonc, String gorevyet, Integer gorevtar) {
        this.gorevadi = gorevadi;
        this.gorevonc = gorevonc;
        this.gorevyet = gorevyet;
        this.gorevtar =gorevtar;
    }

    public Gorevler(String gorevadi, String gorevonc, String gorevyet, int gorevtar) {
        this.gorevadi = gorevadi;
        this.gorevonc = gorevonc;
        this.gorevyet = gorevyet;
        this.gorevtar = gorevtar;
    }

    public Gorevler(int id, String gorevadi, String gorevonc, String gorevyet) {
        this.id = id;
        this.gorevadi = gorevadi;
        this.gorevonc = gorevonc;
        this.gorevyet = gorevyet;
    }

    public Gorevler(int id, String gorevadi, String gorevonc, String gorevyet, int gorevtar) {
        this.id = id;
        this.gorevadi = gorevadi;
        this.gorevonc = gorevonc;
        this.gorevyet = gorevyet;
        this.gorevtar = gorevtar;
    }

    public int getGorevtar() {
        return gorevtar;
    }

    public void setGorevtar(int gorevtar) {
        this.gorevtar = gorevtar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGorevadi() {
        return gorevadi;
    }

    public void setGorevadi(String gorevadi) {
        this.gorevadi = gorevadi;
    }

    public String getGorevonc() {
        return gorevonc;
    }

    public void setGorevonc(String gorevonc) {
        this.gorevonc = gorevonc;
    }

    public String getGorevyet() {
        return gorevyet;
    }

    public void setGorevyet(String gorevyet) {
        this.gorevyet = gorevyet;
    }


}
