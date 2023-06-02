/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosCondicionales;

import java.util.Scanner;

/**
 *Crear un programa que dado un numero determine si es par o impar.
 * @author DELL
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un número");
        num = leer.nextInt();
        if(num % 2 == 0)
            System.out.println("El número " + num + " es par");
        else
            System.out.println("El número " + num + " es impar");
    }
    
}
