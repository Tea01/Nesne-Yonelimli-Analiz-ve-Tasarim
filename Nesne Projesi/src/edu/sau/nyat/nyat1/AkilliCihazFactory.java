package edu.sau.nyat.nyat1;

import java.sql.SQLException;

public class AkilliCihazFactory implements ICihazFactory {

    @Override
    public ICihaz factoryMethod() throws SQLException {

        AkilliCihaz akilliCihaz = new AkilliCihaz();

        return akilliCihaz;
    }
}
