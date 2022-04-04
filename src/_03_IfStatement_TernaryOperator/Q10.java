package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.

     */
        Scanner scan=new Scanner(System.in);

        System.out.println("ehliyetiniz varsa ===> 1, yok ise==>0 :");
        int ehliyetiniz=scan.nextInt();

        System.out.println("hızınız ?");
        int hızınız =scan.nextInt();
if (ehliyetiniz==1||ehliyetiniz==0){
    if (ehliyetiniz==0){
        System.out.println("hızınızı sormadan kafadan bi 200$ ateşle");}
}
        if ((ehliyetiniz==1))
            {if (hızınız<0){
            System.out.println("negatf hız olmaz doğru değer giriniz");
        }else if (hızınız>=55&&hızınız<75){
            System.out.println("ceza 100$");}
        else if (hızınız>=75&&hızınız<84){
            System.out.println("ceza 150$");}
        else if (hızınız>=84&&hızınız<94){
            System.out.println("ceza 320$");}
        else if (hızınız>94){
            System.out.println("ceza 500$");}
        else {
            System.out.println("hız sınırları içinde hareket ediyorsunuz.");

        }}
        if ((ehliyetiniz==0)){if (hızınız<0){
            System.out.println("negatf hız olmaz doğru değer giriniz");
        }else if (hızınız>=55&&hızınız<75){
            System.out.println("ceza 300$");}
        else if (hızınız>=75&&hızınız<84){
            System.out.println("ceza 350$");}
        else if (hızınız>=84&&hızınız<94){
            System.out.println("ceza 520$");}
        else if (hızınız>94){
            System.out.println("ceza 700$");}
        else {
            System.out.println("hız sınırları içinde hareket ediyorsunuz.");

    }
} else {
            System.out.println("ehliyet ver mı yokmu damı hasta etme");}}

}
