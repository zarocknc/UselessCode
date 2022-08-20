package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer01 {
    public static void main (String[] args) {
        Scanner t = new Scanner(System.in);
        float calificacion;
        System.out.println("ingrese la calificacion del alumno");
        calificacion = t.nextFloat();
        if (calificacion>=13)System.out.println("El alumno esta aprobado.");
    }

}
