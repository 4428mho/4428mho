package projects2.P05_HalukMarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangiUrun {
    static List<HangiUrun> urun = new ArrayList<>();
    static List<HangiUrun> sepet = new ArrayList<>();
    static List<HangiUrun> Fiyat = new ArrayList<>();

    static int arrUrunNo[] = {0,1,2,3,4,5,6,7,8,9,10};
    static String arrUrun[] = {"Domates","Patates","Biber","Soğan","Havuç","Elma","Muz","Çilek","Kavun","Üzüm","Limon"};
    static double arrFiyat[] = {32.10,33.20,41.50,12.30,23.10,9.2,8.90,55.10,90.30,90.70,0.50};
    static Scanner scan = new Scanner(System.in);
    static int urunNo;
    static String Urun;
    static Double Fiyat1 ;

    public HangiUrun(int[] arrUrunNo, String[] arrUrun,double arrFiyat[]) {

        System.out.println("alamk istediğiniz urunun kodunu giriniz");
        urunNo=scan.nextInt();


    }




    }

