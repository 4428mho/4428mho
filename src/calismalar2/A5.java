package calismalar2;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input");
        int input=scan.nextInt();
        int k=0;
        for (int i = 1; i < input; i++) {
            if(input%i==0){
                k+=i;
            }}
        if(k==input){
                System.out.println("Perfect Number");
            }else {
                System.out.println("is not Perfect Number");
            }

        }
    }

