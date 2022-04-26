package projects2.Projects_03;

public class SubtractionSquare {



     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /*
   substSquare: bu method parametre olara iki int alır ve  parametreleri getSumOfSquares methodu ile
    return edilen degerlerin toplamını  return eder.

  Örnek:
    int 1 = 10;
    int 2 = 5;
    3025 + 225 = 3250
    return 3250

   getSumOfSquares methodunu kullanarak Parametre sayıya kadar sayıları toplar ve toplamın karesini return eder.
   Örnek:
      int 1 = 10;              yazacağınız method 10 u kullanarak 3025 sonucu verir

  parametreleri kullanıcıdan alınız
    */
    public static void main(String[] args) {
        
        
        getSumOfSquares();
        return ;

    }

    private static int getSumOfSquares() {
        int a = 10;
        int b = 5;
        int toplam2=0;
        int toplam1=0;
        int sonuc;


        for  (int i = 0; i <= a; i++) {
            toplam1+=i;
        }
        for (int i = 0; i <= b; i++) {
            toplam2+=i;
        }
        sonuc=toplam1*toplam1+toplam2*toplam2;
        System.out.println("sonuc = " + sonuc);
        return sonuc;
        
    }
}
