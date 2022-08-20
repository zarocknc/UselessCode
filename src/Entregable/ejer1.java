package Entregable;

import java.util.Scanner;

public class ejer1 {
    public static void main (String[] args) {
        float dsct1=0.1F, dsct2=0.2F, dsct3=0.3F, igv=0.18F, compra;
        float Md= 0.0F;
        float montoImpuesto;
        float tPagar;

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar importe de compra");
        compra = teclado.nextFloat();

        if (compra <= 100) {
            Md = dsct1;
        } else if (compra>100 & compra <200) {
            Md =dsct2;
        } else if (compra >=200) {
            Md = dsct3;
        }
        montoImpuesto = (compra-Md)*igv;
        tPagar=compra-Md+montoImpuesto;
        // SALIDA
        System.out.println("..................................");
        System.out.println("monto dscto es: "+Md);
        System.out.println("monto impuesto es: "+montoImpuesto);
        System.out.println("total a pagar es: "+tPagar);
    }
}
