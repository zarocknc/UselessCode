package condisionales2;

import java.util.Scanner;

public class temp {
    public static void main (String[] args) {
        Scanner t = new Scanner(System.in);
        int temperatura;
        System.out.println("Ingrese temperatura");
        temperatura = t.nextInt();
        String sensacion="";
        switch (temperatura) {
            case 0,1,2,3,4,5,6,7,8,9 -> sensacion="frio";
            case 10,11,12,13,14,15,16,17,18,19,20 -> sensacion ="nublado";
            case 21,22,23,24,25,26,27,28,29,30 -> sensacion="calor";
            default -> sensacion="tropical";
        }
        System.out.println(sensacion);
    }
}
