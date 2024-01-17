package problema_1;

import java.util.Random;

public class Problema_5 {

    public static void main(String[] args) {
        int limfila = 3;
        int limcolum = 3;
        int[][] matriz1 = new int[limfila][limcolum];

        completarMatriz(matriz1, limfila, limcolum);
        System.out.println("Matriz: ");
        generarMatriz(matriz1, limfila, limcolum);

        System.out.println("La suma de la matriz es: " + sumaMatriz(matriz1, limfila, limcolum));
        System.out.println("La resta de la matriz es: " + restaMatriz(matriz1, limfila, limcolum));
        System.out.println("La multiplicacion de la matriz es: " + multiplicacionMatriz(matriz1, limfila, limcolum));
    }

    static void completarMatriz(int[][] matriz, int limfila, int limcolum) {
        Random random = new Random();
        for (int i = 0; i < limfila; i++) {
            for (int j = 0; j < limcolum; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }
    }

    static void generarMatriz(int[][] matriz, int limfila, int limcolum) {
        for (int i = 0; i < limfila; i++) {
            for (int j = 0; j < limcolum; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }

    static int sumaMatriz(int[][] matriz, int limfila, int limcolum) {
        int suma = 0;
        for (int i = 0; i < limfila; i++) {
            for (int j = 0; j < limcolum; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println(" ");
        return suma;
    }

    static int restaMatriz(int[][] matriz, int limfila, int limcolum) {
        int resta = 0;
        for (int i = 0; i < limfila; i++) {
            for (int j = 0; j < limcolum; j++) {
                if (i == 0 && j == 0) {
                    resta = matriz[i][j];
                } else {
                    resta -= matriz[i][j];
                }
            }
        }
        System.out.println(" ");
        return resta;
    }

    static int multiplicacionMatriz(int[][] matriz, int limfila, int limcolum) {
        int multiplicacion = 1;
        for (int i = 0; i < limfila; i++) {
            for (int j = 0; j < limcolum; j++) {
                multiplicacion *= matriz[i][j];
            }
        }
        System.out.println(" ");
        return multiplicacion;
    }
}
/* Matriz: 
5 | 7 | 7 |  
9 | 3 | 6 |  
2 | 3 | 1 |  
 
La suma de la matriz es: 43
 
La resta de la matriz es: -33
 
La multiplicacion de la matriz es: 238140 */