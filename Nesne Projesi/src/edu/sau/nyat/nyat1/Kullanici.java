package edu.sau.nyat.nyat1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Kullanici implements IKullanici {

    private String ad;
    private String soyad;
    private String kullaniciAdi;
    private String sifre;
    private VeriTabani veritabaniBaglanti;

    public Kullanici() throws SQLException {
        veritabaniBaglanti = new VeriTabani();
        sistemeGiris();
    }

    @Override
    public void sistemeGiris() throws SQLException {
        System.out.println("************************Soğutucu Sistemine Hoşgeldiniz**********************************");
        System.out.println("************************Devam Etmek için Kullanıcı Adınızı ve şifrenizi Giriniz**********************************");
        boolean durum= true;
        while (durum){
            try{
                setKullaniciAdi();
                setSifre();
                if(!kontrol()) durum=false;
            }catch (Exception e){
                System.out.println("Kontrol İşlemi Başarısızdır!");
            }
        }
    }
    private void setKullaniciAdi(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanici Adinizi Giriniz.....");
        this.kullaniciAdi=scanner.nextLine();
    }
    private void setSifre(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sifrenizi Giriniz.....");
        this.sifre=scanner.nextLine();
    }

    @Override
    public String getAd(){
        return this.ad;
    }

    @Override
    public String getSoyad() {
        return this.soyad;
    }

    private boolean kontrol() throws SQLException {
        boolean hata=true;
        ResultSet rs = veritabaniBaglanti.kullanici(this.kullaniciAdi,this.sifre);
        rs.next();
        try{
            if(rs.getString("kullaniciadi").equals(this.kullaniciAdi) && rs.getString("sifre").equals(this.sifre)){
                this.ad=rs.getString("ad");
                this.soyad=rs.getString("soyad");
                hata=false;
            }
        }catch (Exception e){
            System.out.println("Kullanici Adi ve ya Şifre Hatalı");
        }
        return hata;
    }
}