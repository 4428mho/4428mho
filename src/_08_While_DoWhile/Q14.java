package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */int x=6;
        int sonuc=1;
        for (int i = 1; i <=x; i++) {
            sonuc*=i;
            System.out.print(i+"*");

        }
        System.out.println("sonuc = " + sonuc);
    }
}


