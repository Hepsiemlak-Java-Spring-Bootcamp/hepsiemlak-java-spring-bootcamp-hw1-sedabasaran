package Hafta1.Hw1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Kullanici {
    String kullaniciTipi; // bireysel & kurumsal & yeniTip
    String ad;
    String soyad;
    String email;
    String fotograf;
    String biyografi;
    String vkn;

    public Kullanici(String kullaniciTipi, String ad, String soyad, String email){
        super();
        this.kullaniciTipi = kullaniciTipi;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
    }


    Set<Ilan> favoriIlanlar = new HashSet<>();
    List<Ilan> yayinladigiIlanlar = new ArrayList<>();
    List<Mesaj> mesajKutusu;


    public String getKullaniciTipi() {
        return kullaniciTipi;
    }

    public void setKullaniciTipi(String kullaniciTipi) {
        this.kullaniciTipi = kullaniciTipi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFotograf() {
        return fotograf;
    }

    public void setFotograf(String fotograf) {
        this.fotograf = fotograf;
    }

    public String getBiyografi() {
        return biyografi;
    }

    public void setBiyografi(String biyografi) {
        this.biyografi = biyografi;
    }

    public String getVkn() {
        return vkn;
    }

    public void setVkn(String vkn) {
        this.vkn = vkn;
    }

    public Set<Ilan> getFavoriIlanlar() {
        return favoriIlanlar;
    }

    public void setFavoriIlanlar(Set<Ilan> favoriIlanlar) {
        this.favoriIlanlar = favoriIlanlar;
    }

    public List<Ilan> getYayinladigiIlanlar() {
        return yayinladigiIlanlar;
    }

    public void setYayinladigiIlanlar(List<Ilan> yayinladigiIlanlar) {
        this.yayinladigiIlanlar = yayinladigiIlanlar;
    }

    public List<Mesaj> getMesajKutusu() {
        return mesajKutusu;
    }

    public void setMesajKutusu(List<Mesaj> mesajKutusu) {
        this.mesajKutusu = mesajKutusu;
    }





}
