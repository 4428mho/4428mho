package _17_Set;

import java.util.HashSet;

public class Ex01 {

    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {

        int arr[]={1,3,6,8,9,12,6,45};
        HashSet<Integer> hs1 =new HashSet<>();
        setMethod(arr,hs1);
        yazdır(hs1);
    }

    private static void setMethod(int[] arr, HashSet<Integer> hs1) {for (Integer k:arr) {hs1.add(k);}}
    private static void yazdır(HashSet<Integer> hs1) {System.out.println(hs1);}
}

