package edu.sau.nyat.nyat1;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class AkilliCihaz implements ICihaz{

    private IAgArayuzu agArayuzu;
    private IAnaIslemPlatformu m;

    @Override
    public void createCihaz() throws SQLException {
        agArayuzu=new AgArayuzu();
        m =new AnaIslemPlatformu();

        agArayuzu.attach(m);

        try{
            agArayuzu.islemSeciniz();

        }catch (Exception e){

        }
    }
}
