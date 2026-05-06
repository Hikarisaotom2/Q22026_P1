/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_04052026_ejercicios;

/**
 *
 * @author Clau
 */
public class Clase_04052026_ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano = 3;
        int tamano2 = tamano;
        int contador2 = 1;
        int contador = 0;
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
        */
        // este while me ayuda a repetir lineas
        while (contador2 <= tamano2) {
             contador = 1;
              // este while me ayuda a dibujar las lineas 
            while (contador <= tamano) {
                System.out.print(" * ");

                contador++;
            }
            // esta linea me ayuda a agregar un salto de linea
            System.out.println("");
            contador2++;
        }    // fin del while grande   
         

        System.out.println("");

    }// fin del main 

}
