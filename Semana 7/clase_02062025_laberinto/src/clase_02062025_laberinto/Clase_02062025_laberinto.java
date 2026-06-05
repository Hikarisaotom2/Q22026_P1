/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_02062025_laberinto;

import java.util.Random;
import java.util.Scanner;

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

        char[][] tablero = new char[7][8];
        int obstaculos = 4;
        tablero = llenartablero(tablero, obstaculos);
      while (true) {
             imprimirTablero(tablero);
             tablero = moverJugador(tablero);
        }
    }

    public static int[] buscarJugador(char[][] tablero) {
        int fila = -1;
        int columna = -1;
        int[] pos = new int[2];
        for (int i = 0; i < tablero.length; i++) {// filas 
            for (int j = 0; j < tablero[i].length; j++) { //columnas
                if (tablero[i][j] == 'P') {
                    //encontramos al jugador.
                    fila = i;
                    columna = j;
                }
            }
        }//fin del for 
        pos[0] = fila;
        pos[1] = columna;
        return pos;
    }

    public static char[][] moverJugador(char[][] tablero) {
        int[] pos = buscarJugador(tablero);
        int filajugador = pos[0];
        int columnaJugador = pos[1];
        Scanner entrada = new Scanner(System.in);
        int direccion = 0;
        do {
            System.out.println("1. arriba");
            System.out.println("2. abajo");
            System.out.println("3. Izq");
            System.out.println("4. der");
            direccion = entrada.nextInt();
        } while (direccion < 1 || direccion > 4);

        int tamanoFilas = tablero.length;
        int tamanoColumnas = tablero[0].length;

        switch (direccion) {
            case 1 -> { // arriba , restar 1 a la fila 
                if (filajugador - 1 < 0) {
                    System.out.println("No puede salir del tablero");
                } else {
                    //nos podemos mover 
                    if (tablero[filajugador - 1][columnaJugador] == 'X') {
                        System.out.println("Obstaculo! no te puedes mover");
                    } else {
                        tablero[filajugador ][columnaJugador] =' ';
                        tablero[filajugador - 1][columnaJugador] = 'P';
                    }
                }
            }
            case 2 -> { // abajo, sumar 1 a la fila 
                if (filajugador + 1 >= tamanoFilas) {
                    System.out.println("No puede salir del tablero");
                } else {
                    //nos podemos mover 
                    if (tablero[filajugador + 1][columnaJugador] == 'X') {
                        System.out.println("Obstaculo! no te puedes mover");
                    } else {
                        tablero[filajugador ][columnaJugador] =' ';
                        tablero[filajugador + 1][columnaJugador] = 'P';
                    }
                }
            }
            case 3 -> { //izq , restar 1 a la columna 
                if (columnaJugador - 1 < 0) {
                    System.out.println("No puede salir del tablero");
                } else {
                    //nos podemos mover 
                    if (tablero[filajugador][columnaJugador - 1] == 'X') {
                        System.out.println("Obstaculo! no te puedes mover");
                    } else {
                        tablero[filajugador ][columnaJugador] =' ';
                        tablero[filajugador][columnaJugador - 1] = 'P';
                    }
                }
            }
            case 4 -> {// derecha , sumar 1 a la columna 
                if (columnaJugador + 1 >= tamanoColumnas) {
                    System.out.println("No puede salir del tablero");
                } else {
                    //nos podemos mover 
                    if (tablero[filajugador][columnaJugador + 1] == 'X') {
                        System.out.println("Obstaculo! no te puedes mover");
                    } else {
                        tablero[filajugador ][columnaJugador] =' ';
                        tablero[filajugador][columnaJugador + 1] = 'P';
                    }
                }
            }
        }// fin del switch 
        return tablero;
    }

    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) { // filas 
            for (int j = 0; j < tablero[i].length; j++) {// columnas
                System.out.print("[" + tablero[i][j] + "]");
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
        tablero = agregarElementoRandom(tablero, 'T');
        tablero = agregarElementoRandom(tablero, 'P');
        int contador = 0;
        while (contador < obstaculos) {
            tablero = agregarElementoRandom(tablero, 'X');
            contador++;
        }
        return tablero;
    }// fin del metodo 

    public static char[][] agregarElementoRandom(char[][] tablero, char elemento) {
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
