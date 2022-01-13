package market_Projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reyonlar extends Ekleme{
    static Musteri mstr=new Musteri();
    static String secim;
    static List<String> sepet=new ArrayList<String>();

    public static  void temizlik() {
        Scanner scan=new Scanner (System.in);
        System.out.println("Urun\t\t\tFiyati");
        System.out.println("====\t\t\t======");
        temizlikList.stream().forEach(t-> System.out.println(t));
        System.out.print("Sectiginiz urunun ismini yaziniz => ");
        secim=scan.nextLine();
        secim = secim.substring(0,1).toUpperCase() + secim.substring(1).toLowerCase();
        alisVeris(temizlikList,secim);
    }


   public static void alisVeris(List<Ekleme> list,String secim) {
       for (int i = 0; i <list.size(); i++) {
           if(list.get(i).getIsim().contains(secim)){
               setSepet(getSepet()+list.get(i).getUcret());
               System.out.println(getSepet());
               break;
       }
      }
       dewam();

   }

    private static void dewam() {
        Scanner scan=new Scanner (System.in);
        System.out.println("Yapacaginiz islemi seciniz => " +
                "\n1-)Alisverise devam etmek istiyorum" +
                "\n2-)Cikmak istiyorum");
        int tercih=scan.nextInt();
        switch (tercih){
            case 1:
                mstr.musteri();
                break;
            case 2:
                cikis();
                break;
            default :
                System.out.println("Hatali giris yaptiniz ");
                break;
        }

    }

    private static void cikis() {
        System.out.println("IYI GUNLER DILERIZ \n\tBIR DAHA BEKLERİZ ");
    }

    public static void unluMamul() {

    }
    public static void hazirYiyecek() {

    }

    public static void manav() {

    }

    public static void kozmetik() {

    }


}
