package _04_switchCase._04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi
        Scanner scan=new Scanner(System.in);
        System.out.println(" Pazartesi: 1\n Salı: 2\n Çarşamba: 3\n Perşembe: 4\n Cuma: 5\n Cumartesi: 6\n Pazar: 7");
       int kacıncıGun=scan.nextInt();
       if (kacıncıGun<=0||kacıncıGun>7){
           System.out.println("hata");
       }else
        System.out.println("kaç gün sonrasını bulacan");
        int kacGunSonrasi=scan.nextInt();
        int bulunan=(kacGunSonrasi+kacıncıGun)%7;

        switch (bulunan){
                case 1:
                    System.out.println(kacGunSonrasi + " gun sonr gunlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonr gunlerden SALI");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonr gunlerden CARSAMBA");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonr gunlerden PERSEMBE");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonr gunlerden CUMA");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonr gunlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonr gunlerden PAZAR");
                    break;
                default:
                    System.out.println("agam hafta 7 gun :-( ");
        }




    }
}

