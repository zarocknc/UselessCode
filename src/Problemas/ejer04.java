package Problemas;

import java.util.Scanner;

public class ejer04 {
    public static void main (String[] args) {
        Scanner t = new Scanner(System.in);
        int hora, minuto, segundo, secInput,minutoSinExeso;
        System.out.println("Ingrese segundos");
        secInput = t.nextInt();
        //formulando
        segundo = secInput%60;
        minuto=(secInput-segundo)/60;
        minutoSinExeso = (minuto%60);
        hora = (minuto-minutoSinExeso)/60;
        //quitamos minuto exeso
        minuto= minuto-(hora*60);
        //respuesta
        System.out.println("Horas: " + hora);
        System.out.println("Minutos: "+ minuto);
        System.out.println("Segundos: "+ segundo);
    }
}
