/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosVectoresYMatrices;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 * @author DELL
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        LlenarMatriz(matriz);
        System.out.println("Matriz original");
        MostrarMatriz(matriz);
        System.out.println("Matriz traspuesta");
        MostrarMatrizTranspuesta(matriz);
    }
    
    public static void LlenarMatriz(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*20);
            }
        }
    }
    
    public static void MostrarMatriz(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]    "); 
            }
            System.out.println("");
        }
    }
    
    public static void MostrarMatrizTranspuesta(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[j][i] + "]    "); 
            }
            System.out.println("");
        }
    }
}
