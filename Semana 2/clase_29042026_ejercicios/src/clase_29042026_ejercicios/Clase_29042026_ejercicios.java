/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_29042026_ejercicios;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_29042026_ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1 Leer 3 numeros y determinar cual es el mayor de los 3 numeros. 
        2 Leer 5 numeros y determinar cual es el mayor de los 3 numeros. 
        3 Leer 7 numeros y determinar cual es el mayor de los 3 numeros. 
        4 Leer 30 numeros y determinar cual es el mayor de los 3 numeros. 
        5 Leer X numeros y determinar cual es el mayor de los 3 numeros. 
         X sera un valor dado por el usuario.
         */
        
       /*
        Contador: variable que va contando un evento. 
        Acumulador: es una variable que va almacenando los valores qe van apareciendo
        Bandera: variables que ayudan a controlar un estado. 
        */
       
       Scanner entrada = new Scanner(System.in);
       int numero;
       int numeroMasGrande=-1;// OJO!
       int contadorNumero=0;
       System.out.println("Ingrese cuantos numeros va a evaluar");
       int maxNumero = entrada.nextInt();
       
        while (contadorNumero<maxNumero) {
            System.out.println("Ingrese un numero" );
            numero = entrada.nextInt();
            if(numero>=numeroMasGrande){
                numeroMasGrande = numero;
            }
            contadorNumero++;
        }
        System.out.println("El numero mas grande es: "+numeroMasGrande);
       
        
    }// fin del main

}// fin del main
