/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_30042026;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_30042026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        un programa que posee un menu, que debe estarse ejecutando hasta ue el usuario decida parar. 
        
        -> validar que las opcioes ingresadas por el usuario, sean validas 
        
        1 sumar numeros 
        2 factorial de un numero 
        3 el numero es par o impar  (NO PODEMO UTILIZAR EL OPERADOR %) 
        4 Salir 
        
        NOta: para todas las opciones vamos a validar que las entreda sean mayores a 0. 
        
         */

        int opcion = -1;
        Scanner entrada = new Scanner(System.in);

        while (opcion != 4) {
            System.out.println("Ingrese una opcion");
            System.out.println("1 sumar ");
            System.out.println("2 factorial");
            System.out.println("3 Pares impares");
            System.out.println("4 Salir ");
            opcion = entrada.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opcion no valida");
            } else {
                // las opciones son validas....
                if (opcion == 1) {
                    System.out.println("Sumar");
                    int valor1 = -1;
                    while (valor1 <= 0) {
                        System.out.println("Ingrese un numero mayor a 0");
                        valor1 = entrada.nextInt();
                    }
                    int valor2 = -1;
                    while (valor2 <= 0) {
                        System.out.println("Ingrese un numero mayor a 0");
                        valor2 = entrada.nextInt();
                    }
                    int resultado = valor1 + valor2;
                    System.out.println("EL RESULTADO ES " + resultado);
//                    System.out.println("eL RESULTADO ES "+(valor1+valor2));

                } else if (opcion == 2) {
                    System.out.println("Factorial");
                    int valor = -1;
                    while (valor <= 0) {
                        System.out.println("Ingrese un numero mayor a 0");
                        valor = entrada.nextInt();
                    }
                    int contador = 1;
                    int acumulador = 1;
                    while (contador <= valor) {

                        //contador+=1;
                        //contador++;
                        acumulador = contador * acumulador;
                        // acumulador *= contador;
                        contador = contador + 1;

                    }

                    System.out.println("El resultado es: " + acumulador);

                } else if (opcion == 3) {
                    System.out.println("Pares e impares");
                    int valor = -1;
                    while (valor <= 0) {
                        System.out.println("Ingrese un numero mayor a 0");
                        valor = entrada.nextInt();
                    }
                    int temporal = valor;
                    while (temporal != 0 && temporal != 1) {
                        temporal -= 2;
//                        temporal = temporal -2;
                    }
                    if (temporal == 1) {
                        System.out.println("Impar");
                    } else {
                        System.out.println("Par");
                    }
                } else {
                    System.out.println("Saliedo del sistema...");
                }
            }

        }// fin del while 

    }// fin de la clase 

}// fin de la clase 
