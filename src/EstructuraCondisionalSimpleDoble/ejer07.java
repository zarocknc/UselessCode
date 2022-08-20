package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer07 {
    public static void main (String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese numero");
        num = teclado.nextInt();
        if (num%2==0) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
    }
}
