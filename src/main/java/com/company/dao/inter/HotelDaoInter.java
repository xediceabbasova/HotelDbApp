package com.company.dao.inter;

import com.company.identity.Hotel;
import java.util.List;

public interface HotelDaoInter {

    public List<Hotel> getAll();

    public Hotel getById(int id);

    public boolean updateHotel(Hotel h);

    public boolean addHotel(Hotel h);

    public boolean removeHotel(int id);

}
