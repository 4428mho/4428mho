package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
        String mail="johnbrown@yahooo.com";

        if (mail.contains("hotmail"))
            { System.out.println(mail.replace("hotmail","gmail"));}
            else {
                     System.out.println("tmm");
}

    }
}
