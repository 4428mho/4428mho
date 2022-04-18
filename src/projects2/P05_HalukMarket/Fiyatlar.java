package projects2.P05_HalukMarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static projects2.P05_HalukMarket.HangiUrun.arrFiyat;

public class Fiyatlar {
    public static void main(String[] args) {
                  manav();
                  urunSecimi1();
                System.out.println("devam etmek icin E \nbitirmek icin H'ye basin");}

    static List<String> sepet = new ArrayList<>();
    static List<Double> miktar = new ArrayList<>();
    static List<Double> fatura = new ArrayList<>();
        private static void urunSecimi1() {


            int arrUrunNo[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            double arrFiyat[] = {32.10, 33.20, 41.50, 12.30, 23.10, 9.2, 8.90, 55.10, 90.30, 90.70, 0.50};
            String urun[] = {"Domates  ","Patates", "Biber", "Soğan", "Havuç", "Elma", "Muz", "Çilek", "Kavun", "Üzüm", "Limon "};

                            Scanner scan = new Scanner(System.in);
                            System.out.println("ürün kodu");
                            int satısKod = scan.nextInt();
                            System.out.println("kg miktarı");
                            double miktar2 = scan.nextDouble();
                            double fis = arrFiyat[satısKod] * miktar2;
            sepet.add(urun[satısKod]);
            miktar.add(miktar2);
            fatura.add(fis);
            System.out.println(sepet);
            System.out.println(fatura);
            urunSecimi1();
    }

    private static void manav() {
        String urun[] = {"Domates  ", "Patates", "Biber", "Soğan", "Havuç", "Elma", "Muz", "Çilek", "Kavun", "Üzüm", "Limon "};

        for (int i = 0; i < urun.length; i++) {
            System.out.println(urun[i] + "  satış kodu  = " + i + "   birim fiyatı = " + arrFiyat[i]);
        }




    }
}

/*



 Scanner scan = new Scanner(System.in);
        int kontrol=0;
        while(kontrol !=2){
            System.out.println("Bolmek istediginiz sayiyi yaziniz");
            int sayi1= scan.nextInt();
            System.out.println("Kaca bolmek istediginizi yaziniz");
            int sayi2= scan.nextInt();
            try {
                System.out.println("sonuc = " + sayi1 / sayi2);
            } catch (ArithmeticException e) {
                // e.printStackTrace();
                System.out.println("Girdiginiz sayilarda sorun var");
            }
            System.out.println("devam etmek icin 1 \nbitirmek icin 2'ye basin");
            kontrol= scan.nextInt();



while(kontrol !=2){
        System.out.println("Bolmek istediginiz sayiyi yaziniz");
        int sayi1= scan.nextInt();
        System.out.println("Kaca bolmek istediginizi yaziniz");
        int sayi2= scan.nextInt();
        try {
        System.out.println("sonuc = " + sayi1 / sayi2);
        } catch (ArithmeticException e) {
        // e.printStackTrace();
        System.out.println("Girdiginiz sayilarda sorun var");
        }
        System.out.println("devam etmek icin 1 \nbitirmek icin 2'ye basin");
        kontrol= scan.nextInt();
        }
*/