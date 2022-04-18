package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {
    static ArrayList<Kisi>ogrenciListesi=new ArrayList<>();
    static ArrayList<Kisi>ogretmenListesi=new ArrayList<>();
    static ArrayList<Kisi>kisi=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;

    public static void girispaneli(){
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim=scan.next().toUpperCase();
        switch (secim){
            case "1":
                kisiTuru="OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cıkıs1();
                System.out.println();
                break;
            default:
                System.out.println("hatalı giriş yaptınız :(((");
                girispaneli();  //recursive method call
                break;
        }
    }

    private static void cıkıs1() {
        System.out.println("isleminiz sonlandırılmıştır.");
    }

    public static void islemMenusu(){
        System.out.println("Sectiginiz  Kişi turu: "+ kisiTuru+" icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem=scan.nextInt();
        switch (secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                sil();
                islemMenusu();
                break;
            case 0:
                girispaneli();
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
                islemMenusu();
                break;
        }

    }
    private static void listele() {
        System.out.println("   ***   " + kisiTuru + " listeleme sayfası   ***");
        System.out.println("");
        if (kisiTuru.equals("OGRENCI")) {
            for (Kisi each : ogrenciListesi) {
                System.out.println(each.toString());
            }
        } else {
            for (Kisi each : ogretmenListesi) {
                System.out.println(each.toString());
            }
        }
    }
    private static void sil() {
        System.out.println("   ***   " + kisiTuru + " arama sayfası   ***");
        System.out.println("");
        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();
        if (kisiTuru.equals("OGRENCI")) {


            for (Kisi each : ogrenciListesi) {
                if (each.getKimlikNo().equals(kimlikNo)) {
                    ogrenciListesi.remove(each);
                    System.out.println("Silme işlemi başarı ile gerçekleşti..");
                    break;
                } else System.out.println("Kayıt Bulunamadı..");
            }

        } else {
            for (Kisi each : ogretmenListesi) {
                if (each.getKimlikNo().equals(kimlikNo)) {
                    ogretmenListesi.remove(each);
                    System.out.println("Silme işlemi başarı ile gerçekleşti..");
                    break;
                } else System.out.println("Kayıt Bulunamadı..");
            }

        }

    }


    private static void arama() {
        System.out.println("   ***   " + kisiTuru + " arama sayfası   ***");
        System.out.println("");
        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();
        if (kisiTuru.equals("OGRENCI")) {
            for (Kisi each : ogrenciListesi) {
                if (each.getKimlikNo().equals(kimlikNo)) {
                    System.out.println("Adı Soyadı =" +each.getAdSoyad());
                } else System.out.println("Kayıt Bulunamadı..");
            }

        } else {
            for (Kisi each : ogretmenListesi) {
                if (each.getKimlikNo().equals(kimlikNo)) {
                    System.out.println(each.toString());
                } else System.out.println("Kayıt Bulunamadı..");
            }

        }
    }


    private static void ekle() {
        System.out.println("   *******  "+kisiTuru+ "   ekleme sayfası   *************");
        System.out.println("Ad Soyad giriniz");
        scan.nextLine();// dummy
        String adSoyad=scan.nextLine();
        System.out.println("Kimlik no giriniz");
        String kimilkNo=scan.nextLine();
        System.out.println("Yaşını giriniz");
        int yas=scan.nextInt();


        if(kisiTuru.equalsIgnoreCase("OGRENCI")){

            System.out.println("Ogrenci No giriniz");
            scan.nextLine();// dummy
            String ogrenciNo=scan.nextLine();
            System.out.println("Sınıf  giriniz");
            String sinif=scan.nextLine();
            Ogrenci ogrenci=new Ogrenci(adSoyad,kimilkNo,yas,ogrenciNo,sinif);
            ogrenciListesi.add(ogrenci);
            System.out.println("ogrenciListesi = " + ogrenciListesi);

        }
        else {
            System.out.println("Sicil No giriniz");
            scan.nextLine();// dummy
            String sicil = scan.nextLine();
            System.out.println("Branş  giriniz");
            String birans = scan.nextLine();
            Ogretmen ogretmen=new Ogretmen(adSoyad,kimilkNo,yas,sicil,birans);
            ogretmenListesi.add(ogretmen);
        }
    }
}
