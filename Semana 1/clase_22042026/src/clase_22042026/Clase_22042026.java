/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_22042026;

// importando la libreria 
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_22042026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un scanner
        // Case sensitive -> hace distincion entre maysuculas y minusculas. 
        Scanner entrada = new Scanner(System.in);
        
        // Leer un dato desde la consola. 
//        System.out.print("Ingrese una edad: ");
        System.out.println("Ingrese la calificacion 1");
        double nota1 = entrada.nextDouble();
        
        System.out.println("Ingrese la calificacion 2");
        double nota2 = entrada.nextDouble();
        System.out.println("Ingrese la calificacion 3");
        double nota3 = entrada.nextDouble();
        System.out.println("Ingrese la calificacion 4");
        double nota4 = entrada.nextDouble();
        double promedio = (nota1+nota2+nota3+nota4)/3;
        System.out.println("El promedio de las califiaciones es: "+promedio);
        
    }// fin del main

} //fin de la clase 
