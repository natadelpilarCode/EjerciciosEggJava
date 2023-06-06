/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosBucle_Break_Continue;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 * @author DELL
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0,num2, suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un valor límite positivo");
        do {            
            num = leer.nextInt();
            if(num<=0)
                System.out.println("Debe digitar un valor positivo, vuelva a intentar");
        } while (num<=0);
        
        while(suma <= num)
        {
            System.out.println("Digite un número");
            num2 = leer.nextInt();
            suma += num2;
        }      
        
        System.out.println("La sumatoria de los números digitados es: " + suma);
    }
    
}
