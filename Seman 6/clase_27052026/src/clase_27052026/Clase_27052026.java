/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_27052026;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_27052026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] jugadoresE1 = new String[11];
        String[] jugadoresE2 = new String[11];
        System.out.println("EQUIPO #1");
        imprimirArreglo(jugadoresE1);
        System.out.println("EQUIPO #2");
        imprimirArreglo(jugadoresE2);

        // agregar jugadores al equipo
        System.out.println("INGRESRA JUGADOR AL EQUIPO 1");
        jugadoresE1 = agregarJugadoresAlEquipo(jugadoresE1);
        System.out.println("INGRESRA JUGADOR AL EQUIPO 2");
        jugadoresE2 = agregarJugadoresAlEquipo(jugadoresE2);

        System.out.println("EQUIPO #1");
        imprimirArreglo(jugadoresE1);
        System.out.println("EQUIPO #2");
        imprimirArreglo(jugadoresE2);
        
        
        System.out.println("BUSCAR JUGADORES");
        
        buscarJugadores(jugadoresE1, "Claudia cortes");

    }// fin del main

    public static void buscarJugadores(String[] listaJugadores, String nombre) {
        boolean encontro = false;
        for (int i = 0; i < listaJugadores.length; i++) {
            if (nombre.equalsIgnoreCase(listaJugadores[i])) {
                encontro = true;
                break;
            }
        }

        if (encontro) {
            System.out.println("Si existe");
        } else {
            System.out.println("No existe ");
        }

    }//fin del metodo

    //Metodos
    public static void imprimirArreglo(String[] listaJugadores) {
        for (int i = 0; i < listaJugadores.length; i++) {
            System.out.println(i + " ) " + listaJugadores[i]);
        }// fin del for 
    }// fin del metodo 

    public static String[] agregarJugadoresAlEquipo(String[] listaJugadores) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador nuevo ");
        String jugador = entrada.nextLine();

        /*
        Opcion A 
            preguntar en que pos vamos a guardar el valor 
        Opcion B
            asignar automaticamente a los jugadores en la siguiente pos disponible.
         */
        System.out.println("Ingrese la pos para agregar al jugador");
        // NOTA: Validar que la pos ingresada sea valida y no cause un outOfBounds
        int pos = entrada.nextInt();
        listaJugadores[pos] = jugador;

        return listaJugadores;

    }// fin del metodo 

}// fin de la clase
