package _04_switchCase._04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
  /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
  
   */
    public static void main(String[] args) {
      System.out.println("  ******   ");
      System.out.println("   ATM'YE HOŞGELDİNİZ   ");
      Scanner scan=new Scanner(System.in);
      System.out.println("hangi işlemi yapmak isyiyorsunuz \n Bakiye öğrenme : 1 \n Para Çekme : 2 \n Para yatırma : 3 ");

      int islem=scan.nextInt();
      int bakıye=1000;

      switch (islem) {
        case 1:
          System.out.println("Bakiyeniz =  " + bakıye);
          break;
        case 2:
          System.out.println("çekmek istediğiniz miktarı giriniz");
          int çekmekistenilenMiktar=scan.nextInt();
          int kalan=bakıye-çekmekistenilenMiktar;
          if (kalan<0){
            System.out.println("yeterli miktar yoktur");
          }else;
            break;
        case 3:
          System.out.println("yatıracağınız miktarı giriniz");
          int yatırılanMiktar = scan.nextInt();
          int yenibakıye = bakıye + yatırılanMiktar;
          System.out.println("yenibakıye = " + yenibakıye);
          break;
        default:
      }
          System.out.println(" İşleminiz başarı ile sonlamnmıştır");


      }


    }

