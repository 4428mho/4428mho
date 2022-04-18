package calismalar2;

public class A12 {
    public static void main(String[] args) {
        String input = "ade1r4d3";
        String k=input.replaceAll("\\D","");
        int toplam=0;
        for (int i = 0; i <k.length() ; i++) {
        
            toplam += Integer.valueOf(k.substring(i, i + 1));}

        System.out.println("toplam = " + toplam);
    }
}
