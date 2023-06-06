/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosBucle_Break_Continue;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas.
 * @author DELL
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        int correcta = 0, incorrecta = 0;
        Scanner leer = new Scanner(System.in);
       
        do {
            System.out.println("Digite una cadena");
            cadena = leer.next();
            if(!cadena.equals("&&&&&"))
            {
                if(ValidarCadena(cadena))
                    correcta ++;
                else
                    incorrecta ++;
            }
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("Lecturas correctas:" + correcta + "\nLecturas incorrectas:"+ incorrecta);
    }
    
    public static boolean ValidarCadena(String cadena)
    {
        if(cadena.length()>5)
            return false;
        else if(!"X".equals(cadena.substring(0,1)) || !"O".equals(cadena.substring(cadena.length()-1,cadena.length())))
            return false;
        else
            return true;
    }   
    
}
