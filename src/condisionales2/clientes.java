package condisionales2;

import java.util.Scanner;

public class clientes {
    public static void main (String[] args) {
        char cliente;
        float compra;
        double Dscto = 0, Plazo = 0, Tpagar;
        Scanner t = new Scanner(System.in);
        System.out.println("ingrese el monto de compra");
        compra = t.nextInt();
        System.out.println("ingrese el tipo de cliente (G)eneral , (A)filiado");
        cliente = t.next().charAt(0);

        switch (cliente) {
            case 'G' -> {
                Dscto = 0.15;
                Plazo = 0.12;
            }
            case 'A' -> {
                Dscto = 0.20;
                Plazo = 0.08;
            }
        }
        Tpagar = compra - (compra*Dscto);
        System.out.println("Total a pagar es: "+Tpagar);
        System.out.println("El porcentaje de plazo es: "+Plazo);
    }
}
