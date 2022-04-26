package tasks;

import java.util.Scanner;

public class T06_PermutasyonKombinasyon {

    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    public static void main(String[] args) {
        kombinasyonPermutasyon();

    }

    private static void kombinasyonPermutasyon() {
        Scanner scan=new Scanner(System.in);
        System.out.print("kombinasyon ve prmutasyon için ilk sayı değerini giriniz = ");
        double n=scan.nextDouble();
        System.out.print("kombinasyon ve prmutasyon için ikinci sayı değerini giriniz = ");
        double r=scan.nextInt();
        double toplam1 =1;
        double toplam2 =1;
        double toplam3 =1;
        if (n==r){
            System.out.println("tanımsız değer");
        }else {
        for (int i = 1; i <= n; i++) {
            toplam1*=i;
        }
        for (int i = 1; i <= r; i++) {
            toplam2*=i;
                   }
        for (int i = 1; i <= (n-r); i++) {
            toplam3*=i;
                  }
        double sonuç2=toplam1/toplam3;
        double sonuç1=toplam1/(toplam2*toplam3);
        System.out.println("C("+n+","+r+")  = " + sonuç1);
        System.out.println("P("+n+","+r+")  = " + sonuç2);
    }}
}
