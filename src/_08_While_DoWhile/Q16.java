package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen pin kodunuzu giriniz");
        String pin = "asdfrew.3";
        int sayac=3;
            for (int i = 0; i < 6; i++) {
                String gPin1 = scan.nextLine();
                if (!gPin1.equals(pin)) {
                    System.out.println("lütfen tekrar deneyiniz");
                    i++;
                    sayac--;
            }if (gPin1.equals(pin)){
                    System.out.println("işleminiz başarı ile tamamlanmıştır");
                }
                if (sayac==0){
                System.out.println("bloke oldunuz");
        }
    }}}
