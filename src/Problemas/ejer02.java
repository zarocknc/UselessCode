package Problemas;

import java.util.Scanner;

public class ejer02 {
    public static void main (String[] args) {
        float c,t,m,r,i;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese capital: ");
        c = teclado.nextFloat();
        System.out.println("ingrese la tasa");
        r = teclado.nextFloat();
        System.out.println("ingrese el tiempo");
        t = teclado.nextFloat();
        // formula
        m = (float) Math.pow(((double) (1+r)/100), t)*c;
        i=m-c;
        System.out.println("el monto final es: "+m);
        System.out.println("el interes es: "+ i);
    }
}
