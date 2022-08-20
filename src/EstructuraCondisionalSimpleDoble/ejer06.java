package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer06 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        System.out.println("Escriba un numero:");
        n1 = teclado.nextInt();
        if (n1%3==0) {
            System.out.println("- El numero SI es multiplo de 3.");
        } else {
            System.out.println("- El numero NO es multiplo de 3.");
        }
        if (n1%5==0) {
            System.out.println("- El numero SI es multiplo de 5.");
        } else {
            System.out.println("- El numeor NO es multiplo de 5");
        }
    }
}
