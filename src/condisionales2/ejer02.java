package condisionales2;

import java.util.Scanner;

public class ejer02 {
    public static void main (String[] args) {
        int mes;
        Scanner t = new Scanner(System.in);
        System.out.println("escriba numero del mes");
        mes = t.nextInt();

        switch (mes) {
            case 1, 2, 3 -> System.out.println("la estacion es verano");
            case 4, 5, 6 -> System.out.println("la estacion es otoño");
            case 7, 8, 9 -> System.out.println("la estacion es invierno");
            case 10, 11, 12 -> System.out.println("la estacion es primavera.");
            default -> System.out.println("fuera de rango");
        }
    }
}
