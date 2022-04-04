package _06_Method_Creation;

import java.util.Scanner;

public class Q03_1 {
    public static void main(String[] args) {

        donusturucu();

    }
        public static void donusturucu() {
            Scanner scanner = new Scanner(System.in);
            int secim;
            do {
                System.out.println("Yapmak istediginiz islem seciniz " +
                        "\nsaat(12 h): 1\nmil : 2\nkilogram : 3");
                secim = scanner.nextInt();
                switch (secim) {
                    case 1:
                        System.out.println("Lutfen saat giriniz");
                        double saat = scanner.nextDouble();
                        double saniye = (saat * 60) * 60;
                        if (saat <= 0 || saat > 12) {
                            System.out.println("Gecersiz giris");
                        } else if (saat > 0 || saat < 13) {
                            System.out.println(saat + " saat = " + saniye + " saniye dir.");
                        }
                        break;
                    case 2:
                        System.out.println("Lutfen mil giriniz");
                        double mil = scanner.nextDouble();
                        double km = mil * 1.609;
                        if (mil <= 0) {
                            System.out.println("Hatali giris yaptiniz");
                        } else {
                            System.out.println(mil + " mil = " + km + " km dir.");
                        }
                        break;
                    case 3:
                        System.out.println("Lutfen kilogram giriniz");
                        double kg = scanner.nextDouble();
                        double gram = kg * 1000;
                        if (kg <= 0) {
                            System.out.println("Hatali giris yaptiniz");
                        } else {
                            System.out.println(kg + " kg = " + gram + " gr dir.");
                        }
                        break;
                    default:
                        System.out.println("Hatali veri girisi yaptiniz");
                }
            } while (secim < 1 || secim > 3);
        }
    }


