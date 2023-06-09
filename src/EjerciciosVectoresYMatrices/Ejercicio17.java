/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosVectoresYMatrices;
import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author DELL
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector;
        int tamaño;
        int[] contador = {0,0,0,0,0};
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el tamaño del vector");
        tamaño = leer.nextInt();
        vector = new int[tamaño];
        LlenarVector(vector);        
        MostrarVector(vector);        
        ContarDigitos(vector,contador);
    }
    
    public static void LlenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*90000);
        }
    }
    
    public static void MostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "  ");
        }
        System.out.println("");
    }
    
    public static void ContarDigitos(int[] vector, int[] contador){
        for(int i = 0;i<vector.length;i++)
        {
            int longitud = Integer.toString(vector[i]).length();
            switch(longitud)
            {
                case 1:
                    contador[0]++;
                    break;
                case 2:
                    contador[1]++;
                    break;
                case 3:
                    contador[2]++;
                    break;
                case 4:
                    contador[3]++;
                    break;
                case 5:
                    contador[4]++;
                    break;
            }          
        }
        
        //Mostrar los contadores de los digitos
        for (int i = 0; i < contador.length; i++) {
            System.out.println("La cantidad de números con " + (i+1) + " dígito(s) es " + contador[i] );
        }
    }    

}
