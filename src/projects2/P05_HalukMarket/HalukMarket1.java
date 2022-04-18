package projects2.P05_HalukMarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HalukMarket1 {
    public static void main(String[] args) {

    fiyatveSatıskodu();
    urunSec();
    }

    public static void fiyatveSatıskodu() {
        String fiyatlar[] = new String [11];
        fiyatlar[0] ="Domates Kilo   ; 32.10 Kr ";
        fiyatlar[1] ="Patates Kilo   ; 33.20 Kr ";
        fiyatlar[2] ="Biber   Kilo   ; 41.50 Kr ";
        fiyatlar[3] ="Soğan   Kilo   ; 12.30 Kr ";
        fiyatlar[4] ="Havuç   Kilo   ; 23.10 Kr ";
        fiyatlar[5] ="Elma    Kilo   ; 9.20 Kr ";
        fiyatlar[6] ="Muz     Kilo   ; 8.90 Kr ";
        fiyatlar[7] ="Çilek   Kilo   ; 55.10 Kr ";
        fiyatlar[8] ="Kavun   Kilo   ; 90.30 Kr ";
        fiyatlar[9] ="Üzüm    Kilo   ; 90.70 Kr ";
        fiyatlar[10] ="Limon  Adet   ; 0.50 Kr ";
        for (int i = 0; i < fiyatlar.length; i++) {
            System.out.println(fiyatlar[i]+"  satış kodu  "+i);
        }
    }
    public static void urunSec() {

        List<String> sepet = new ArrayList<>();
        List<Double> miktar = new ArrayList<>();

        String fiyatlar[] = new String[11];
        fiyatlar[0] = "Domates Kilo   ; 32.10 Kr ";
        fiyatlar[1] = "Patates Kilo   ; 33.20 Kr ";
        fiyatlar[2] = "Biber   Kilo   ; 41.50 Kr ";
        fiyatlar[3] = "Soğan   Kilo   ; 12.30 Kr ";
        fiyatlar[4] = "Havuç   Kilo   ; 23.10 Kr ";
        fiyatlar[5] = "Elma    Kilo   ; 9.20 Kr ";
        fiyatlar[6] = "Muz     Kilo   ; 8.90 Kr ";
        fiyatlar[7] = "Çilek   Kilo   ; 55.10 Kr ";
        fiyatlar[8] = "Kavun   Kilo   ; 90.30 Kr ";
        fiyatlar[9] = "Üzüm    Kilo   ; 90.70 Kr ";
        fiyatlar[10] = "Limon  Adet   ; 0.50 Kr ";

        Scanner scan = new Scanner(System.in);
        int satısKod;
            System.out.println("Lütfen almak istediğiniz ürünün satış kodunu giriniz");
            satısKod = scan.nextInt();
            sepet.add(fiyatlar[satısKod]);
            System.out.println("Lütfen almak istediğiniz ürünün kg miktarını giriniz  ");
            double miktar1 = scan.nextDouble();
            miktar.add(miktar1);



    }

}






