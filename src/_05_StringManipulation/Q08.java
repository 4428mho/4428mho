package _05_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String isim=scan.nextLine();
        String str=isim.substring(isim.length()-2,isim.length());

        if (isim.length()>=3){
            System.out.println(str+""+str+""+str);
        }else {
            System.out.println(isim);
        }


    }
}
