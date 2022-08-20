package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer03 {
    public static void main (String[] args) {
        int n1,n2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese n1");
        n1 = teclado.nextInt();
        System.out.println("ingrese n2");
        n2 = teclado.nextInt();

        if (n1>n2) {
            System.out.println("n1 es mayor a n2");
        } else {
            System.out.println("n1 es menor a n2.");
        }
    }
}
