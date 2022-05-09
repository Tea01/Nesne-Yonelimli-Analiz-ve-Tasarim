package edu.sau.nyat.nyat1;

import java.sql.SQLException;

public interface IKullanici {
    public void sistemeGiris() throws SQLException;
    public String getAd();
    public String getSoyad();
}
