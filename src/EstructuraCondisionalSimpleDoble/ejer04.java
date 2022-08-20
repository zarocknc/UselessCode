package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer04 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        num = teclado.nextInt();
        if (num > 0) {
            System.out.println("el numero es positivo");
        } else if (num ==0) {
            System.out.println("el numero es neutro");
        } else {
            System.out.println("el numero es negativo");
        }
    }
}
