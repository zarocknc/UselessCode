package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer02 {
    public static void main (String[] args) {
        float calificacion;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese la calificacion del alumnon");
        calificacion=t.nextFloat();

        if (calificacion>=100) {
            System.out.println("Usted ingreso a la especialidad de sistemas.");
        } else {
            System.out.println("Usted no alcanzo el puntaje maximo.");
        }
    }
}
