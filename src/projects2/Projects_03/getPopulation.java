package projects2.Projects_03;

import java.util.*;

public class getPopulation {

    /*
        Method name is populationOfCountry

        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)

        countryNames is Country names

        countryPopulations is Country population

        if str is contained in the countryNames return the population


        For example:

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return should be 120000

        NOTE : if str is not in the countryNames array return -1
     */


    /*
    Method adı populationOfCountry
    Bu method  String array(countryNames) ,  int array (countryPopulations) ve   String (str) alacak

     countryNames : Ülke isimleri

     countryPopulations: Ülke nüfusları

      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et

      Ornegin;

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return 120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali
        private static int populationOfCountry(String[] countryNames, int[] countryPopulations, String str) {

         String[] countryNames = {"USA", "Mexico", "Canada"};
        int[] countryPopulations = {100000, 120000, 130000};
        String str = "Mexico";
​
        int population = populationOfCountry(countryNames,countryPopulations,str);
        System.out.println(population);
​
        int population=0;
        for (int i = 0; i < countryNames.length; i++) {
            if (str.contains(countryNames[i])) {
                population=countryPopulations[i];
            }else population=-1;
​
        }
​
        return population;
    }
}


     */
    public static void main(String[] args) {
        method3();
            }
           static String[] countryNames = {"USA" ,"Mexico" ,"Canada"};
           static int [] countryPopulations = {100000 , 120000 , 130000};
           private static int method3() {
               Scanner scan = new Scanner(System.in);
               System.out.println("lütfen bir ülke ismi giriniz");
               String str = scan.nextLine();
               List<String> ulke = List.of(str.split(" "));
               System.out.println("ulke = " + ulke);

               for (int i = 0; i < countryNames.length; i++) {
                   for (int j = 0; j < ulke.size(); j++) {
                       if (ulke.get(i).equalsIgnoreCase(countryNames[j])){
                           System.out.println("bahsi geçen "+ulke.get(i)+" nüfusu  "+countryPopulations[j]
                           );
                       }

                   }

               }
               return -1;
           }
}







