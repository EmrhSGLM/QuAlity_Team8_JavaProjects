package kitap_Yonetimi;

import java.util.ArrayList;
import java.util.List;

public class Depo{

     int id;
     String kitapAd;
     String yazarAdSoyad;
     String yayinEvi;
     String basimYili;

     public Depo() {

     }
    @Override
    public String toString() {
        return "Kitap Bilgileri => {" +
                "id=" + id +
                ", kitapAd='" + kitapAd + '\'' +
                ", yazarAd='" + yazarAdSoyad + '\'' +
                ", yayinEvi='" + yayinEvi + '\'' +
                ", basimYili='" + basimYili + '\'' +
                '}';
    }

    public Depo(int id, String kitapAd, String yazarAdSoyad, String yayinEvi, String basimYili) {
        this.id = id;
        this.kitapAd = kitapAd;
        this.yazarAdSoyad = yazarAdSoyad;
        this.yayinEvi = yayinEvi;
        this.basimYili = basimYili;
    }

    public int getId() { return id;    }

    public void setId(int id) {  this.id = id;    }

    public String getKitapAd() { return kitapAd;    }

    public void setKitapAd(String kitapAd) { this.kitapAd = kitapAd;    }

    public String getYazarAdSyad() {  return yazarAdSoyad;    }

    public void setyazarAdSoyad(String yazarAdSoyad) {  this.yazarAdSoyad = yazarAdSoyad;    }

    public String getYayinEvi() { return yayinEvi;    }

    public void setYayinEvi(String yayinEvi) {  this.yayinEvi = yayinEvi;    }

    public String getBasimYili() {  return basimYili;    }

    public void setBasimYili(String basimYili) {  this.basimYili = basimYili;    }
}
