/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_02062026;

/**
 *
 * @author claudiacortes
 */
public class Clase_02062026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] matrizCuadrada = new String [4][4];// Cuadrada 
        String [][] matrizRectangulo= new String [4][2];// No Cuadrada 
        String [][] matrizDinamica= new String [3][];// Matriz donde cada fila tiene una diferente tamaño
        
        matrizDinamica[0] = new String[14]; // 0...13 
        matrizDinamica[1] = new String[2]; //0..1
        matrizDinamica[2] = new String[10];//0...9

//
//        for (int i = 0; i < matrizDinamica.length; i++) {
//            matrizDinamica[i] = new String[i];
//        }
        
        // Agregar valores dentro de una matriz 
        matrizCuadrada[0][0] ="x";
        //Obtener valor dentro de una matriz 
        String valor = matrizCuadrada[0][0];
         
        matrizCuadrada = llenarMatriz(matrizCuadrada);
        matrizRectangulo = llenarMatriz(matrizRectangulo);
        matrizDinamica = llenarMatriz(matrizDinamica);
       
        System.out.println("Cuadrada");
       imprimirMatriz(matrizCuadrada);
        
       System.out.println("Rectangulo");
       imprimirMatriz(matrizRectangulo);
       
        System.out.println("Dinamica");
        imprimirMatriz(matrizDinamica);
        
        
    }// fin del main 
    
    public static String[][] llenarMatriz(String[][] matriz){
         for (int i = 0; i < matriz.length;i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas 
               matriz[i][j] ="_";
            }// fin del for 
        }// fin del for 
        return matriz;
    }
    
    public static void imprimirMatriz(String[][] matriz){
         for (int i = 0; i < matriz.length;i++) { // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas 
                System.out.print(" "+matriz[i][j]+" ");
            }// fin del for 
             System.out.println("");
        }// fin del for 
    }
    
}// fin de la clase
