package calismalar2;

import java.util.Scanner;

public class Sekil {

    double kenar,uzunKenar,kisaKenar,yariCap;
    Scanner scan=new Scanner(System.in);
    public Sekil() {
    }
    public void Secim(){
        System.out.println("Lütfen Alanını hesaplamak istediğiniz geometrik şekli giriniz (ölçü birimi cm)\n1. Kare :\n2. Dikdörtgen :\n3. Daire :\n4. Cıkıs :");
        int secim=scan.nextInt();
        switch (secim){
            case 1:
                kare();
                Secim();
                break;
            case 2:
                dikdörtgen();
                Secim();
                break;
            case 3:
               daire();
                Secim();
                break;
            case 4:
                System.out.println("işleminiz sonlanmıştır");
                break;
            default:
                System.out.println("lütfen geçerli bir değer giriniz");
                Secim();
        }

    }
    public  double kare () {
        System.out.println("kare alanı için kenar uzunluğunu giriniz ");
        this.kenar=scan.nextDouble();
        System.out.println("Kare Alanı = "+(kenar*kenar)+"cm^2");
        return (kenar*kenar);
    }

    public  double dikdörtgen () {
        System.out.println("Dikdörtgen alanı için kısa kenar uzunluğunu giriniz ");
        this.kisaKenar=scan.nextDouble();
        System.out.println("Dikdörtgen alanı için kısa kenar uzunluğunu giriniz ");
        this.uzunKenar=scan.nextDouble();
        System.out.println("Dikdörtgen Alanı = "+(kisaKenar*uzunKenar)+"cm^2");
        return (kisaKenar*uzunKenar);
    }
    public double daire(){
        System.out.println("Daire alanı için Yarıçap uzunluğunu giriniz ");
        this.yariCap=scan.nextDouble();
        System.out.println("Daire Alanı = "+(yariCap*yariCap*3.14)+"cm^2");
        return (yariCap*yariCap*3.14);
    }
    }

