/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosBasicos;

import java.util.Scanner;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
 * Java.
 * @author DELL
 */
public class Ejercicio3 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite una frase");
        frase = leer.nextLine();
        
        System.out.println("La frase en minúscula es:\n"+frase.toLowerCase());
        System.out.println("La frase en mayúscula es:\n"+frase.toUpperCase());
    }    
}

