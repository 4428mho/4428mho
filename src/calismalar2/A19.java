package calismalar2;

import java.util.Arrays;

public class A19 {
    public static void main(String[] args) {
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        System.out.println(Arrays.toString(names));

       names=swapelements(names);
        System.out.println(Arrays.toString(names));
    }

    public static String [] swapelements(String[] names) {
        String a=names[7];
        names[7]=names[2];
        names[2]=a;
        return names;
    }
}


