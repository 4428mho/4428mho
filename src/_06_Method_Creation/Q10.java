package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {

    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı=scan.nextInt();


        for (int i = 0; i < sayı; i++) {
            if(sayı%3!=0){
                System.out.println(false);
                break;}
                       sayı/=3;
            if (sayı==3) System.out.println(true);
            }
                if (sayı<3&&sayı>0){
            System.out.println(false);
        }
    }
}






