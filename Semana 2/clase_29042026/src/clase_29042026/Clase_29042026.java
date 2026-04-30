/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_29042026;

/**
 *
 * @author claudiacortes
 */
public class Clase_29042026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1) por defecto se utiliza el orden secuencial 
        System.out.println("Primera linea");
        System.out.println("Segunda linea");

        //2)  Decisciones 
        int edad = 18;
        if (edad == 18) {
            System.out.println("Tienes 18 años");
        }

        if (edad >= 18) {
            System.out.println("Mayor de eedad");
        } else {
            System.out.println("Menor de edad");
        }

        if (edad == 18) {
            System.out.println("Tienes 18!");
        } else if (edad < 18) {
            System.out.println("Tienes menos de 18 ");
        } else if (edad > 18) {
            System.out.println("Tienes mas de 18");
        } else {
            System.out.println("Edad no valida ");
        }

//        3) ciclos 
//            3.1 controlados por logica
        boolean valor = true && false;
        while (valor) {
            System.out.println("Hola mundo");
            System.out.println("Intrudccion2");
            System.out.println("6");
        }
        
        
        
      
        
        
        

    }// fin del main 

}// fin de la clase 
