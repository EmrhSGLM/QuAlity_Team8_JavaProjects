package market_Projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reyonlar extends Ekleme{
    static AnaMenu aMenu=new AnaMenu();
    static Musteri mstr=new Musteri();
    static Odeme ode=new Odeme();
    static int tercih;
    static int adet;
    static List<String> sepet=new ArrayList<String>();

    public static  void temizlik() {
        Scanner scan=new Scanner (System.in);
        for(int i=0;i<temizlikList.size();i++){
            System.out.println((i+1) + ". " + temizlikList.get(i));
        }
        System.out.print("Sectiginiz urunun sira numarasini seciniz => ");
        tercih=scan.nextInt()-1;
        System.out.println("Almak istediginiz urunun miktarini giriniz => ");
        adet=scan.nextInt();
        alisVeris(temizlikList,tercih,adet);
    }


    public static void unluMamul() {
        Scanner scan=new Scanner (System.in);
        for(int i=0;i<unluMamul.size();i++){
            System.out.println((i+1) + ". " + unluMamul.get(i));
        }
        System.out.print("Sectiginiz urunun sira numarasini seciniz => ");
        tercih=scan.nextInt()-1;
        System.out.println("Almak istediginiz urunun miktarini giriniz => ");
        adet=scan.nextInt();
        alisVeris(unluMamul,tercih,adet);


    }
    public static void hazirYiyecek() {
        Scanner scan=new Scanner (System.in);
        for(int i=0;i<hazirYiyecek.size();i++){
            System.out.println((i+1) + ". " + hazirYiyecek.get(i));
        }
        System.out.print("Sectiginiz urunun sira numarasini seciniz => ");
        tercih=scan.nextInt()-1;
        System.out.println("Almak istediginiz urunun miktarini giriniz => ");
        adet=scan.nextInt();
        alisVeris(hazirYiyecek,tercih,adet);

    }

    public static void manav() {
        Scanner scan=new Scanner (System.in);
        for(int i=0;i<manav.size();i++){
            System.out.println((i+1) + ". " + manav.get(i));
        }
        System.out.print("Sectiginiz urunun sira numarasini seciniz => ");
        tercih=scan.nextInt()-1;
        System.out.println("Almak istediginiz urunun miktarini giriniz => ");
        adet=scan.nextInt();
        alisVeris(manav,tercih,adet);

    }

    public static void kozmetik() {
        Scanner scan=new Scanner (System.in);
        for(int i=0;i<kozmetik.size();i++){
            System.out.println((i+1) + ". " + kozmetik.get(i));
        }
        System.out.print("Sectiginiz urunun sira numarasini seciniz => ");
        tercih=scan.nextInt()-1;
        System.out.println("Almak istediginiz urunun miktarini giriniz => ");
        adet=scan.nextInt();
        alisVeris(kozmetik,tercih,adet);

    }
    public static void alisVeris(List<Ekleme> list,int s,int a) {
        setSepet(getSepet()+list.get(s).getUcret()*a);
        System.out.println("Sepetinizde ki Urunleriniz => ");
        sepetListe.add(new Ekleme(a,list.get(s).getIsim(),list.get(s).getUcret()));
        sepetListe.stream().forEach(t-> System.out.println(t));
        System.out.println("Toplam Borcunuz=> " + getSepet());
        dewam();

    }

    private static void dewam() {
        Scanner scan=new Scanner (System.in);
        System.out.println("Yapacaginiz islemi seciniz => " +
                "\n1-)Ana Menuye donmek istiyorum"+
                "\n2-)Alisverise devam etmek istiyorum" +
                "\n3-)Odeme yapmak istiyorum"+
                "\n4-)Cikmak istiyorum");
        tercih=scan.nextInt();
        switch (tercih){
            case 1:
                aMenu.anaMenu();
                break;
            case 2:
                mstr.musteri();
                break;
            case 3:
                ode.odeme();
                break;
            case 4:
                cikis();
                break;
            default :
                System.out.println("Hatali giris yaptiniz ");
                break;
        }
    }

    protected static void cikis() {
        System.out.println("IYI GUNLER DILERIZ \n\tBIR DAHA BEKLERİZ ");
    }
}
