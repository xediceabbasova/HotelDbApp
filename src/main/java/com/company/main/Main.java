package com.company.main;

import com.company.dao.inter.HotelDaoInter;
import com.company.identity.Hotel;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws Exception {

        HotelDaoInter dao = Context.instanceHotelDao();
//        System.out.println(dao.getAll());

//        System.out.println(dao.getById(1));

//        Hotel h = dao.getById(1);
//        h.setPrice(500);
//        dao.updateHotel(h);

//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        java.util.Date d = sdf.parse("27-09-2003");
//        long l = d.getTime();
//        java.sql.Date dd = new Date(l);
//        Hotel h = new Hotel(1, "Kovser", "Abbasova", "sg521", dd, dd, 500, 5);
//        dao.addHotel(h);

//        dao.removeHotel(2);

    }
}
