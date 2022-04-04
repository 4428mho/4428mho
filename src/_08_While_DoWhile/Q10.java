package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("arka arkaya 10 adet sayi yazin");
        System.out.println("yazdiginiz bu 10 sayinin en buyuk olanini ve en kucuk olanini bulup cikti alacağız");
        int maks = 0;
        int min = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            int sayi = scan.nextInt();
            if (i == 1) {
                maks = sayi;
                min = sayi;
            }

            if (sayi > maks)
                maks = sayi;

            if (sayi < min)
                min = sayi;
        }

        System.out.println("girdiginiz 10 sayi icinden en buyuk olani: " + maks);
        System.out.println("girdiginiz 10 sayi icinden en kucuk olani: " + min);


    }}