package EstructuraCondisionalSimpleDoble;

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        final float d1=0.10F;
        final float d2=0.20F;
        final float igv=0.18F;
        float consumo, montoDscto, montoImpuesto, tPagar;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el monto de consumo:");
        consumo = teclado.nextFloat();

        if (consumo<=100) {
            montoDscto = consumo * d1;
        } else {
            montoDscto = consumo * d2;
        }
        montoImpuesto = (consumo-montoDscto)*igv;
        tPagar=consumo-montoDscto+montoImpuesto;
        // SALIDA
        System.out.println("..................................");
        System.out.println("monto dscto es: "+montoDscto);
        System.out.println("monto impuesto es: "+montoImpuesto);
        System.out.println("total a pagar es: "+tPagar);
    }
}
