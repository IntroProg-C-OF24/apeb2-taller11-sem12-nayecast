package problema_1;

import java.util.Scanner;

public class Problema_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ingrelit;
        double ladoCuadra, altTrian, baseTrian, altRect, baseRect;
        System.out.println("Ingrese el numero de lo que desea calcular");
        System.out.println("1. Area Cuadrado");
        System.out.println("2. Area Triangulo");
        System.out.println("3. Area Rectangulo");
        System.out.println(" ");
        ingrelit = teclado.nextInt();
        System.out.println(" ");

        switch (ingrelit) {
            case 1 -> {
                System.out.println("Ingresar el lado del cuadrado:");
                ladoCuadra = teclado.nextDouble();
                System.out.println(" ");
                System.out.println("Area del cuadrado es: " + areaCuadra(ladoCuadra));
            }
            case 2 -> {
                System.out.println("Ingrese altura del triangulo:");
                altTrian = teclado.nextDouble();
                System.out.println(" ");
                System.out.println("Ingrese base del triangulo:");
                baseTrian = teclado.nextDouble();
                System.out.println(" ");
                System.out.println("Area del triangulo es: " + areaTrian(baseTrian, altTrian));
            }
            case 3 -> {
                System.out.println("Ingrese base del rectangulo:");
                baseRect = teclado.nextDouble();
                System.out.println(" ");
                System.out.println("Ingrese altura del rectangulo:");
                altRect = teclado.nextDouble();
                System.out.println(" ");
                System.out.println("El area del rectangulo es: " + areaRect(baseRect, altRect));
            }
            default ->
                System.out.println("El rango de opciones es de 1 al 3. Ingrese nuevamente.");
        }
    }

    static double areaCuadra(double ladoCuadra) {
        double areaTotal;
        areaTotal = ladoCuadra * ladoCuadra;
        return areaTotal;
    }

    static double areaTrian(double baseTrian, double altTrian) {
        double areaTotal;
        areaTotal = (baseTrian * altTrian) / 2;
        return areaTotal;
    }

    static double areaRect(double baseRect, double altRect) {
        double areaTotal;
        areaTotal = baseRect * altRect;
        return areaTotal;

    }
}
/* Ingrese el numero de lo que desea calcular
1. Area Cuadrado
2. Area Triangulo
3. Area Rectangulo
 
3
 
Ingrese base del rectangulo:
15
 
Ingrese altura del rectangulo:
9
 
El area del rectangulo es: 135.0 */
