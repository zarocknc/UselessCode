package condisionales2;

import java.util.Scanner;

public class ejer03 {
    public static void main (String[] args) {
        int nota;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese la nota del alumno");
        nota = t.nextInt();

        switch (nota) {
            case 0,1,2,3,4,5 -> System.out.println("PESIMO");
            case 6,7,8,9,10 -> System.out.println("MALO");
            case 11,12,13,14 -> System.out.println("regular");
            case 15,16,17 -> System.out.println("Bueno");
            case 18,19,20 -> System.out.println("Excelente");

        }
    }
}
