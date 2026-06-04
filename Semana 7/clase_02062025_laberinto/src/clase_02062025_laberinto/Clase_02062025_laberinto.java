/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_02062025_laberinto;

import java.util.Random;

/**
 *
 * @author claudiacortes
 */
public class Clase_02062025_laberinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Laberinto de tamano dinamico 
            -> facil (3x3) (2 obstaculos)
            -> intermedio (5x4)(4  obstaculos)
            -> dificil (7x8) (10 obstaculos)
        => el juego termina cuando el jugador escapa del laberinto o cuenado encuentra el tesoro.
        => El laberinto puede tener obstaculos que impiden que el jugador avance a esa casilla. 
        => el jugador puede moverse en una de 4 direcciones: arriba, abajo, izq, derecha 
        => Validaciones: el jugador no puede atravesar obstaculos, no puede salir del tablero
        => La salida siempre sera la pos 0,0 
        => los obstaculos,  el tesoro y el jugador  se generan dinamicamente
         */

        char[][] tablero = new char[3][3];
        int obstaculos = 2;
        tablero = llenartablero(tablero,obstaculos);
        imprimirTablero(tablero);
    }
    
    public static void imprimirTablero(char[][] tablero){
         for (int i = 0; i < tablero.length; i++) { // filas 
            for (int j = 0; j < tablero[i].length; j++) {// columnas
                System.out.print("["+tablero[i][j]+"]");
            }// fin del for 
             System.out.println("");
        }// fin del for 
    }

    public static char[][] llenartablero(char[][] tablero, int obstaculos) {
        for (int i = 0; i < tablero.length; i++) { // filas 
            for (int j = 0; j < tablero[i].length; j++) {// columnas
                tablero[i][j] = ' ';
            }// fin del for 
        }// fin del for 
        // obstaculos, jugador, tesoro 
       
        tablero[0][0] = 'S';
        tablero = agregarElementoRandom(tablero,'T');
        tablero = agregarElementoRandom(tablero,'P');
        int contador = 0;
        while (contador < obstaculos) {
           tablero = agregarElementoRandom(tablero,'X');
            contador++;
        }
        return tablero;
    }// fin del metodo 
    
    
    public static char[][] agregarElementoRandom(char [][] tablero, char elemento){
        // calcular las dimensiones del tablero
         int tamanoFilas = tablero.length;
        int tamanoColumnas = tablero[0].length;
        
        Random r = new Random();
        // calcular pos random en base a l rango de pos validad 
        int fila = r.nextInt(0, tamanoFilas); //0 
        int columna = r.nextInt(0, tamanoColumnas); // 0 
        
        //Revisar que la pos generada no elementos  
        while (tablero[fila][columna] != ' ') { 
            fila = r.nextInt(1, tamanoFilas);
            columna = r.nextInt(1, tamanoColumnas);
        }
        //agregar al tablero el elemento en una pos random 
        tablero[fila][columna] = elemento;
        
        return tablero;
    }// fin del metodo

}// fin de la clase 
