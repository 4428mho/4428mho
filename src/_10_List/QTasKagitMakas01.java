package _10_List;

import java.util.Random;
import java.util.Scanner;

public class QTasKagitMakas01 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int kpuan=0;
        int bpuan=0;
        System.out.println("taş için 3'ü , Kağıt için 1'i , Makas İçin 2'yi Tuşlayın");
        int ksayı=scan.nextInt();

        Random rand = new Random();
        int bsayı = ( (int) (Math.random()*3)+1);
        System.out.println("rand = " + bsayı);
       // while (ksayı<=3&&ksayı>0){

            if (ksayı==3&&bsayı==2){
                kpuan+=10;
                System.out.println("taş makası kırar " +kpuan+ "  puan kazandınız");

            }else if(ksayı==2&&bsayı==1){
                kpuan+=10;
                System.out.println("makas kağıdı keser "+kpuan+ "  puan kazandınız");

            }else if(ksayı==1&&bsayı==3){
                kpuan+=10;
                System.out.println("kağıt taşı sarar"+kpuan+ "  puan kazandınız");
            }
        }


        /* TASK:
         tas3 >2makas
         makas 2>1kagit
         kagit 1>3tas

	//Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	//Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */


    }




