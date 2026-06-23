/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static int filaActual = 0;
    public static int columnaActual = 0;

    public static void main(String[] args) {
        /*
        1  Crear
        2 recorrer/ imprimir 
        3 A W S D 
         */

        int filas = 5;
        int columnas = 2;

        int[][] matriz = new int[filas][columnas];
        imprimirMatriz(matriz);

        String[][] tablero = new String[5][5];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] =" ";
            }
        }
//        while (true) {
//            tablero = moverse(tablero);
//            imprimirMatrizString(tablero);
//        }
        System.out.println("");
        int num = 2545;
        String resultado = conversion(num,"");
        System.out.println(num+ " en Hexadecimal es "+ resultado);
    }
    
        public static String conversion(int num, String valor){
        if(num ==0){ //caso base 
            return valor;
        }else{ //caso recursivo 
            int nuevoNumero = num/16;
            int residuo = num%16;
            String reiduoHexa = representarHexa(residuo);
            return conversion(nuevoNumero,reiduoHexa+valor);
        }
        
    }
    
    public static String representarHexa(int num) {
        String valor = "";
        if (num <= 9) {
            valor = "" + num;
        } else {
            switch (num) {
                case 10 -> {
                    valor = "A";
                }
                case 11 -> {
                    valor = "B";
                }
                case 12 -> {
                    valor = "C";
                }
                case 13 -> {
                    valor = "D";
                }
                case 14 -> {
                    valor = "E";
                }
                case 15 -> {
                    valor = "F";
                }
            }
        }

        return valor;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { //filas 
            for (int j = 0; j < matriz[i].length; j++) { //columnas 
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }// fin del metodo 

    public static void imprimirMatrizString(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { //filas 
            for (int j = 0; j < matriz[i].length; j++) { //columnas 
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }// fin del metodo 

        
    public static String[][] moverse(String[][] tablero) {
        int filas = tablero.length;
        int columnas = tablero[0].length;
        System.out.println("Ingrese la pos");
        Scanner entrada = new Scanner(System.in);
        String valor = entrada.next();
        valor = valor.toLowerCase();
        char pos = valor.charAt(0);
        switch (pos) {
            case 'a' -> {//izq 
                // se resta 1 a la  columna y la fila se mantiene 
                if (columnaActual - 1 >= 0) {
                    tablero[filaActual][columnaActual] = " ";
                    columnaActual--;
                    tablero[filaActual][columnaActual] = "c";
                } else {
                    System.out.println("Se sale del tablero");
                }
            }
            case 'w' -> {// arriba 
                // se restaq 1 a la  fila y la columna se mantiene 
                if (filaActual - 1 >= 0) {
                    tablero[filaActual][columnaActual] = " ";
                    filaActual--;
                    tablero[filaActual][columnaActual] = "c";
                } else {
                    System.out.println("Se sale del tablero");
                }
            }
            case 's' -> { // abajo 
                // se suma 1 a la  fila y la columna se mantiene 
                if (filaActual + 1 <= filas - 1) {
                    tablero[filaActual][columnaActual] = " ";
                    filaActual++;
                    tablero[filaActual][columnaActual] = "c";
                } else {
                    System.out.println("Se sale del tablero");
                }
            }
            case 'd' -> { //derecha 
                // se suma 1 a la  columna y la fila se mantiene 
                if (columnaActual + 1 <= columnas - 1) {
                    tablero[filaActual][columnaActual] = " ";
                    columnaActual++;
                    tablero[filaActual][columnaActual] = "c";
                } else {
                    System.out.println("Se sale del tablero");
                }
            }

        }

        /*
        A
        W
        S
        D
         */
        return tablero;
    }
    
    

}
