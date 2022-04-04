package _07_ForLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q20 {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" lütfen bir sayı giriniz");
        int x1=scan.nextInt();
        System.out.println(" lütfen bir sayı giriniz");
        int x2=scan.nextInt();
    int ebob=0;
    int ekok;

        for (int i = 1; i <=x1 && i <= x2; i++) {
            if (x1%i==0 && x2%i==0){
                ebob=i;
            }
        }
        ekok=(x1*x2)/ebob;
        System.out.println(x1 + " ve " + x2 + " sayıları için ebob = " + ebob);
        System.out.println(x1 + " ve " + x2 + " sayıları için ekok = " + ekok);
        }
    }

