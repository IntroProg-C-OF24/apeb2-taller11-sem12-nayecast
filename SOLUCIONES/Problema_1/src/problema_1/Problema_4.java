package problema_1;

import java.util.Scanner;

public class Problema_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreClien, cedulaClien;
        double valorKV, cantKV, valorInmueble;

        System.out.println("Ingresar nombre del cliente: ");
        nombreClien = teclado.nextLine();
        System.out.println("Ingresar cedula del cliente: ");
        cedulaClien = teclado.nextLine();

        System.out.println("Ingrese literal que necesita:");
        System.out.println(" ");
        System.out.println("1 Planilla de luz");
        System.out.println("2 Predio de un bien inmueble");
        System.out.println(" ");
        int literal = teclado.nextInt();
        System.out.println(" ");

        switch (literal) {
            case 1 -> {
                System.out.println("Ingresar el valor del Kilovatio: ");
                valorKV = teclado.nextDouble();
                System.out.println("Ingrese la cantidad de kilovatios gastos en el mes: ");
                cantKV = teclado.nextDouble();
                System.out.println(" ");
                System.out.println("Resultado");
                System.out.println(" ");
                System.out.println("Cliente " + nombreClien + " cedula " + cedulaClien
                        + " debe pagar: " + planillaLuz(valorKV, cantKV));
            }
            case 2 -> {
                System.out.println("Ingresar el valor del Inmueble: ");
                valorInmueble = teclado.nextDouble();
                System.out.println(" ");
                System.out.println("Resultado");
                System.out.println(" ");
                System.out.println("Cliente " + nombreClien + " cedula " + cedulaClien
                        + " su total de inmueble es" + valorInmueble + " y su total de predio a pagar es" + valPredio(valorInmueble));
            }
            default ->
                System.out.println("no existe");
        }
    }

    static double planillaLuz(double valorKV, double cantKV) {
        double planilla;
        planilla = valorKV * cantKV;
        return planilla;
    }

    static double valPredio(double valorInmueble) {
        double predio;
        predio = valorInmueble * 0.02;
        return predio;
    }
}
/*Ingresar nombre del cliente: 
Camila
Ingresar cedula del cliente: 
1104939275
Ingrese literal que necesita:
 
1 Planilla de luz
2 Predio de un bien inmueble
 
1
 
Ingresar el valor del Kilovatio: 
9,2
Ingrese la cantidad de kilovatios gastos en el mes: 
100
 
Resultado
 
Cliente Camila cedula 1104939275 debe pagar: 919.999 */
