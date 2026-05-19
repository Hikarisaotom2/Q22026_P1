/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_18052026;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_18052026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
//        String cadena;
//        do {
//             System.out.println("Ingrese una cadena: ");
//          cadena = entrada.nextLine();
//        } while (cadena.length()==0);
//        
//        System.out.println("Ingrese el numero de desplazamiento");
//        int numero = entrada.nextInt();
//        System.out.println("Cadena original " + cadena);
//        for (int i = 0; i < cadena.length(); i++) {
//            int asciiCode = cadena.charAt(i);
//
//            if ((asciiCode >= 65 && asciiCode <= 90) || (asciiCode >= 97 && asciiCode <= 122)) {
//                int nuevoAscii = asciiCode + numero;
////            System.out.println(cadena.charAt(i)+ " -> "+asciiCode + " -> "+nuevoAscii);
//                char nuevoChar = (char) nuevoAscii;
//                System.out.print(nuevoChar);
//            } else {
//                System.out.print(cadena.charAt(i));
//            }
//        }
//        boolean tieneMayusculas = false;
//        boolean tieneNumeros = false;
//        boolean tieneChars = false;
//        boolean tiene8Chars = false;
//        
//        for (int i = 0; i < cadena.length(); i++) {
//            char charActual = cadena.charAt(i);
//            if (charActual>=65 && charActual<=90) { //tiene mayusulas;
//                tieneMayusculas = true;
//            }else if(charActual>=48 && charActual<=57){//tiene numeros
//                tieneNumeros = true;
//            }else if(charActual == '!' || charActual =='#' || charActual=='$'||charActual=='%'){ //tiene simbolos especiales
//             tieneChars = true;
//            }
//        }//fin del for
//        if(cadena.length()>=8){
//            tiene8Chars = true;
//        }
//        tiene8Chars = cadena.length()>=8;
//        
//        if(!tieneMayusculas){
//            System.out.println("Falta una mayuscula");
//        }
//        
//        if(!tieneNumeros){
//            System.out.println("Falta un numero");
//        }
//        
//        if(!tieneChars){
//            System.out.println("Falta un caracter especial");
//        }
//        
//        if(!tiene8Chars){
//            System.out.println("Debe tener como minimo 8 caracteres");
//        }
//        //invocar o llamar al metodo
        System.out.println("Ejerccio 1");
        hola();
        System.out.println("Ejerccio 2");
        hola();
        System.out.println("Ejerccio 3");
        hola();
        hola();
        hola();
        hola();
        hola();
        hola();
        hola();
        hola();
        hola();
        hola();
        hola();
        hola();

    }// fin del main 

    /*
    Como escribir metodos sin fallar. 
    
    ->se escriben fuera del main pero dentro de la clase 
    -> public static debe ir al inciio de todos los metodos que se van a usar en el main 
    -> se pueden llamar como querramos, siguen las reglas para las variable
     */
    public static void hola() {
        System.out.println("Ingrese un numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        while (numero <= 0 || numero >= 500) {
            System.out.println("Numero invalido");
            System.out.println("Ingrese un numero");
            numero = entrada.nextInt();

        }
    }//fin del metodo 

}// fin de la clase 
