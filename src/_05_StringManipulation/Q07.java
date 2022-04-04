package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim girin");

        String isim=scan.nextLine();
        char i1 = isim.charAt(0);
        char i2= isim.charAt(1);
        char i3=isim.charAt(2);
        String sonuç=isim.length()==3?(i2==i1||i2==i3||i1==i3?"birden fazla aynı karakter içermektedir":"aynı karakter aiçermemektedir"):"3 harften fzla";
        System.out.println("sonuç = " + sonuç);





    }
}