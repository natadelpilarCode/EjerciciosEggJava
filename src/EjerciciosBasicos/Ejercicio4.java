/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosBasicos;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author DELL
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gradosCentigrados,gradosFarenheit;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los grados centigrados");
        gradosCentigrados = leer.nextDouble();
        gradosFarenheit = 32 + (9 * gradosCentigrados / 5);
        System.out.println(gradosCentigrados + " grados centigrados corresponen a " + gradosFarenheit + " grados farenheit");
    }
    
}
