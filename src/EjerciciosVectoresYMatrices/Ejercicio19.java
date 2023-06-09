/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosVectoresYMatrices;

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author DELL
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz,matrizT;
        int dimension;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la dimensión de la matriz (se dará por hecho que la matriz es cuadrada)");
        dimension = leer.nextInt();
        matriz = new int[dimension][dimension];
        matrizT = new int[dimension][dimension];
        LlenarMatriz(matriz,leer);
    }

    private static void LlenarMatriz(int[][] matriz, Scanner leer) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite el valor para la matriz ["+i+"]["+j+"]");
                matriz[i][j] = leer.nextInt();
            }
        }
    }
    
}
