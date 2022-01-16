package scrabell_Oyunu;

import java.util.Scanner;

public class Main extends Oyuncular {

    static int count;
    static int oyuncu1Puan;
    static int oyuncu2Puan;
    public static void main(String[] args) {
        if(count==0){
            count=(int) (Math.random()*3);
        }
        oyuncuBelirle();

    }

    private static void oyuncuBelirle() {
        if(count%2==0){
            oyuncu1();
            count++;
        }else if(count%2==1) {
            oyuncu2();
            count++;
        }
    }


}
