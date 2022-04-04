package _03_IfStatement_TernaryOperator;

public class Q09 {

    public static void main(String[] args) {

       /*
            TASK :
            45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
        */
             double i=13;
             if (i%5==0&&i%8==0){
                 System.out.println("able to divide by 5 and 8");
             }else if (i%10==5&&i%9==0){
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        } else {
                 System.out.println("başka bir şey");
             }


    }
}
