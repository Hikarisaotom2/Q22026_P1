/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_11062026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_11062026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Arreglos*/
 /*
        RNP 
        -> agregar personas 
        -> listarlas 
        -> eliminar personas de una lista 
        -> Buscar 
        -> MOstrar detalles de persona: 
            -> Nombre 
            -> id 
            -> Ciudad 
         */

        ArrayList<String> personas = new ArrayList<String>();
        personas.add("123-Claudia Cortes-TGU");
        personas.add("124-Claudia Pavon-SPS");
        personas.add("125-Juan Perez-LCB");

        while (true) {
//            personas = agregarPersonas(personas);
             imprimirArreglo(personas);
             personas= eliminarPersonas(personas);
//            buscarPersonas(personas);
//            imprimirDetalle(personas);
            
        }

    }// fin del main 


    

    public static ArrayList<String> agregarPersonas(ArrayList<String> personas) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombrePersona = entrada.nextLine();
        System.out.println("Ciudad ");
        String ciudad = entrada.nextLine();
        System.out.println("Numero de ID");
        int id = entrada.nextInt();

        personas.add(id + "-" + nombrePersona + "-"+ciudad);

        return personas;
    }// fin del metodo

    public static void imprimirArreglo(ArrayList<String> personas) {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(i + ") " + personas.get(i));
        }
        System.out.println("");
    }// fin del metodo 

    public static void buscarPersonas(ArrayList<String> personas) {
        // Busqueda lineal 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Desea buscar por: ");
        System.out.println("1. nombre ");
        System.out.println("2. id");
        int resp = entrada.nextInt();
        if (resp == 1) {
            System.out.println("Ingrese el nombre a buscar: ");
            String nombre = entrada.nextLine();
            boolean encontro = false;
            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).contains(nombre)) {
                    System.out.println("Valor encontrado en la pos " + i);
                    encontro = true;
                    break;
                }

            }
            if (!encontro) {
                System.out.println("No se encontro");
            }
        } else {
            System.out.println("Ingrese el id a buscar");
            int id = entrada.nextInt();
            boolean encontro = false;
            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).contains(id + "")) {
                    System.out.println("Valor encontrado en la pos " + i);
                    encontro = true;
                    break;
                }

            }
            if (!encontro) {
                System.out.println("No se encontro");
            }
        }

    }// fin del metodo

    public static void imprimirDetalle(ArrayList<String> personas){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la pos de la persona: ");
        int pos = entrada.nextInt();
        String datosString = personas.get(pos);
        String []datos = datosString.split("-");
        String id = datos[0];
        String nombre = datos[1];
        String ciudad = datos[2];
        
        System.out.println("=> Nombre: "+nombre);
        System.out.println("=> ID: "+id);
        System.out.println("=>Ciudad: "+ciudad);
        
        
    }
    
    public static  ArrayList<String> eliminarPersonas(ArrayList<String> personas){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la pos de la persona a eliminar: ");
        int pos = entrada.nextInt();
        personas.remove(pos);
        
        return personas;
    }
}// fin de la clase
