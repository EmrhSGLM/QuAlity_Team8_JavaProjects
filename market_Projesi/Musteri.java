package market_Projesi;

import java.util.Scanner;

public class Musteri extends Yetkili{
    static int tercih;
    static Scanner scan = new Scanner(System.in);
    Reyonlar reyon=new Reyonlar();

    public void musteri() {
        //Reyonlar reyon=new Reyonlar();
        System.out.println("Alısveris yapacaginiz reyonu seciniz ");
        System.out.println("\t1-) Temizlik Malzemeleri \n\t2-) Unlu Mamuller \n\t3-) Hazir Yiyecekler" +
                "\n\t4-) Manav \n\t5-)Kozmetik \nLutfen tercihiniz yapiniz");
        tercih=scan.nextInt();
        switch(tercih) {
            case 1:
                reyon.temizlik();
                break;
            case 2:
                reyon.unluMamul();
                break;
            case 3:
                reyon.hazirYiyecek();
                break;
            case 4:
                reyon.manav();
                break;
            case 5:
                reyon.kozmetik();
                break;
            default :
                System.out.println("Hatali giris yaptiniz");
                musteri();
                break;

        }

    }


}
