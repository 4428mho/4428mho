package JavaProjects.P02_deneme;
import java.util.Scanner;

public class Q2 {
    static Scanner scan=new Scanner(System.in);
    public static void secimYap() {
        System.out.println("Bakiye Sorgulama icin 1\nPara Yatirma icin 2\nPara Cekme icin 3\nPara Gonderme icin 4\n" +
                "Sifrenizi degistirmek icin 5\nCikis icin 6 tuslayiniz.");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                bakiyeSorgula();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                ParaCek();
                break;
            case 4:
                paraGonder();
                break;
            case 5:
                sifreDegistir();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Gecersiz bir secim yaptiniz. Lutfen tekrar deneyiniz.");
                secimYap();
        }
    }

    public static void cikis() { System.out.println("Bankamizi tercih ettiginiz icin tesekkurler. Yine bekleriz...");
    }

    public static void sifreDegistir() {Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen mevcut sifrenizi giriniz: ");
        String sifreTeyit=scan.nextLine();
        if (sifreTeyit.equals(Q1.getSifre())){
            System.out.println("Lutfen yeni sifrenizi giriniz:");
            String yeniSifre =scan.nextLine();
            Q1.setSifre(yeniSifre);
            System.out.println("Sifreniz basarili bir sekilde degistirildi");
            secimYap();
        }else{
            System.out.println("Sifreniz hatali.");
            girisEkraninaGit();
        }

    }

    public static void girisEkraninaGit() {
        System.out.println("*******   JAVABANK'E HOS GELDINIZ   *******");
        System.out.println("Lutfen kart numaranizi giriniz: ");
        String girilenKartNo= scan.nextLine().replaceAll(" ","");
        System.out.println("Lutfen sifrenizi giriniz: ");
        String girilenSifre= scan.nextLine();

        if (girilenKartNo.equals(Q1.getKartNo())&&
                girilenSifre.equals(Q1.getSifre())){
            Q2.secimYap();

        }else{
            System.out.println("Kart numaraniz veya sifreniz hatali. Lutfen tekrar deneyiniz...");
            girisEkraninaGit();
        }
    }

    public static void paraGonder() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen gondermek istediginiz IBAN numarasini giriniz:");
        String ibanNo=scan.nextLine();
        if (!ibanNo.startsWith("TR")&&ibanNo.length()!=26){
            secimYap();
           //
        }else {
            System.out.println("gönderilecek tutar ");
            double gp=scan.nextDouble();
            if (gp>Q1.bakiye){
                System.out.println("yetersiz bakiye");
                bakiyeSorgula();
            }else {
                Q1.bakiye -=gp;
                System.out.println("ileminiz gerçekleştiriliyor");
                bakiyeSorgula();
            }
        }
    }

    public static void ParaCek() {
        System.out.println("Cekmek istediginiz tutari giriniz: ");
        double cekilecekTutar=scan.nextDouble();
        if(cekilecekTutar>Q1.bakiye){
            System.out.println("yetersiz bakiye");
            bakiyeSorgula();
        }else {
            Q1.bakiye-=cekilecekTutar;
            bakiyeSorgula();
        }
    }

    public static void paraYatir() {
        System.out.println("Yatirmak istediginiz tutari giriniz:");
        double yatirilanTutar=scan.nextDouble();
        Q1.bakiye+=yatirilanTutar;
        bakiyeSorgula();

    }

    public static void bakiyeSorgula() {
        System.out.println("Bakiyeniz : " + Q1.bakiye + " TL.\nDevam etmek icin 1, cikis icin 2");
        int secim = scan.nextInt();
        if (secim == 1) {
            secimYap();
        }else if (secim == 2){
            cikis();
        }


    }
    }