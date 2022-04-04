package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
//        rakam=sayi%10;
//        rakamlarToplami +=rakam;
//        sayi/=10;
        */
        amstrongsayısı();
            }
    private static void amstrongsayısı() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int a = scan.nextInt();
        int x=a;
        int rakam=0;
        int rakamküpleri=0;
        String b= String.valueOf(a);
        int c=b.length();
        for (int i = 1; i <=c ; i++) {
            rakam = a % 10;
            rakamküpleri += rakam * rakam * rakam;
            a /= 10;
        }if (x==rakamküpleri){
                System.out.println("girilen Sayı ="+x+ "\nbu bir amsrong sayısıdır =" +rakamküpleri);
        }else {
                System.out.println("girilen Sayı "+x+"    amstron sayısı değil ="+rakamküpleri);
            }

    }
}





