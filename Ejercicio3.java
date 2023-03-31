/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia3;

import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase/palabra de 8 caracteres:");
        frase = leer.nextLine();
         while(frase.length() != 8){
         System.out.println("Incorrecto.");
         System.out.println("Reingrese una palabra/frase de maximo 8 caracteres");
         frase = leer.nextLine();
         }
         while(frase.length()==8) {
         System.out.println("Correcto.");
         break;
         }
    }
    
}
