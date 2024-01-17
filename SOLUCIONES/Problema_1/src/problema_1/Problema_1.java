package problema_1;

import java.util.Random;

public class Problema_1 {

    public static void main(String[] args) {
        int numfil = 3;
        int numcolum = 3;
        int[][] matriz1 = new int[numfil][numcolum];
        int[][] matriz2 = new int[numfil][numcolum];
        int[][] matriz3 = new int[numfil][numcolum];

        completarMatriz(matriz1, numfil, numcolum);
        System.out.println("Matriz: ");
        generarMatriz(matriz1, numfil, numcolum);
        System.out.println(" ");
        System.out.println("Los numeros pares de esta matriz son:");
        completPares(matriz1, matriz2, numfil, numcolum);
        generarMatriz(matriz2, numfil, numcolum);
        System.out.println("Los numeros impares de esta matriz son:");
        completImpares(matriz1, matriz3, numfil, numcolum);
        generarMatriz(matriz3, numfil, numcolum);
        System.out.println("El promedio de la matriz es: " + generarPromedio(matriz1, numfil, numcolum));
    }

    static void completarMatriz(int[][] matriz1, int numfil, int numcolum) {
        Random random = new Random();
        for (int i = 0; i < numfil; i++) {
            for (int j = 0; j < numcolum; j++) {
                matriz1[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    static void generarMatriz(int[][] matrizA, int valorfil, int valorcolum) {
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                System.out.print(matrizA[i][j] + "  |  ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    static void completPares(int[][] matriz1, int[][] matriz2, int numfil, int numcolum) {
        for (int i = 0; i < numfil; i++) {
            for (int j = 0; j < numcolum; j++) {
                if (matriz1[i][j] % 2 == 0) {
                    matriz2[i][j] = matriz1[i][j];
                } else {
                    matriz2[i][j] = 0;
                }
            }
        }
    }

    static void completImpares(int[][] matriz1, int[][] matriz3, int numfil, int numcolum) {
        for (int i = 0; i < numfil; i++) {
            for (int j = 0; j < numcolum; j++) {
                if (matriz1[i][j] % 2 != 0) {
                    matriz3[i][j] = matriz1[i][j];
                } else {
                    matriz3[i][j] = 0;
                }
            }
        }
    }

    static double generarPromedio(int[][] matriz1, int numfil, int numcolum) {
        int suma = 0;
        double promedio;
        for (int i = 0; i < numfil; i++) {
            for (int j = 0; j < numcolum; j++) {
                suma += matriz1[i][j];
            }
        }
        promedio = suma / (numfil * numcolum);
        return promedio;
    }
}
/* Matriz: 
65  |  88  |  23  |  
73  |  18  |  38  |  
39  |  85  |  30  |  
 
 
Los numeros pares de esta matriz son:
0  |  88  |  0  |  
0  |  18  |  38  |  
0  |  0  |  30  |  
 
Los numeros impares de esta matriz son:
65  |  0  |  23  |  
73  |  0  |  0  |  
39  |  85  |  0  |  
 
El promedio de la matriz es: 51.0 */