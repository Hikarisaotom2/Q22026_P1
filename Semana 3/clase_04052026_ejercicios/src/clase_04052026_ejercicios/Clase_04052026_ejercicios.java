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
        int tamano = 5;
        int tamano2 = tamano;
        int contador = 1;
        int contador2 = 1;
        // * * * * * 
        while (contador2 <= tamano2) {
              contador=0;
            while (contador <= tamano) {
                System.out.print("*");

                contador++;
            }
            System.out.println("");
            contador2++;
        }

        System.out.println("");

    }

}
