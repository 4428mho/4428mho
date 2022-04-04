package _07_ForLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */
        Scanner scan=new Scanner(System.in);
        System.out.println(" lütfen bir harf dizimi yazınız");
        String str2=scan.nextLine();
        int sayac=0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i)=='a'){
                sayac++;}
            else if(str2.charAt(i)=='c')
                    break;;
            }System.out.println("sayac = " + sayac);
        }


}


