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
public class LongitudCadena {
    public static void main(String[] args){
        System.out.println("Ingrese un cadena de texto:");
        Scanner s = new Scanner(System.in);
        String texto = s.nextLine();
        int longitud = texto.length();
        System.out.println("La longitud de la cadena de texto es: "+longitud+" unidades.");

    }
}
