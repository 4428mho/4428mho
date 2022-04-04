package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen metin giriniz");
        String a = scan.nextLine();
        int c=a.length();
        String str="";
        System.out.println("c = " + c);
        for (int i = 0; i <= c-2; i++) {
            i++;
            str+=a.substring(i,i+1);
        }
        System.out.println("str = " + str);
    }
}
