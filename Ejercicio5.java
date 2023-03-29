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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int max;
        int suma;

        suma = 0;
        System.out.println("Ingrese el valor maximo a respetar:");
        max = leer.nextInt();

        do {
            System.out.println("Ingrese los valores a ingresar:");
            num = leer.nextInt();
            suma = suma + num;

        } while (suma < max);
        System.out.println("El total de los valores ingresados es: " + suma);
               
       
    }
    
}
