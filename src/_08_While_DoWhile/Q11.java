package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {

    /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" karekökü alınacak bir değer giriniz");
        int sayi = scan.nextInt();
        int i, t = 0; // Değişkenlerin tanımlanması
        for (i = 0; i <= sayi / 2 + 1; i++) { // (X/2+1) kere dönen döngünün oluşturulması
            if (sayi == i * i)  // Koşulun kontrol edilmesi
            {
                t = 1;
                break; // Fazladan işlem yaptırmamak için karekökü bulunduğunda döngüden çıkarız
            }
        }
        // Koşulun sağlanıp sağlanmadığını kontrol etmek için “t”yi kullandık, çünkü koşul sağlandığında “t” değişecek
        // Sonucun yazdırılması
        if (t != 0)
            System.out.println("tam kare = "+sayi+" = " +i+" * "+i);
        else
            System.out.println("tam kare değil");


    }}






