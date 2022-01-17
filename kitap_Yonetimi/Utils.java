package kitap_Yonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Utils extends Depo {
    static int tercih;
    static int id=1000;
    static List<Depo> kitaplar=new ArrayList<>();
    static List<Depo> odunc=new ArrayList<>();

    protected static void ekle(){
        kitaplar.add(new Depo(id++,"Yaban","Yakup Kadri Karaosmanoğlu","YKY","2005"));
        kitaplar.add(new Depo(id++,"Yaban","Yakup Kadri Karaosmanoğlu","YKY","2005"));
        kitaplar.add(new Depo(id++,"Yaban","Yakup Kadri Karaosmanoğlu","YKY","2005"));
        kitaplar.add(new Depo(id++,"Yaban","Yakup Kadri Karaosmanoğlu","YKY","2005"));
        kitaplar.add(new Depo(id++,"Yaban","Yakup Kadri Karaosmanoğlu","YKY","2005"));
    }

    protected static void kutuphane() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yapabileceginiz işlemler :" +
                "\n\t 1-) Kitap Ekle " +
                "\n\t 2-) Kitap Sil " +
                "\n\t 3-) Kitap Listesi " +
                "\n\t 4-) Odunc Kitap"+
                "\n\t 5-) Cikis");
        System.out.println("Isleminizi seçiniz => ");
        tercih=scan.nextInt();
        switch(tercih) {
            case 1 :
                kitapEkle();
                break;
            case 2 :
                kitapSil();
                break;
            case 3:
                kitapListele();
                break;
            case 4:
                oduncKitap();
                break;
            case 5:
                cikis();
                break;
            default :
                System.out.println("Hatalı giriş yaptınız");
                kutuphane();
                break;

        }
    }


    private static void kitapEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kitap Ekleme bolumundesiniz ");
        System.out.println("Eklemek istediginiz kitabın ismini giriniz => ");
        String isim=scan.nextLine();
        System.out.println("Eklemek istediginiz kitabın yazarinin ismini ve soyismini giriniz => ");
        String adSoyad=scan.nextLine();
        System.out.println("Eklemek istediginiz kitabın yayinevi ni giriniz => ");
        String yayinEvi=scan.nextLine();
        System.out.println("Eklemek istediginiz kitabın basim yilini giriniz => ");
        String basimYili=scan.next();
        kitaplar.add(new Depo(id++,isim,adSoyad,yayinEvi,basimYili));
        for(int i=1;i>0;i++){
            System.out.println("\nIslemler : " +
                    "\n\t 1-) Devam etmek istiyorum " +
                    "\n\t 2-) Ana Menuye donmek istiyorum " +
                    "\n\t 3-) Cikis yapmak istiyorum");
            System.out.println("Seciminizi yapiniz =>  ");
            tercih=scan.nextInt();
            switch(tercih) {
                case 1:
                    kitapEkle();
                    break;
                case 2:
                    kutuphane();
                    break;
                case 3:
                    cikis();
                    break;
                default :
                    System.out.println("Hatalı giris yaptiniz ");
            }
        }

    }
    private static void kitapSil() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kitap Silme bolumundesiniz ");
        int count=0;
        for(int i=1;i>0;i++) {
            kitaplar.stream().forEach(t -> System.out.println(t));
            System.out.println("Silmek istediginiz kitabın id'sini giriniz => ");
            tercih = scan.nextInt();
            boolean result= kitaplar.removeIf(t -> t.getId() == tercih);
            if(result){
                System.out.println(tercih + " id'li kitap basariyla silindi");
            } else {
                System.out.println("Girmis oldugunuz " + tercih + " id'sine ait kitap bulunamadı");
                count++;
            }
            if(count == 3){
                System.out.println("id numarasini 3 defa yanlıs girdiniz ");
                break;}
        }

        for(int i=1;i>0;i++){
            System.out.println("\nIslemler : " +
                    "\n\t 1-) Kitap Silme Islemine Devam etmek istiyorum " +
                    "\n\t 2-) Ana Menuye donmek istiyorum " +
                    "\n\t 3-) Cikis yapmak istiyorum");
            System.out.println("Seciminizi yapiniz =>  ");
            tercih=scan.nextInt();
            switch(tercih) {
                case 1:
                    kitapSil();
                    break;
                case 2:
                    kutuphane();
                    break;
                case 3:
                    cikis();
                    break;
                default :
                    System.out.println("Hatalı giris yaptiniz ");
            }
        }

    }
    private static void kitapListele() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kitap Listeleme Bolumundesiniz : ");
        kitaplar.stream().forEach(t-> System.out.println(t));
        for(int i=1;i>0;i++){
            System.out.println("\nIslemler : " +
                    "\n\t 1-) Ana Menuye donmek istiyorum " +
                    "\n\t 2-) Cikis yapmak istiyorum ");
            System.out.println("Seciminizi yapiniz =>  ");
            tercih=scan.nextInt();
            switch(tercih) {
                case 1:
                    kutuphane();
                    break;
                case 2:
                    cikis();
                    break;
                default :
                    System.out.println("Hatalı giris yaptiniz ");
            }
        }
    }

    private static void oduncKitap() {
        Scanner scan=new Scanner (System.in);
        System.out.println("Odunc Kitap Alma Bolumundesiniz => ");
        System.out.println("KITAP LISTESI");
        kitaplar.stream().forEach(t-> System.out.println(t));
        if(odunc.size() < 3) {
            System.out.println("Odunc Almak istediginiz kiabın id'sini giriniz => ");
            tercih = scan.nextInt();
            for(int i=0;i<kitaplar.size();i++){
                if(kitaplar.get(i).getId()==tercih){
                    odunc.add(kitaplar.get(i));
                }
            }
            System.out.println("Odunc Aldiginiz Kitaplar");
            odunc.stream().forEach(t -> System.out.println(t));
        } else {
            System.out.println("Odunc kitap Alma hakkiniz 3 adettir ");
        }
        for(int i=1;i>0;i++){
            System.out.println("\nIslemler : " +
                    "\n\t 1-) Odunc Kitap Alma Islemine Devam etmek istiyorum " +
                    "\n\t 2-) Ana Menuye donmek istiyorum " +
                    "\n\t 3-) Cikis yapmak istiyorum");
            System.out.println("Seciminizi yapiniz =>  ");
            tercih=scan.nextInt();
            switch(tercih) {
                case 1:
                    oduncKitap();
                    break;
                case 2:
                    kutuphane();
                    break;
                case 3:
                    cikis();
                    break;
                default :
                    System.out.println("Hatalı giris yaptiniz ");
            }
        }

    }

    private static void cikis() {
        System.out.println("Iyi Gunler Dileriz ");

    }


}
