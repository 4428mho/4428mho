package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir X düzlemi için bir a değeri griniz");
        double a = scan.nextDouble();
        System.out.println("Bir Y düzlemi için bir b değeri grinizb değeri griniz");
        double b = scan.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println(" konum orjin de");
        } else if (a == 0) {
            System.out.println("konum Y düzleminde");
        } else if (b == 0) {
            System.out.println("konum x düzleminde ");
        } else if (a > 0 && b > 0) {
            System.out.println("Konum 1. bölgede");
        } else if (a > 0 && b < 0) {
            System.out.println("Konum 4. bölgede");
        } else if (a < 0 && b > 0) {
            System.out.println("Konum 2. bölgede");
        } else if (a < 0 && b < 0) {
            System.out.println("Konum 3. bölgede");
        }
    }
}
