package edu.sau.nyat.nyat1;

import java.sql.*;

public class VeriTabani implements IVeriTabani {

    private Connection conn;

    public VeriTabani() throws SQLException {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/admin",
                "postgres", "e182a3.,");
        if (conn != null)
            System.out.println("Ağa bağlandı!");
        else
            System.out.println("Bağlantı girişimi başarısız!");
    }
    @Override
    public ResultSet kullanici(String ad,String sifre) throws SQLException {
        String query="select \"ad\", \"soyad\",\"kullaniciadi\",\"sifre\" from \"kullanici\" where \"kullaniciadi\" = '"+ad+"' and \"sifre\" ='"+sifre+"'";
        ResultSet rs=null;
        Statement stm = null;
        try {
            stm = conn.createStatement();
            rs=stm.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }
}