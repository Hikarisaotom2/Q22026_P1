/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_06052026;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_06052026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Strings -> Compuesto
      // string -> se compone por 1 o mas caracteres (char)
      // Chars -> letras
      String miCadena =  "Hola Mundo";// representan un string
      char caracter = 'J';// ' representando es un char
      
//      H o l a   m u n d o -> 10
//      0 1 2 3 4 5 6 7 8 9 -> pos 
//      primera: 0  ultima pos: 9
// pos validas de un string siempre se calculan como:

        System.out.println(miCadena);
      // obtener el tamano de una string 
        int tamanoCadena = miCadena.length();
        System.out.println("La cadena tiene "+tamanoCadena +"Chars");
        // obtener caracteres en una pos
        char charEnPos = miCadena.charAt(4);
        System.out.println("en la pos 4 "+charEnPos);
        charEnPos = miCadena.charAt(0);
//        System.out.println("en la pos 0 "+charEnPos);
//         charEnPos = miCadena.charAt(100);
//         
//        System.out.println("en la pos 0 "+charEnPos);
        
        
        //Leer string
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una oracion ");
        String conEspacios= entrada.nextLine(); // ORACIONES 
          System.out.println(conEspacios);
          
        System.out.println("Ingrese una palabra");
        String sinEspacios= entrada.next(); // sin espacios 
          System.out.println(sinEspacios);
          System.out.println("Ingrese una letra");
        char letra = entrada.next().charAt(0);
        
        //  0.. tamano-1
        //Forma 1
        System.out.println("Forma 1");
      
        int contador = sinEspacios.length()-1;
        while (contador>=0) {
          char pos = sinEspacios.charAt(contador);
            System.out.print(pos);
          contador--;
        }
        System.out.println("");
        
        //forma 2
        System.out.println("Forma 2");
        String acumulador = "";
       int contador2 = sinEspacios.length()-1;
        while (contador2>=0) {
            acumulador+=sinEspacios.charAt(contador2);
             //acumulador=acumulador+sinEspacios.charAt(contador2);
            contador2--;
        }
        System.out.println(acumulador);
      
        //forma 3 
      
       
    }// fin del main 
    
}// fin de l clase 
