/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosBucle_Break_Continue;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 * @author DELL
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantEuro;
        
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Digite la cantidad de euros que quiere convertir");
            cantEuro = leer.nextInt();
            if(cantEuro<=0)
                System.out.println("La cantidad de euros debe ser mayor a 0");
        } while (cantEuro<=0);
        
        Menu(cantEuro);   
        
    }

    private static void Menu(int cantEuro) {
        int opcionMoneda;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la opción de la moneda a la que desea convertir sus euros");
        System.out.println("1. Dólares \n2. Yenes\n3. Libras");
        opcionMoneda = leer.nextInt();
  
        if(opcionMoneda>=1 && opcionMoneda <=3)
            ConvertirEuro(cantEuro,opcionMoneda);
        else
        {
            System.out.println("La opción que elegiste no existe. Vuelve a intentar");
            Menu(cantEuro);
        }
    }
   
    public static void ConvertirEuro(int cantEuro,int opcion)
    {
        switch(opcion)
        {
            case 1:
                System.out.println(cantEuro + " euros equivalen a " + (cantEuro * 1.28611) + " dólares");
                break;
            case 2:
                System.out.println(cantEuro + " euros equivalen a " + (cantEuro * 129.852) + " yenes");
                break;
            case 3:
                System.out.println(cantEuro + " euros equivalen a " + (cantEuro * 0.86) + " libras");
                break;           
        }
    }
}
