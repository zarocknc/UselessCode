package Problemas;

import java.util.Scanner;

public class ejer01 {
    public static void main (String[] args) {
        int n, res;
        Scanner t = new Scanner(System.in);
        System.out.println("ingrese N");
        n = t.nextInt();
        res = (n*(n+1))/2;
        System.out.println("el valor al aplicar la formula es: "+res);

    }
}
