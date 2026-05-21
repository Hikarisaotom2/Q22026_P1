/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_20052025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_20052025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //REPASO METODOS 
        
        //llamar o invocar metodos 
        imprimirMensajeEnPantalla();
        int valor = leerYValidarNumero();
        int resultado = sumar(5,8);
        int resultado2 = sumar(valor,valor);
        int resultado3 = sumar(valor,8);
        
    }// fin del main 
    
    public static void imprimirMensajeEnPantalla(){
            System.out.println("Bienvenido al programa");
    }// fin del metodo 
    
    public static int leerYValidarNumero(){
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
            do {
             System.out.println("Ingrese un numero");
             numero = entrada.nextInt();
            } while (numero<=0);
        return numero;
    }// fin del metodo 
    
    public static int sumar(int numero1, int numero2){
        int resultado = numero1+numero2;
        return resultado;
    }// fin del metodo 
    
    
    
}// fin de la clase 
