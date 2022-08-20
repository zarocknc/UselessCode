package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer08 {
    public static void main (String[] args) {
        int n1,n2,n3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresar n1");
        n1 = teclado.nextInt();
        System.out.println("ingresar n2");
        n2 = teclado.nextInt();
        System.out.println("ingresar n3");
        n3 = teclado.nextInt();

        if (n1 > n2 & n1 > n3)System.out.println("el numero mayor es n1");
        if (n2 > n1 & n2 > n3)System.out.println("el numero mayor es n2");
        if (n3 > n1 & n3 > n2)System.out.println("el numero mayor es n3");
    }

}
