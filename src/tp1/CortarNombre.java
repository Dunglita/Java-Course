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
public class CortarNombre {
    public static void main (String[] args){
        System.out.println("Ingrese su nombre y apellido separado por un espacio:");
        Scanner s = new Scanner(System.in);
        String nombre = s.nextLine();
        int longitud = nombre.length();
        int posicion = nombre.indexOf(' ');
        String name = nombre.substring(0,posicion);
        String surname = nombre.substring(posicion, longitud);
        System.out.println("El nombre es: "+name+"\nEl apellido es:"+surname+".");
        
    }
}
