package EjerciciosGuia3;

import java.util.Scanner;

/*  EJERCICIO 7
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
 * Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el 
 * último tiene que ser una O. Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el 
 * final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta. Al finalizar el proceso, 
 * se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se 
 * utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
/**
 *
 * @author ruben
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "00000";
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int bandera = 0;

        //int size = frase.length();
        do {
            System.out.println("Ingrese la cadena: ");
            frase = leer.next();
            //System.out.println(frase.substring(0, 1));
            //System.out.println(frase.substring(4, 5));
            if (frase.length() == 5) {
                if (frase.substring(0, 1).equals("X") && frase.substring(4, 5).equals("O")) {
                    suma++;
                    System.out.println(suma);
                } else {
                    if (frase.equals("&&&&&")) {
                        bandera = 1;
                        break;
                    }
                }
            } else {
                System.out.println("Cadena incorrecta!");
            }

        } while (bandera == 0);
        System.out.println("La cantidad de cadenas correctas es " + suma);
    }
    
    }

