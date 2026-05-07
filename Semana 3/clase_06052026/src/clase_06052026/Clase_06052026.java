/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_06052026;

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
        System.out.println("en la pos 0 "+charEnPos);
         charEnPos = miCadena.charAt(100);
         
        System.out.println("en la pos 0 "+charEnPos);
      
       
    }// fin del main 
    
}// fin de l clase 
