package com.company.main;

import com.company.dao.impl.HotelDaoImpl;
import com.company.dao.inter.HotelDaoInter;

public class Context {

    public static HotelDaoInter instanceHotelDao() {
        return new HotelDaoImpl();

    }
}
