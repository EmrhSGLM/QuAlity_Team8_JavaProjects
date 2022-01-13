package market_Projesi;

public class Ekleme extends Data {
    String isim;
    double ucret;
    static double sepet;

    Ekleme() {

    }

    @Override
    public String toString() {
        return  isim + ucret ;
    }

    public Ekleme(String isim, double ucret) {
        this.isim = isim;
        this.ucret = ucret;
    }

    public String getIsim() { return isim; }

    public void setIsim(String isim) { this.isim = isim;    }

    public double getUcret() { return ucret; }

    public void setUcret(double ucret) { this.ucret = ucret;    }

    public static double getSepet() { return sepet;  }

    public static void setSepet(double sepet) { Ekleme.sepet = sepet;   }


}
