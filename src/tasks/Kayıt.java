package tasks;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayıt {

    List<Kullanıcı>kisiler=new ArrayList<>();

    public List<Kullanıcı> kayıtAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("adınızı giriniz =");
        String isim=scan.nextLine();
        Kullanıcı k1=new Kullanıcı(isim, LocalDateTime.now());
        kisiler.add(k1);
        return kisiler;
    }
    public  void sansliKullanici(List<Kullanıcı>kll){
        for (Kullanıcı k:kll
             ) {if(k.kayıtZamanı.getSecond()<40){
            System.out.println("şanslı kişisiniz  "+k.name+"  ballı adamsın 5 kg bal");
        }else System.out.println("kaybettiniz   "+k.name+"  yaw heeee");

        }
    }
    public void listele(List<Kullanıcı>kullanıcılar){
        for (Kullanıcı k:kullanıcılar
             ) {
            System.out.println("adı"+k.name+ " kayıt zamanı: "+k.kayıtZamanı);

        }

    }
}
