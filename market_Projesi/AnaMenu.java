package market_Projesi;
import java.util.Scanner;

public class AnaMenu extends Musteri {

    static int tercih;
    static Reyonlar reyon=new Reyonlar();
    static Scanner scan = new Scanner(System.in);

    protected void anaMenu() {
        int sayac=0;

        if(sayac == 0) {
            System.out.println("==============================================================");
            System.out.println("\t\tHOSGELDINIZ \n\t\t\tQuAlity Market");
            System.out.println("===============================================================");
            System.out.println("\t1-Yetkili \n\t2-Musteri\n\t3-Cikis\nSeciminizi yapiniz");
            sayac++;
        } else {
        System.out.println("\t1-Yetkili \n\t2-Musteri\nSeciminizi yapiniz");
        }
        tercih = scan.nextInt();

        switch (tercih) {
            case 1:
                super.update();
                break;
            case 2:
                super.musteri();
                break;
            case 3:
                reyon.cikis();
                break;
            default :
                System.out.println("Hatali giris yaptiniz");
                anaMenu();
                break;
        }

    }
}