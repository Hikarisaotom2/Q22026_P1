/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_11052026;

/**
 *
 * @author Clau
 */
public class Clase_11052026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas = 1;
        int n = 11;
        int tamano = (2 * n) - 1;
        int contadorIzquierdo = n;
        int contadorDerecho = n;
        while (filas <= n) {
            int columnas = 1;
            while (columnas <= tamano) {
                if (columnas == contadorIzquierdo || columnas == contadorDerecho) { //fila 2...2n-1
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (filas ==tamano) { //ultima fila 
                    System.out.print("*");
                }

                columnas++;
            }
            System.out.println("");
            filas++;
            contadorIzquierdo--;
            contadorDerecho++;
        }
        int x = 1;
        while (x<=tamano) {
            System.out.print("*");
            x++;
        }
        System.out.println("");
    }// fin del main 

}// fin de la clase 
