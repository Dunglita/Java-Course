/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author Dungla
 */
public class CortarCadena {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto");
        String texto = s.nextLine();
        int longitud = texto.length();
        longitud = longitud/2;
        String parte1 = texto.substring(0, longitud);
        String parte2 = texto.substring(longitud, longitud*2);
        System.out.println("La primera parte de la cadena es: "+parte1+ "\n"+ "La segunda parte de la cadena es: "+parte2);
        
    }
}
