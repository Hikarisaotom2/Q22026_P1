/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_12052026;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_12052026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Strings 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String cadena = entrada.nextLine();
        // 0..... tamano-1
        int tamano = cadena.length();
        int ultPos = tamano - 1;
//       cadena.charAt(0);

        //Mayusculas
        String cadenaMayuscula = cadena.toUpperCase();
        //Minusculas
        String cadenaMinuscula = cadena.toLowerCase();
        
        System.out.println("La cadena original: " + cadena);
        System.out.println("La cadena en mayuscula es: " + cadenaMayuscula);
        System.out.println("La cadena en minuscula es: " + cadenaMinuscula);
        
//        if (cadena=="Gato") { //Para los strings, las igualdades no funcionan de esta manera cuando leemos un texto desde la consola 
//            System.out.println("Bienvenido al menu secreto...");
//        }else{
//            System.out.println("La contraseña es incorrecta...");
//        }

        System.out.println("Comparando usando equals");
        if(cadena.equals("Gato")){ 
           System.out.println("Bienvenido al menu secreto...");
        }else{
            System.out.println("La contraseña es incorrecta...");
        }
        
        System.out.println("Comparando usando equalsIgnoreCase");
        if(cadena.equalsIgnoreCase("Gato")){
           System.out.println("Bienvenido al menu secreto...");
        }else{
            System.out.println("La contraseña es incorrecta...");
        }
        
        // REEMPLAZAR 
        String nuevaCadena=cadena.replace("a", "_");//usando replace para cambiar las letras a
//        String nuevaCadena=cadena.replace("a", "");// usando replace para eliminar
        System.out.println("La nueva cadena con el replace es "+nuevaCadena);
        
        //Verificar si existe un  char dentro de un string 
        // Hola -> -1
        int pos = cadena.indexOf("a");
        int posNoExiste = cadena.indexOf("ñ");// si el valor que buscamos no existe, obtenemos -1
        System.out.println("La letra a esta en la pos "+pos);
        System.out.println("La letra ñ esta en la pos "+posNoExiste);
        
        //SubString
        // HolaMundo
        //Teoria de conjuntos: [inicial,final[ 
        String subCadena = cadena.substring(0, 4);
        System.out.println("La subcadena es "+subCadena);
        
 
        
        
        

    }// fin del main

}// fin de la clase
