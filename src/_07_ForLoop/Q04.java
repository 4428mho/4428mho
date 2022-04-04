package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan=new Scanner(System.in);
        int toplam=0;

        for (int i = 1; i < 6; i++) {
            System.out.print(i+". sayı = ");
            int str2=scan.nextInt();
            if (str2>=5&&str2<=10){
                str2=0;
            } toplam+=str2;
        }System.out.print("toplam = " + toplam);
    }

}
