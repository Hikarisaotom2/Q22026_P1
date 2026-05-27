/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_26052026;

import java.util.Random;

/**
 *
 * @author claudiacortes
 */
public class Clase_26052026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arreglos 
        /*
        1) representan listas
        2) solamente pueden contener elementos de un mismo tipo de datos.
        3) tienen un tamaño fijo...
        4) tenga elementos dentro o no, su tamaño se mantiene
        */
        
        // TipoDeDaato[] nombreVariable = new TipoDeDaato[tamano];
        int [] listaNumeros = new int[10];
        int tamano = listaNumeros.length;
        System.out.println(tamano);
        

        //actualizar el valor de una pos variable[pos] = nuevoValor;
        listaNumeros[1] = 550;
        
        // acceder al valor de una pos listaNumeros[pos]
        int valor = listaNumeros[1];
        System.out.println("El valor es "+valor);
        
        // 24,60,18,51
        int [] numeroDiaria = {24,60,18,51};
        System.out.println("Numeros de la diaria");
        for (int i = 0; i < numeroDiaria.length; i++) {
            System.out.println(numeroDiaria[i]);
        }
        
            System.out.println("Numeros random");
         int [] valores = new int[10];
         
         //Random 
         Random random = new Random();
         for (int i = 0; i < valores.length; i++) {
             int numeroRandom = random.nextInt(20, 50);
             valores[i] = numeroRandom;
        }
         
        for (int i = 0; i < valores.length; i++) {
                System.out.println(valores[i]);
        }
         
         
        
    }// fin del main
    
}// fin de la clase
