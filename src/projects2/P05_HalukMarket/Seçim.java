package projects2.P05_HalukMarket;

import java.util.Scanner;

public class Seçim {
    public static void main(String[] args) {

        urunSecimi();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen almak istediğiniz ürünün kodunu giriniz");
        int secim=scan.nextInt();
        double[] arrFiyat = {32.10,33.20,41.50,12.30,23.10,9.2,8.90,55.10,90.30,90.70,0.50};

        String fiyatlar[] = {"Domates Kilo   ; 32.10 Kr ",
                             "Patates Kilo   ; 33.20 Kr ",
                             "Biber   Kilo   ; 41.50 Kr ",
                             "Soğan   Kilo   ; 12.30 Kr ",
                             "Havuç   Kilo   ; 23.10 Kr ",
                             "Elma    Kilo   ; 9.20 Kr ",
                              "Muz     Kilo   ; 8.90 Kr ",
                             "Çilek   Kilo   ; 55.10 Kr ",
                             "Kavun   Kilo   ; 90.30 Kr ",
                             "Üzüm    Kilo   ; 90.70 Kr ",
                             "Limon  Adet   ; 0.50 Kr "};
        switch (secim){
            case 0:
                System.out.println(fiyatlar[0]);
                System.out.println("ürün miktarını giriniz");
                double miktar0=scan.nextDouble();
                double fatura0=miktar0*arrFiyat[0];
                System.out.println("fatura = " + fatura0);
                urunSecimi();
            case 1:
                System.out.println(fiyatlar[1]);
                System.out.println("ürün miktarını giriniz");
                double miktar1=scan.nextDouble();
                double fatura1=miktar1*arrFiyat[1];
                System.out.println("fatura = " + fatura1);
                urunSecimi();
            case 2:
                System.out.println(fiyatlar[2]);
                System.out.println("ürün miktarını giriniz");
                double miktar2=scan.nextDouble();
                double fatura2=miktar2*arrFiyat[2];
                System.out.println("fatura = " + fatura2);
                urunSecimi();

            case 3:
                System.out.println(fiyatlar[3]);
                System.out.println("ürün miktarını giriniz");
                double miktar3=scan.nextDouble();
                double fatura3=miktar3*arrFiyat[3];
                System.out.println("fatura = " + fatura3);
                urunSecimi();

            case 4:
                System.out.println(fiyatlar[4]);
                System.out.println("ürün miktarını giriniz");
                double miktar4=scan.nextDouble();
                double fatura4=miktar4*arrFiyat[4];
                System.out.println("fatura = " + fatura4);
                urunSecimi();

            case 5:
                System.out.println(fiyatlar[5]);
                System.out.println("ürün miktarını giriniz");
                double miktar5=scan.nextDouble();
                double fatura5=miktar5*arrFiyat[5];
                System.out.println("fatura = " + fatura5);
                urunSecimi();

            case 6:
                System.out.println(fiyatlar[6]);
                System.out.println("ürün miktarını giriniz");
                double miktar6=scan.nextDouble();
                double fatura6=miktar6*arrFiyat[6];
                System.out.println("fatura = " + fatura6);
                urunSecimi();

            case 7:
                System.out.println(fiyatlar[7]);
                System.out.println("ürün miktarını giriniz");
                double miktar7=scan.nextDouble();
                double fatura7=miktar7*arrFiyat[7];
                System.out.println("fatura = " + fatura7);
                urunSecimi();

            case 8:
                System.out.println(fiyatlar[8]);
                System.out.println("ürün miktarını giriniz");
                double miktar8=scan.nextDouble();
                double fatura8=miktar8*arrFiyat[8];
                System.out.println("fatura = " + fatura8);
                urunSecimi();

            case 9:
                System.out.println(fiyatlar[9]);
                System.out.println("ürün miktarını giriniz");
                double miktar9=scan.nextDouble();
                double fatura9=miktar9*arrFiyat[9];
                System.out.println("fatura = " + fatura9);
                urunSecimi();

            case 10:
                System.out.println(fiyatlar[10]);
                System.out.println("ürün miktarını giriniz");
                double miktar10=scan.nextDouble();
                double fatura10=miktar10*arrFiyat[10];
                System.out.println("fatura = " + fatura10);
                urunSecimi();

            default:
                System.out.println("alışverişi tammlamak için 11 i tuşlayınız");
        }

    }

    static void urunSecimi() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen almak istediğiniz ürünün kodunu giriniz");
        int secim=scan.nextInt();
    }
}
