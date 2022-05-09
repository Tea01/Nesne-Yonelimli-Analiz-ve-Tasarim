package edu.sau.nyat.nyat1;

import java.sql.SQLException;

public class IstemciModul {

    ICihazFactory cihazFactory;

    public IstemciModul(ICihazFactory cihazFactory){
        this.cihazFactory = cihazFactory;
    }
    public void create() throws SQLException {
        ICihaz akilliCihaz = cihazFactory.factoryMethod();
        akilliCihaz.createCihaz();

    }
}
