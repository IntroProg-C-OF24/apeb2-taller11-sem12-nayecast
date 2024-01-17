package problema_1;

import java.util.Scanner;

public class Problema_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double parametro1, parametro2, parametro3, parametro4;
        System.out.println("Ingrese la nota del parametro 1: ");
        parametro1 = teclado.nextDouble();
        System.out.println("Ingrese la nota del parametro 2: ");
        parametro2 = teclado.nextDouble();
        System.out.println("Ingrese la nota del parametro 3: ");
        parametro3 = teclado.nextDouble();
        System.out.println("Ingrese la nota del parametro 4: ");
        parametro4 = teclado.nextDouble();
        System.out.println("El promedio cualitativo es: " + promCualitativo(parametro1, parametro2, parametro4, parametro4));
    }

    static String promCualitativo(double parametro1, double parametro2, double parametro3, double parametro4) {
        double promedio = (parametro1 + parametro2 + parametro3 + parametro4) / 4;
        String cualitativo;

        if (promedio <= 5) {
            cualitativo = "Regular";
        } else if (promedio <= 8) {
            cualitativo = "Bueno";
        } else if (promedio <= 9) {
            cualitativo = "Muy bueno";
        } else {
            cualitativo = "Sobresaliente";
        }
        System.out.println(" ");
        return cualitativo;
    }
}
/*Ingrese la nota del parametro 1: 
8,5
Ingrese la nota del parametro 2: 
9
Ingrese la nota del parametro 3: 
10
Ingrese la nota del parametro 4: 
7,5
 
El promedio cualitativo es: Muy bueno */