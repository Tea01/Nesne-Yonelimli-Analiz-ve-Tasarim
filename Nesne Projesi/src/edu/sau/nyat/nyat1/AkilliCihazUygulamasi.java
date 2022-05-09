package edu.sau.nyat.nyat1;

import java.sql.SQLException;

public class AkilliCihazUygulamasi {
    public static void main(String[] args) throws SQLException {

        IstemciModul istemci1 = new IstemciModul(new AkilliCihazFactory());
        istemci1.create();
    }
}
