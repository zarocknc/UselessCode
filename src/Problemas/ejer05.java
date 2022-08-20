package Problemas;

import java.util.Scanner;

public class ejer05 {
    public static void main (String[] args) {
        Scanner t = new Scanner(System.in);
        //declarando variables
        int a, b, suma, resta;
        //obteniendo input de a y b
        System.out.println("ingrese A: ");
        a=t.nextInt();
        System.out.println("ingrese B: ");
        b = t.nextInt();
        // operando
        suma = a+b;
        resta = a-b;
        // printing
        System.out.println("suma: "+suma);
        System.out.println("resta: "+resta);
    }

}
