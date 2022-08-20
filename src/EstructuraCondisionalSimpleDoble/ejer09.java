package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer09 {
    public static void main (String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num = teclado.nextInt();
        if (num%2==0) {
            System.out.println("es numero es par asique el doble es: "+(num*2));
        } else {
            System.out.println("el numero es impar asi que el triple es: "+(num*3));
        }
    }
}
