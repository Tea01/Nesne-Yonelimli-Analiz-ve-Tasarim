package edu.sau.nyat.nyat1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public interface IVeriTabani {
    public ResultSet kullanici(String ad,String sifre) throws SQLException;
}
