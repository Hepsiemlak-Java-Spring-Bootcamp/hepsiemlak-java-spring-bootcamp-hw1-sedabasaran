package Hafta1.Hw1;

import java.util.Date;
public class Mesaj {
    String baslik;
    String icerigi;
    //Date gonderilenTarih;
   // Date okunduguTarihi;
    boolean gorulduMu;
    Kullanici gonderici;
    Kullanici alici;


    public Mesaj(String baslik, String icerigi,Kullanici gonderici,Kullanici alici, boolean gorulduMu) {
        super();
        this.baslik = baslik;
        this.icerigi = icerigi;
        //this.gonderilenTarih = gonderilenTarih;
        //this.okunduguTarihi = okunduguTarihi;
        this.gorulduMu = gorulduMu;
        this.gonderici = gonderici;
        this.alici = alici;
    }



    public Mesaj(String baslik) {
        super();
        this.baslik = baslik;
       // this.gonderici = gonderici;
       // this.alici = alici;

    }

    public Mesaj(Kullanici gonderici, Kullanici alici){
        this.gonderici = gonderici;
        this.alici = alici;
    }



    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIcerigi() {
        return icerigi;
    }

    public void setIcerigi(String icerigi) {
        this.icerigi = icerigi;
    }
/*
    public Date getGonderilenTarih() {
        return gonderilenTarih;
    }

    public void setGonderilenTarih(Date gonderilenTarih) {
        this.gonderilenTarih = gonderilenTarih;
    }

    public Date getOkunduguTarihi() {
        return okunduguTarihi;
    }

    public void setOkunduguTarihi(Date okunduguTarihi) {
        this.okunduguTarihi = okunduguTarihi;
    }
*/
    public boolean isGorulduMu() {
        return gorulduMu;
    }

    public void setGorulduMu(boolean gorulduMu) {
        this.gorulduMu = gorulduMu;
    }

    public Kullanici getGonderici() {
        return gonderici;
    }

    public void setGonderici(Kullanici gonderici) {
        this.gonderici = gonderici;
    }

    public Kullanici getAlici() {
        return alici;
    }

    public void setAlici(Kullanici alici) {
        this.alici = alici;
    }


}
