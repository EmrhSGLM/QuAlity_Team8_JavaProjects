package market_Projesi;

import java.util.List;
import java.util.Scanner;

public class Yetkili extends Ekleme{
    static int tercih;
    static Reyonlar rr=new Reyonlar();
    static int sayac;

    public static void update() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEkleme yapabileceginiz urun listeleri :  " +
                "\n\t1-)temizlikList " +
                "\n\t2-)unluMamul" +
                " \n\t3-)hazirYiyecek " +
                "\n\t4-)manav " +
                "\n\t5-)kozmetik " +
                "\n\t6-)Cikis" +
                "\nListeyi seciniz => ");
        tercih=scan.nextInt();
        switch(tercih) {
            case 1:
                urunEkleme(temizlikList);
                break;
            case 2:
                urunEkleme(unluMamul);
                break;
            case 3:
                urunEkleme(hazirYiyecek);
                break;
            case 4:
                urunEkleme(manav);
                break;
            case 5:
                urunEkleme(kozmetik);
                break;
            case 6:
                rr.cikis();
                break;
            default :
                System.out.println("Hatali giris");
                update();
                break;
        }
    }
    public static void urunEkleme(List<Ekleme> list) {
        Scanner scan = new Scanner(System.in);
        if (sayac == 0) {
            System.out.println("Ekleyeceginiz urunun ismini giriniz => ");
            String isim = scan.nextLine();
            System.out.println("Ekleyeceginiz urunun ucretini giriniz => ");
            Double ucret = scan.nextDouble();
            list.add(new Ekleme(isim, ucret));
            System.out.println("Listenin son hali => " );
            list.stream().forEach(t-> System.out.println(t));
            sayac++;
        }
        if (sayac > 0) {

            System.out.println("\n\t1-)Devam etmek istiyorum " +
                    "\n\t2-) Bir onceki menuye donmel istiyorum " +
                    "\n\t3-)Cikis" +
                    "\nTercihiniz => ");
            tercih = scan.nextInt();
            switch (tercih) {
                case 1:
                    sayac=0;
                    urunEkleme(list);
                    break;
                case 2:
                    sayac=0;
                    update();
                    break;
                case 3:
                    sayac=0;
                    rr.cikis();
                    break;
                default:
                    sayac++;
                    System.out.println("Hatali giris");
                    update();
                    break;


            }
        }
    }
}
