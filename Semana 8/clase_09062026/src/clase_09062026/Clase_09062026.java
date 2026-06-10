/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_09062026;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_09062026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Listas 
        /*
        
        ArrayList 
        1) crece dinamicamente. 
            -> agregar nuevos alementos 
            -> eliminar elementos
        2) El tamaño del rraylist cambie 
            el tamaño del arraylist esta definidio por la cantidad de elementos que contiene actualmente.
        
         */

//         ArrayList<tipoDato>  lista = new ArrayList<tipoDato> ();
        ArrayList<String> alumnos = new ArrayList<String>();

        // tamaño de un arraylist 
        int tamano = alumnos.size();
        System.out.println("Tamano del arraylist " + tamano);

        // agregar elementos al arraylist 
        alumnos.add("Claudia");
        alumnos.add("juan");
        alumnos.add("Pedro");
        alumnos.add("Pablo");
        tamano = alumnos.size();
        System.out.println("Tamano del arraylist " + tamano);

        // imprimir o recorrer el arraylist 
        System.out.println("Elementos dentro del arraylist");
        System.out.println("Elementos dentro del array " + alumnos);
//         for (int i = 0; i < alumnos.size(); i++) {
//             System.out.println(alumnos.get(i));
//        }// fin del for 

        // Eliminar elementos 
        /* nota: siempre que eliminamos hay un cambio en el tamaño del arrarlist, y existe la posbilidad de que cambien las pos 
         */
        alumnos.remove(2);
        System.out.println("Elementos dentro del array despues del remove " + alumnos);
        
    }// fin dle main 

}// fin de la classe
