package scrabell_Oyunu;

import java.util.Scanner;

public class Oyuncular {

    static String harfler="abcdefghiklmnoprstuvyzABCDEFGHIKLMNPROSTUVYZ";
    static String kelime;


    protected static void oyuncu1() {
        Scanner scan=new Scanner (System.in);
        System.out.println("Bir kelime giriniz : ");
        kelime = scan.nextLine();
        for (int i=0;i<kelime.length();i++) {
            if (!harfler.contains(kelime.substring(i,i+1))) {
                System.out.println("Gecersiz harf girisi ");
                break;
            }

        }
    }

    protected static void oyuncu2() {
        Scanner scan=new Scanner (System.in);


    }




}
