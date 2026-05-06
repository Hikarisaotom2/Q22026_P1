/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase._05052026;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_05052026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        leer la altura: 
        
        3
        * ->1
        ** ->2
        *** ->3
        
        5 
        * ->1
        **->2
        ***->3
        ****->4
        *****->5
        
           *
         * *
       * * *
        
        */
       Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo");
       int altura = entrada.nextInt();
       int contadorLineas=1;
         
        while (contadorLineas<=altura) {// repite la linea
          int contadorAsteriscos=1;
            while (contadorAsteriscos<=contadorLineas) { // dibuja la linea 
                System.out.print(" * ");
                contadorAsteriscos++;
            }
            System.out.println("");
            contadorLineas++;
        }//fin del while
        
    }// fin del main 
    
}// fin de la clase
