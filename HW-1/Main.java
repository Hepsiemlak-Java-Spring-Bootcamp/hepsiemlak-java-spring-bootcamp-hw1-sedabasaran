package Hafta1.Hw1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Kullanici kullanici1 = new Kullanici("Bireysel", "Cem", "Dirman", "cemdirman@gmail.com");
        kullanici1.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici2 = new Kullanici("Bireysel", "Kadir", "H", "cilgin.kadir@gmail.com");
        kullanici2.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici3 = new Kullanici("Bireysel", "Hatice", "Dagli", "hatice.dev@gmail.com");
        kullanici3.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici4 = new Kullanici("Bireysel", "Ayşe", "Sari", "ayse.sari@gmail.com");
        kullanici4.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici5 = new Kullanici("Bireysel", "Batuhan", "İlbay", "batuhanilbay@gmail.com");
        kullanici5.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici6 = new Kullanici("Bireysel", "Ozan", "Öztürk", "ozan@gmail.com");
        kullanici6.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici7 = new Kullanici("Bireysel", "Batuhan", "Kiltac", "batu@gmail.com");
        kullanici7.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici8 = new Kullanici("Bireysel", "Halime", "Öztürk", "öztürk@gmail.com");
        kullanici8.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici9 = new Kullanici("Bireysel", "Tugba", "Yavuz", "yavuz@gmail.com");
        kullanici9.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici10 = new Kullanici("Bireysel", "Seyma", "Tezcan", "tezcan@gmail.com");
        kullanici10.mesajKutusu = prepareMesajKutusu();


        List<Kullanici> kullaniciList = new ArrayList<>();
        kullaniciList.add(kullanici1);
        kullaniciList.add(kullanici2);
        kullaniciList.add(kullanici3);
        kullaniciList.add(kullanici4);
        kullaniciList.add(kullanici5);
        kullaniciList.add(kullanici6);
        kullaniciList.add(kullanici7);
        kullaniciList.add(kullanici8);
        kullaniciList.add(kullanici9);
        kullaniciList.add(kullanici10);

        kullaniciList.forEach(kullanici -> {
            System.out.println("Ad : " + kullanici.getAd() + ", Soyad : " + kullanici.getSoyad() + ", Email : " + kullanici.getEmail());
        });


        List<Ilan> ilanListesi = new ArrayList<>();
        ilanListesi.add(prepareIlan("Sahibinden Acil Satılık", kullanici1));
        ilanListesi.add(prepareIlan("Dosta GİDERRR ACİLLL!!!", kullanici2));
        ilanListesi.add(prepareIlan("Metroya Koşarak 5 dk", kullanici3));
        ilanListesi.add(prepareIlan("Öğrenciye ve Bekara uygun", kullanici2));
        ilanListesi.add(prepareIlan("Beylikdüzü Satılık Daire Marmara Grup Farkı", kullanici5));
        ilanListesi.add(prepareIlan("Rota Yapı'dan Metrobüse 5dk Anahtar Teslim Satılık 2+1 Daire!!!", kullanici4));
        ilanListesi.add(prepareIlan("Acunlar'dan E5 Hastane. Avm Ve Okullara Yakın Satılık 2+1 Daire", kullanici6));
        ilanListesi.add(prepareIlan("Emir'den Feneryolunda 2005 Yapımı Kombili 3+1 165m2 İskanlı Lüx", kullanici7));
        ilanListesi.add(prepareIlan("İstinyepark Evleri Yetkiliden Satılık 200m2 Özel Daire / LUX", kullanici8));
        ilanListesi.add(prepareIlan("5.Levent Satılık Peyzaj Manzaralı 3+1 Daire", kullanici9));
        ilanListesi.add(prepareIlan("Onur İnşaat Tecrübe ve Güvencesi ile Onur Park Life Projesinde 3+1 Daireler", kullanici10));
        ilanListesi.add(prepareIlan("Artuklu Güvencesi ile Ells Kartal Projesinde 2+1 Daireler", kullanici2));

        ilanListesi.forEach(ilan -> {
            System.out.println("baslık : " + ilan.getBaslik() + ", kullanici : " + ilan.getKullanici());
        });



        List<Mesaj> mesajList = new ArrayList<>();
        mesajList.add(new Mesaj(kullanici2,kullanici1));
        mesajList.add(new Mesaj(kullanici3,kullanici1));
        mesajList.add(new Mesaj(kullanici4,kullanici9));

        System.out.println(mesajList);

        mesajList.forEach(mesaj -> {
            System.out.println("baslık : " + mesaj.getGonderici() + ", kullanici : " + mesaj.getAlici());
        });





    }



    private static List<Mesaj> prepareMesajKutusu() {
        List<Mesaj> mesajKutusu = new ArrayList<>();
        mesajKutusu.add(new Mesaj("baslik1"));
        mesajKutusu.add(new Mesaj("baslik2"));
        mesajKutusu.add(new Mesaj("baslik3"));

            return mesajKutusu;
    }



    private static Ilan prepareIlan(String baslik, Kullanici kullanici ) {
        Ilan ilan = new Ilan();
        ilan.setBaslik(baslik);
        ilan.setGayrimenkul(makeGayrimenkul());

        //kullanici.mesajKutusu.add(new Mesaj("acil dönüş")); // NPE

        ilan.setKullanici(kullanici);

        ilan.setAktifMi(true);

        ilan.setResimList(makeResimList());



        prepareMesajKutusu().forEach(mesaj -> {
            System.out.println("Mesaj Basliklari : " + mesaj.getBaslik() + ", İçerik : " + mesaj.getIcerigi());
        });

        for (Mesaj mesaj : kullanici.mesajKutusu) {
            System.out.println(mesaj.baslik);
        }

        return ilan;
    }

    private static String[] makeResimList() {
        String[] resimList = new String[5];
        resimList[0] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
        resimList[1] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
        resimList[2] = "https://hecdnw01.hemlak.com/ds01/4/5/5/4/7/9/7/3/2f40f751-4d75-4bc8-bc17-c032d995fd35.jpg";
        resimList[3] = "https://hecdnw01.hemlak.com/ds01/4/5/7/1/4/8/7/3/23cc0113-fb9a-4602-bb85-7d23cc82892f.jpg";
        resimList[4] = "https://hecdnw01.hemlak.com/ds01/5/5/0/7/8/3/6/3/788cedb7-9301-432f-8bd9-346725c558f1.jpg";


        return resimList;
    }

    private static Gayrimenkul makeGayrimenkul() {
        return new Gayrimenkul();
    }

}
