/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosBucle_Break_Continue;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * @author DELL
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de (*) por lado del cuadrado");
        num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if((i == 0 || i == num-1) || (j == 0 || j == num-1) )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
    }
    
}
