package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan = new Scanner(System.in);
        System.out.println(" bir değer giriniz");
        int sayi = scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            System.out.println("i = " + i);
            i++;
        }

    }
}
