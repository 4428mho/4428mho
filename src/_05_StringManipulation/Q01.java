package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        
        String str=" bu cümlede boşluk var mı?";
        boolean bosluk=str.contains(" ");
        boolean bos=str.equals(" ");
        System.out.println("bos = " + bos);
        System.out.println("bosluk = " + bosluk);
        int boslukVarMı=str.indexOf(" ");
        System.out.println("boslukVarMı = " + boslukVarMı);
        if (boslukVarMı==-1){
            System.out.println("bu cümlede boşuk karekteri kullanılmamıştır nokta");
        }else {
            System.out.println("bu cümlede boşuk karekteri kullanılmış");

        }

    }
}

