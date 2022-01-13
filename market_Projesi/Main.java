package market_Projesi;

public class Main {

    public static void main(String[] args) {
        AnaMenu start=new AnaMenu();
        Data ekle=new Data();
        ekle.listeEkleme(); // Data class'inda bulunan listeleri ekleme yapti
        System.out.println("calisti");
        start.anaMenu();
    }
 }

