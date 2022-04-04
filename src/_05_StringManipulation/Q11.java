package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

String kelime="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

         int str1=kelime.indexOf('A');
         int str2=kelime.indexOf('L');
         int str3=kelime.indexOf('I');
        System.out.println(kelime.charAt(str1)+""+kelime.charAt(str2)+""+kelime.charAt(str3));
    }
}
