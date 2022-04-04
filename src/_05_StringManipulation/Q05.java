package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
        String  str1="%13.99";
        String str2= "%10.55";
        String str3=str1.substring(1);
        String str4=str2.substring(1);
        
        System.out.println("str4 = " + str4);
        System.out.println("str3 = " + str3);
        double str5=Double.parseDouble(str3);
        double str6=Double.parseDouble(str4);
        System.out.println("str5 = " + str5);

        double tplm=str5+str6;
        System.out.println("tplm = " + tplm);

    }
}
