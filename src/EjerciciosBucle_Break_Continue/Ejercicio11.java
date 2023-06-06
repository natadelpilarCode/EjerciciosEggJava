/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosBucle_Break_Continue;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 * @author DELL
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1= 0,num2 = 0;        
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Digite el primer número");
            num1 = leer.nextInt();
            if(!ValidarNumeroPositivo(num1))
                System.out.println("El número debe ser un entero positivo, intente nuevamente");
           
        } while (!ValidarNumeroPositivo(num1));
        
        do {
            System.out.println("Digite el segundo número");
            num2 = leer.nextInt(); 
            if(!ValidarNumeroPositivo(num2))
                System.out.println("El número debe ser un entero positivo, intente nuevamente");
            
        } while (!ValidarNumeroPositivo(num2));
        
        Menu(num1,num2);
    }

    private static boolean ValidarNumeroPositivo(int numero) {
        return numero>0;
    }

    private static void Menu(int num1, int num2) {
        int opcion;
        char opcionSalir;
        System.out.println("MENÚ\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nElija opción");
        Scanner leer = new Scanner(System.in);
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La suma entre " + num1 + " y " + num2 + " es:" + Sumar(num1,num2));
                Menu(num1,num2);
                break;
            case 2:
                System.out.println("La resta entre " + num1 + " y " + num2 + " es:" + Restar(num1,num2));
                Menu(num1,num2);
                break;
            case 3:
                System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es:" + Multiplicar(num1,num2));
                Menu(num1,num2);
                break;
            case 4:
                System.out.println("La división entre " + num1 + " y " + num2 + " es:" + Dividir(num1,num2));
                Menu(num1,num2);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                opcionSalir = leer.next().charAt(0);
                if("S".equalsIgnoreCase(String.valueOf(opcionSalir)))                   
                    break;
                else
                    Menu(num1,num2);
                break;
            default:
                System.out.println("Esta opción no está disponible, intente nuevamente");
                Menu(num1,num2);
        }
    }

    private static int Sumar(int num1, int num2) {
        return num1 + num2;
    }

    private static int Restar(int num1, int num2) {
        return num1 - num2;
    }

    private static int Multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    private static double Dividir(int num1, int num2) {
        return (double)num1/num2;
    }
    
}
