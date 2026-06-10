/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_08062026;

import java.util.Random;

/**
 *
 * @author claudiacortes
 */
public class Clase_08062026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz1 = new int[3][2];
        matriz1= llenarMatriz(matriz1);
        int [][] matriz2 = new int[2][3];
        matriz2= llenarMatriz(matriz2);
        imprimirMatriz(matriz1);
        imprimirMatriz(matriz2);
        int filaM1 = matriz1.length;
        int columnaM1 = matriz1[0].length;
        
        
        int filaM2 = matriz2.length;
        int columnaM2 = matriz2[0].length;
        
        int [][] resultado = new int[filaM1][columnaM2];
        int contColumna = 0;
        //fila 
        for (int i = 0; i < filaM1; i++) { //filas
            for (int j = 0; j <columnaM1; j++) { //columnas
                int pos = matriz1[i][j];
               int valorFila = matriz1[i][j];
                int acum = 0;
                for (int k = 0; k < columnaM2; k++) { //columnasb de la matriz2;
                    for (int l = 0; l < filaM2; l++) {
                        int valorColumna = matriz2[k][l];
                        acum+= valorFila*valorColumna;
                    }
                }
                resultado[i][j]= acum;
                
            }
        }
        
        
        
        
        
    }
      public static void imprimirMatriz(int [][] matriz){
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        
    }
    
    public static int [][] llenarMatriz(int [][] matriz){
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(1,5);
            }
        }
        
        return matriz;
    }
    
    
}
