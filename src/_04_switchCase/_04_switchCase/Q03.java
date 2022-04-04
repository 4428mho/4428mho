package _04_switchCase._04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
        Scanner scan=new Scanner(System.in);
        System.out.println("yılın kaçıncı ayını öğrenmek isersiniz");
        int  ay= scan.nextInt();
        switch (ay) {
            case 12:
                System.out.println("ARALIK 31");
                break;
            case 1:
                System.out.println("OCAK 31");
                break;
            case 2:
                System.out.println("lütfen bulunduğunuz yılı girin");
                int yıl=scan.nextInt();
                if (yıl%4==0){
                    System.out.println("şubat 29");
                } else {
                    System.out.println("subat 28");
                }
                break;
            case 3:System.out.println("MART 31");
                break;
            case 4:System.out.println("NİSAN 30");
                break;
            case 5:System.out.println("MAYIS 31");
                break;
            case 6:System.out.println("HAZİRAN 30");
                break;
            case 7:System.out.println("TEMMUZ 31");
                break;
            case 8:System.out.println("AĞUSTOS 31");
                break;
            case 9:System.out.println("EYLÜL 30");
                break;
            case 10:System.out.println("EKİM 31");
                break;
            case 11:System.out.println("KASIM 30");
                break;
            default:
                System.out.println("12 den fazla ay yok");


    }
}}

