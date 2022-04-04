package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 3 basamaklı pozitif bir sayi giriniz!= ");
        int x = scan.nextInt();
        if (x<=0){
            System.out.println("tekrar giriniz");
        }else {
            String sonuc=(x>99&& x<1000)?("3 basamaklı sayı"):(x%2==0?"3 basamaklı olmayan çift sayı" :"3 basamaklı olmayan tek sayı");
            System.out.print("sonuc = " + sonuc);
        }

    }
}