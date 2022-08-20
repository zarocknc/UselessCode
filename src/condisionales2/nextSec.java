package condisionales2;

import java.util.Scanner;

public class nextSec {
    public static void main (String[]args) {
        int hora, minuto, segundo;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresar hora");
        hora = t.nextInt();
        System.out.println("ingresar minuto");
        minuto = t.nextInt();
        System.out.println("ingresar segundo");
        segundo = t.nextInt();

        segundo = segundo +1;

        if (segundo==60 ) {
            segundo = 0;
            minuto = minuto+1;
            if (minuto ==60) {
                minuto=0;
                hora = hora +1;
                if (hora ==24) {
                    hora = 0;
                }
            }

        }
        System.out.println("la hora del siguiente segundo es: "+ hora);
    }

}
