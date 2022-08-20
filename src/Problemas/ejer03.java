package Problemas;

import java.util.Scanner;

public class ejer03 {
    public static void main(String[] args) {
        float area, radio;
        Scanner t = new Scanner(System.in);
        System.out.println("ingrese el radio: ");
        radio = t.nextFloat();
        area= (float) (3.14*Math.pow(radio,2));
        System.out.println("el area del circulo es: "+area);
    }
}
