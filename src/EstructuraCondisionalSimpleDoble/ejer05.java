package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer05 {
    public static void main (String[] args) {
        boolean esVocal=false;
        char letra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("escriba una letra");
        letra = teclado.next().charAt(0);

        if (letra == 'a'|| letra =='A') esVocal=true;
        if (letra == 'e'|| letra =='E') esVocal=true;
        if (letra == 'i'|| letra =='I') esVocal=true;
        if (letra == 'o'|| letra =='O') esVocal=true;
        if (letra == 'u'|| letra =='U') esVocal=true;


        if (esVocal) {
            System.out.println("La letra es vocal");
        } else {
            System.out.println("la letra no es vocal");
        }

    }
}
