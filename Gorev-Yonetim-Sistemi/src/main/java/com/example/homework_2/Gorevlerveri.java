package com.example.homework_2;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static java.lang.System.out;

public class Gorevlerveri {

    public static List<Gorevler> gorevlergetir() throws Exception {
        List<Gorevler> gorevler = new ArrayList<>();

        Connection baglanti = null;
        Statement ifade = null;
        ResultSet sonuc = null;

        try {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();
            String sql = "SELECT * FROM  gorevlerlist";
            ifade = baglanti.createStatement();
            sonuc = ifade.executeQuery(sql);

            while (sonuc.next()) {
                int id = sonuc.getInt("id");
                String gorevadi = sonuc.getString("gorevadi");
                String gorevonc = sonuc.getString("gorevonc");
                String gorevyet = sonuc.getString("gorevyet");
                Integer gorevtar = sonuc.getInt("gorevtar");

                Gorevler gorevler1 = new Gorevler(id, gorevadi, gorevonc, gorevyet,gorevtar);
                gorevler.add(gorevler1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            kapat(baglanti, ifade, sonuc);
        }
        return gorevler;
    }

    private static void kapat(Connection baglanti, Statement ifade, ResultSet sonuc) throws  Exception {


        if (sonuc != null) {
            sonuc.close();
        }
        if (ifade != null) {
            sonuc.close();

        }
        if (baglanti != null) {
            sonuc.close();

        }
    }
    public void GorevEkle(Gorevler gorev1) {

        Connection baglanti=null;
        PreparedStatement ifade=null;
        ResultSet sonuc=null;

        try {
            baglanti=VeritabaniBaglanti.veritabaniBaslat();
            String sql="INSERT INTO gorevlerlist (gorevadi,gorevonc,gorevyet,gorevtar) VALUES (?,?,?,?)";

            ifade=baglanti.prepareStatement(sql);
            ifade.setString(1,gorev1.getGorevadi());
            ifade.setString(2,gorev1.getGorevonc());
            ifade.setString(3,gorev1.getGorevyet());
            ifade.setInt(4,gorev1.getGorevtar());

            ifade.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }





    public void GorevlSil(int gorevid) {

        Connection baglanti=null;
        PreparedStatement ifade=null;
        ResultSet sonuc=null;

        try {
            baglanti=VeritabaniBaglanti.veritabaniBaslat();

            String sql="DELETE FROM gorevlerlist WHERE id=?";
            ifade=baglanti.prepareStatement(sql);
            ifade.setInt(1,gorevid);
            ifade.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


}
