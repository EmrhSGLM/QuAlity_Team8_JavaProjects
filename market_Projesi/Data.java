package market_Projesi;

import java.util.ArrayList;
import java.util.List;

public class Data  {

    static List<Ekleme> temizlikList=new ArrayList<Ekleme>();
    static List <Ekleme> unluMamul=new ArrayList<Ekleme>();
    static List <Ekleme> hazirYiyecek=new ArrayList<Ekleme>();
    static List <Ekleme> manav=new ArrayList<Ekleme>();
    static List <Ekleme> kozmetik=new ArrayList<Ekleme>();




    public static void listeEkleme() {

        temizlikList.add(new Ekleme("Yag Sokucu     ", 55));
        temizlikList.add(new Ekleme("Temizlik Bezi  ", 25));
        temizlikList.add(new Ekleme("Vileda         ", 70));
        temizlikList.add(new Ekleme("Cif            ", 15));
        temizlikList.add(new Ekleme("Omo            ", 80));
        temizlikList.add(new Ekleme("Yumos          ", 45));
        temizlikList.add(new Ekleme("Camasir Suyu   ", 45));

        unluMamul.add(new Ekleme("Ekmek     ", 2));
        unluMamul.add(new Ekleme("Yufka     ", 5));
        unluMamul.add(new Ekleme("Simit      ", 2));
        unluMamul.add(new Ekleme("Kadayif   ", 25));
        unluMamul.add(new Ekleme("Kurabiye  ", 20));

        hazirYiyecek.add(new Ekleme("Browni     ",4));
        hazirYiyecek.add(new Ekleme("Gofret     ",2));
        hazirYiyecek.add(new Ekleme("Cizi       ",3));
        hazirYiyecek.add(new Ekleme("Tutku      ",4));
        hazirYiyecek.add(new Ekleme("Biskrem    ",4.5));

        manav.add(new Ekleme("Domates   ",5));
        manav.add(new Ekleme("Salatalik ",6));
        manav.add(new Ekleme("Biber     ",7));
        manav.add(new Ekleme("Marul     ",6));
        manav.add(new Ekleme("Sogan     ",4));
        manav.add(new Ekleme("Patates   ",4.5));
        manav.add(new Ekleme("Elma      ",3.5));
        manav.add(new Ekleme("Portakal  ",4));
        manav.add(new Ekleme("Muz        ",15));
        manav.add(new Ekleme("Kivi       ",12));

        kozmetik.add(new Ekleme("Sampuan            ",45));
        kozmetik.add(new Ekleme("Zeytinyagli Sabun  ",20));
        kozmetik.add(new Ekleme("Krem               ",30));
        kozmetik.add(new Ekleme("Dus Jeli           ",40));
        kozmetik.add(new Ekleme("Yuz Maskesi        ",30));
    }
}
