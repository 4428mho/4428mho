package _06_Method_Creation;

import java.util.Locale;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */        ceviriciSaat();

           ceviriciMil();

           ceviriciGram();

    }

    private static double ceviriciGram() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" lütfen bir Kilogram değeri giriniz = " );
        double kg=scan.nextDouble();
        double str3=(kg*1000);
        System.out.print(str3+" = Gr");
        return str3;
    }

    private static double ceviriciMil() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" lütfen bir mil değeri giriniz = " );
        double mil=scan.nextDouble();
        double str2=(mil*1.61);
        System.out.println(str2+" = Km");
        return str2;

    }

    private static double ceviriciSaat() {

        Scanner scan = new Scanner(System.in);
        System.out.print(" lütfen bir Saat değeri giriniz = " );
        double saat=scan.nextDouble();
        double str1=saat*60*60;
        System.out.println(str1+" saniye");
         return str1;
}}

