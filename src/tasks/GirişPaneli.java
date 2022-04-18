package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirişPaneli {
    public static void panel(){
        Scanner scan=new Scanner(System.in);
        Kayıt yeniKayıt=new Kayıt();
        List<Kullanıcı> kişi =new ArrayList<>();

        boolean cikilsinMi = false;
        while (!cikilsinMi){
            System.out.println("lutfen \n1: Kaıt al \n2: sanslı kişiyi bul \n3: kişileri listele \n4 çıkış");
            System.out.println("işleminizi seçiniz");
            int isleminiz=scan.nextInt();
            switch (isleminiz){
                case 1:
                    kişi=yeniKayıt.kayıtAl();
                    break;
                case 2:
                    yeniKayıt.sansliKullanici(kişi);
                    break;
                case 3:
                    yeniKayıt.listele(kişi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;
                default:
                    System.out.println("hatalı seçim");
                    break;
            }
        }
    }
}
