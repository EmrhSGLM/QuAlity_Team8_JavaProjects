package market_Projesi;

import java.util.Scanner;

public class Odeme extends Ekleme {
    static double tutar;
    static Reyonlar re=new Reyonlar();

    protected static void odeme(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Satin alacaginiz urunler => ");
        sepetListe.stream().forEach(t-> System.out.println(t.getAdet()+"=>"+
                t.getIsim()+","+t.getUcret()));
        System.out.println("Toplam Borcunuz => " + getSepet());
        for(int i=1;i>0;i++) {
            System.out.println("Odeme yapacaginiz tutari giriniz => ");
            tutar = scan.nextDouble();
            if(tutar==getSepet()){
                System.out.println("Odemeniz basariyla gerceklesti ");
                re.cikis();
                break;
            }else if(tutar > getSepet()){
                System.out.println("Para Ustunuz => " + (tutar - getSepet()));
                re.cikis();
                break;
            } else if(tutar < getSepet()) {
                System.out.println("Yetersiz odeme");
                System.out.println("Ek olarak odeyeceginiz tutar => " + (getSepet() - tutar));
                setSepet(getSepet() - tutar);
            }


        }

    }
}
