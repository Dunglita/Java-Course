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
public class Suma {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int x = s.nextInt();
        System.out.println("Ingrese un segundo numero:");
        int z = s.nextInt();
        int resultado = x + z;
        System.out.println("La suma de ambos numeros es: "+resultado);

    }
    
}
