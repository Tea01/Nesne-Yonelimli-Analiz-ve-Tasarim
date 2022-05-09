package edu.sau.nyat.nyat1;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {
    private  double sicaklik;
    private static SicaklikAlgilayici instance;
    public static synchronized SicaklikAlgilayici getInstance(){
        if(instance == null){
            instance = new SicaklikAlgilayici();
        }
        return instance;

    }
    private SicaklikAlgilayici(){
        this.sicaklik = Math.random() *100 +0;
    }
    @Override
    public double sicaklikDegeral(){
        return this.sicaklik;
    }
}