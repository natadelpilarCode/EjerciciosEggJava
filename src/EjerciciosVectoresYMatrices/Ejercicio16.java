/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosVectoresYMatrices;

import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author DELL
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector;
        int tamaño,num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el tamaño del vector");
        tamaño = leer.nextInt();
        vector = new int[tamaño];
        LlenarVector(vector);        
        MostrarVector(vector);
        System.out.println("Qué número deseas buscar (Enrre 0 y 20)?");
        num = leer.nextInt();
        BuscarNumero(vector,num);
    }   
    
    public static void LlenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*20);
        }
    }
    
    public static void MostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "  ");
        }
        System.out.println("");
    }
    
    public static void BuscarNumero(int[] vector,int numBuscar)
    {
        String mostrarPosicion = "";
        int contar = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]==numBuscar)
            {
                contar++;
                mostrarPosicion += "," + i; 
            }
        }
        
        if(contar>1)
        {
            System.out.println("El número se encuentra repetido " + contar + " veces y se encuentra en las posiciones " + mostrarPosicion.substring(1, mostrarPosicion.length()));
        }   
        else if(contar==1)
                System.out.println("El número se encuentra en la posicion " + mostrarPosicion.substring(1, mostrarPosicion.length()));
        else
            System.out.println("El número no se encontró");
    }   
    
}
