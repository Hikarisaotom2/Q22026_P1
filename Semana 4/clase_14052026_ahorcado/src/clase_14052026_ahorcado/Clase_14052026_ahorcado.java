/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_14052026_ahorcado;

import java.util.Scanner;

/**
 *
 * @author Clau
 */
public class Clase_14052026_ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
        Ahorcado....
            Leer desde la consola una palabra.... 
            contador de intentos: 5 vidas 
            vamos a ir preguntando a el usuario por una letra.
                -> si la letra existe en la palabra secreta ingresada, vamos a sustituirla en la cadena 
                -> si la letra no existe en la palabra, vamos a restar una vida. 
           el juego termina cuando nuestra vidas llegan a 0 o cuando adivinamos la palabra....
        
        ingrese una palabra: 
        gato
        cantidad de vidas: 5....
        La palabra oculta es: * * * *
        ingrese una letra: N 
        -> la letra no existe en la aplaabra secreta, perdio una vida...
        
        .
        cantidad de vidas: 4....
        La palabra oculta es: * * * *
        ingrese una letra: a
        -> La letra si existe en la palabra... felicidades... 
        
        cantidad de vidas: 4....
        La palabra oculta es: * a * *
         ingrese una letra: g
        -> La letra si existe en la palabra... felicidades... 
        
        cantidad de vidas: 4....
        La palabra oculta es: g a * *
        
        
        */
     // de char a ascii 
            char letraPrueba = 'M';
          
        int codigoAscii = letraPrueba;
        System.out.println("letra "+letraPrueba+" ascii "+codigoAscii);
       

     Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = entrada.next();
        palabra = palabra.toLowerCase();
        String palabraCodigo = "";
        int vidas = 5;
        boolean ganar = true;
        for (int i = 0; i < palabra.length(); i++) {
            palabraCodigo = palabraCodigo+"*";
        }
 
        System.out.println(palabraCodigo);
        while (true) {
            System.out.println("Cantidad de vidas "+vidas);
            System.out.println(palabraCodigo);
            System.out.println("Ingrese una letra");
            char letra = entrada.next().toLowerCase().charAt(0);
             String nuevaCadenaOculta = "";
             boolean encontramosLetra = false;
             for (int i = 0; i < palabra.length(); i++) { //recorrer la palabra
                 char letraActual = palabra.charAt(i);
                 char caracterOculto = palabraCodigo.charAt(i);
                 
                if(letra == letraActual){
                  nuevaCadenaOculta = nuevaCadenaOculta+letraActual;
                  encontramosLetra= true;
                }else{
                   
                 nuevaCadenaOculta = nuevaCadenaOculta+caracterOculto;
                }
            }//fin del for 
             palabraCodigo = nuevaCadenaOculta;
            System.out.println("La nueva cadena es "+palabraCodigo);
            if(encontramosLetra){
                System.out.println("Fallaste");
                vidas--;
                if(vidas==0){
                    break;
                }
            }
            if (palabraCodigo.equals(palabra)) {
                System.out.println("Felicidades, ganaste");
                break;
            }
        }// fin del while 
        
 
        
    }// fin del main 
    
}//fin de la clase 
