package UcusProjesiTeam;

import java.util.Scanner;

public class Bolum2 {

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("====================================\nONLINE BiLET İSLEMLERİ\n" +
                "====================================\n"
                + "1- Yolcu Bilgileri \n2- Uçuş Tipi \n3-  \nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                yolcuBilgileri();
                break;
            case "2":
                ucusTipi();
                break;
            case "3":
                break;
            case "Q":
                break;
            default:
                System.out.println("hatalı giriş yaptınız :(((");

                break;

        }
    }

    private static void ucusTipi() {
    }

    private static void yolcuBilgileri() {
    }
}