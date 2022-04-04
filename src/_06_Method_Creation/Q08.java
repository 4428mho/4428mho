package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
  /*
    TASK :
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method create ediniz

     Test Data :
    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */

    public static void main(String[] args) {
        String metin = "Allah Javacı arkadaşlara zihin açıklığı versin";
        String ters=metinters(metin);
        System.out.println(ters);
   }

    private static String metinters(String str) {
        String tersmetin = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
        {
            if (str.substring(i,(i + 1)).equals(" "))
            {
                tersmetin=tersmetin+str.substring(i);
                str=str.substring(0,i);
            }
            if(i==0){
                tersmetin=tersmetin+" "+str.substring(i);
            }

        }
        return tersmetin;
    }
}