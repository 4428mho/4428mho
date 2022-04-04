package _06_Method_Creation;

import java.util.Scanner;

public class Q09 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("lütfen bie sayı giriniz");
        int sayi=scan.nextInt();
        String str1=Integer.toString(sayi);
        int bSayi=str1.length();
        System.out.println("bSayi = " + bSayi);
        int rakam=0;
        int rakamlarToplami=0;
        int rakam2=0;
        int rakamlarToplami2=0;
        for (int i = 0; i <bSayi ; i++) {
            rakam=sayi%10;
            rakamlarToplami +=rakam;
            sayi/=10;
        }
        System.out.println("rakamlarToplami = " + rakamlarToplami);

        String str2=Integer.toString(rakamlarToplami);
        int bSayi2=str2.length();
        System.out.println("bSayi2 = " + bSayi2);
        for (int j = 0; j <bSayi2 ; j++) {
            rakam2=rakamlarToplami%10;
            rakamlarToplami2 +=rakam2;
            rakamlarToplami/=10;
        }
        System.out.println("rakamlarToplami son = " + rakamlarToplami2);
        }


}



        /*System.out.println("Lütfen pozitif bir tamsayı  sayı giriniz");
        int rakam=0;
        int rakamlarToplami=0;


        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;


        for (int i = 0; i < ; i++) {

        }

        /* int rakam=0;
        int rakamlarToplami=0;
        int tekrar=0;
        while (rakamlarToplami<10){
            int sayi=scan.nextInt();
            rakam=sayi%10;
            rakamlarToplami +=rakam;
            sayi/=10;
            tekrar++;
            System.out.println("sayi = " + sayi);
            System.out.println("rakam = " + rakam);
            System.out.println("rakamlarToplami = " + rakamlarToplami);
        }return tekrar;

    }
/*
    TASK :
    addDigits isminde bir method create ediniz.
    Parametresi int
    Return tipi de int
    Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
    Tek basamaklı çıktığında, return etsin

    Örnek1:
    Girdi 38
    Çıktı: 2
    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamaklı olduğundan, bunu döndürün.
    */


