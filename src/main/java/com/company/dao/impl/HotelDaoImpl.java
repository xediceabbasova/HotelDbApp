package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.HotelDaoInter;
import com.company.identity.Hotel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class HotelDaoImpl extends AbstractDao implements HotelDaoInter {

    public Hotel getHotel(ResultSet rs) throws Exception {

        int id = rs.getInt("id");
        String customerName = rs.getString("customer_name");
        String customerSurname = rs.getString("customer_surname");
        String identityId = rs.getString("identity_id");
        Date dateIn = rs.getDate("date_in");
        Date dateOut = rs.getDate("date_out");
        double price = rs.getDouble("price");
        int roomId = rs.getInt("room_id");

        Hotel h = new Hotel(id, customerName, customerSurname, identityId, dateIn, dateOut, price, roomId);

        return h;

    }

    @Override
    public List<Hotel> getAll() {

        List<Hotel> result = new ArrayList<>();

        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from hotel_table;");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                Hotel h = getHotel(rs);
                result.add(h);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public Hotel getById(int id) {

        Hotel h = null;

        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from hotel_table where id= " + id);

            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                h = getHotel(rs);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return h;
    }

    @Override
    public boolean updateHotel(Hotel h) {

        try ( Connection c = connect()) {

            PreparedStatement stmt = c.prepareStatement("update hotel_table set customer_name=?, customer_surname=?, identity_id=?, date_in=?, date_out=?, price=?, room_id=? where id=?");
            stmt.setString(1, h.getCustomerName());
            stmt.setString(2, h.getCustomerSurname());
            stmt.setString(3, h.getIdentityId());
            stmt.setDate(4, h.getDateIn());
            stmt.setDate(5, h.getDateOut());
            stmt.setDouble(6, h.getPrice());
            stmt.setInt(7, h.getRoomId());
            stmt.setInt(8, h.getId());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addHotel(Hotel h) {

        try ( Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into hotel_table(customer_name,customer_surname,identity_id,date_in,date_out,price,room_id) values(?,?,?,?,?,?,?)");
            stmt.setString(1, h.getCustomerName());
            stmt.setString(2, h.getCustomerSurname());
            stmt.setString(3, h.getIdentityId());
            stmt.setDate(4, h.getDateIn());
            stmt.setDate(5, h.getDateOut());
            stmt.setDouble(6, h.getPrice());
            stmt.setInt(7, h.getRoomId());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;

    }

    @Override
    public boolean removeHotel(int id) {

        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("delete from hotel_table where id= " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
