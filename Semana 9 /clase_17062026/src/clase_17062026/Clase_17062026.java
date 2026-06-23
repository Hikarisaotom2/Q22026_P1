/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_17062026;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_17062026 {

    public static String acumDerechaIzq = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1) busqueda secuencial recursiva. 
            Arraylist con strings, y debemos buscar un elemento. 
            -> si existe vamos a retornar la pos en la que esta. 
            -> si no existe, entonces retornaremos -1 
        
        2) Verificar si dos palabras son palindromas recursivamente. 
        
        
         */
        // ana 
//        String palabra = "ana";
//        for (int i = palabra.length()-1; i >=0; i--) {
//            acumDerechaIzq+=palabra.charAt(i);
//        }
//       boolean resp = palabra.equals(acumDerechaIzq);

//       //moom
//       boolean isPalindroma = true;
//       int ultimaPos = palabra.length()-1;
//        for (int i = 0; i <palabra.length();i++) {
//            if(palabra.charAt(i) == palabra.charAt(ultimaPos-i)){ //las letras coinciden
//                
//            }else{
//                // La palabra No es palindroma
//                isPalindroma = false;
        //  break;
//            }
//        }
        String palabra = "moom";
        boolean respuesta = palindromosRecursivo(palabra, palabra.length() - 1);
//            System.out.println("El valor de la variable global es "+ acumDerechaIzq);
        acumDerechaIzq = "";
        System.out.println(palabra + " es palindroma? " + respuesta);
        String palabra1 = "ana";
        boolean respuesta1 = palindromosRecursivo(palabra1, palabra1.length() - 1);
//            System.out.println("El valor de la variable global es "+ acumDerechaIzq);
        System.out.println(palabra1 + " es palindroma? " + respuesta1);
        acumDerechaIzq = "";

        // Busqueda secuencial 
        String buscar = "Gato";
        ArrayList<String> animales = new ArrayList<String>();
        animales.add("Perro");
        animales.add("Ave");
        animales.add("Gato");
        animales.add("Raton");
        animales.add("Caballo");

        int resp = busquedaArrayList(animales, "VALORNOEXISTENTE", 0);
        System.out.println(buscar + " esta en la pos " + resp);

    }

    public static boolean palindromosRecursivo(String palabra, int i) {
        if (i < 0) {// caso base 
            return palabra.equals(acumDerechaIzq);
        } else {// caso recursivo 
            acumDerechaIzq += palabra.charAt(i);
            i--;
            return palindromosRecursivo(palabra, i);
        }// fin del if 

    }// fin del metodo 

    ///EJEMPLOS CLASE 
    public static int busquedaArrayList(ArrayList<String> lista, String elemento, int i) {
        if (i == lista.size()) { // caso base 
            return -1;
        } else {// caso recursivo 
            if (lista.get(i).equalsIgnoreCase(elemento)) { //caso base 2 
                //encontramos el elemento que buscamos 
                return i;
            } else {
                return busquedaArrayList(lista, elemento, i + 1);
            }
        }
//        if (i == lista.size()) { // caso base 
//            return -1;
//        } else if (lista.get(i).equalsIgnoreCase(elemento)) { //caso base 2 
//            return i;
//        } else {// caso recursivo 
//            return busquedaArrayList(lista, elemento, i + 1);
//        }

    }// fin del metodo 

}// fin de la clase
