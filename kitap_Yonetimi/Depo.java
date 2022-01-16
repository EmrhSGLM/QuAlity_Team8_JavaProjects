package kitap_Yonetimi;

import java.util.ArrayList;
import java.util.List;

public class Depo{

     int id;
     String kitapAd;
     String yazarAd;
     String yazarSoyad;
     String yayinEvi;
     String basimYili;

     public Depo() {

     }
    @Override
    public String toString() {
        return "Kitap Bilgileri => {" +
                "id=" + id +
                ", kitapAd='" + kitapAd + '\'' +
                ", yazarAd='" + yazarAd + '\'' +
                ", yazarSoyad='" + yazarSoyad + '\'' +
                ", yayinEvi='" + yayinEvi + '\'' +
                ", basimYili='" + basimYili + '\'' +
                '}';
    }

    public Depo(int id, String kitapAd, String yazarAd, String yazarSoyad, String yayinEvi, String basimYili) {
        this.id = id;
        this.kitapAd = kitapAd;
        this.yazarAd = yazarAd;
        this.yazarSoyad = yazarSoyad;
        this.yayinEvi = yayinEvi;
        this.basimYili = basimYili;
    }

    public int getId() { return id;    }

    public void setId(int id) {  this.id = id;    }

    public String getKitapAd() { return kitapAd;    }

    public void setKitapAd(String kitapAd) { this.kitapAd = kitapAd;    }

    public String getYazarAd() {  return yazarAd;    }

    public void setYazarAd(String yazarAd) {  this.yazarAd = yazarAd;    }

    public String getYazarSoyad() { return yazarSoyad;    }

    public void setYazarSoyad(String yazarSoyad) { this.yazarSoyad = yazarSoyad;    }

    public String getYayinEvi() { return yayinEvi;    }

    public void setYayinEvi(String yayinEvi) {  this.yayinEvi = yayinEvi;    }

    public String getBasimYili() {  return basimYili;    }

    public void setBasimYili(String basimYili) {  this.basimYili = basimYili;    }
}
