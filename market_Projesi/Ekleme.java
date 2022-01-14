package market_Projesi;

public class Ekleme extends Data {
    String isim;
    double ucret;
    int adet;
    static double sepet;

    Ekleme() {

    }

    @Override
    public String toString() {
        return  "Urun_Ismi=> "+isim + " Ucreti => "+ucret ;
    }

    public Ekleme(String isim, double ucret) {
        this.isim = isim;
        this.ucret = ucret;
    }

    public Ekleme(int adet,String isim, double ucret) {
        this.adet=adet;
        this.isim = isim;
        this.ucret = ucret;
    }

    public int getAdet() {return adet;    }

    public void setAdet(int adet) {  this.adet = adet;    }

    public String getIsim() { return isim; }

    public void setIsim(String isim) { this.isim = isim;    }

    public double getUcret() { return ucret; }

    public void setUcret(double ucret) { this.ucret = ucret;    }

    public static double getSepet() { return sepet;  }

    public static void setSepet(double sepet) { Ekleme.sepet = sepet;   }


}
