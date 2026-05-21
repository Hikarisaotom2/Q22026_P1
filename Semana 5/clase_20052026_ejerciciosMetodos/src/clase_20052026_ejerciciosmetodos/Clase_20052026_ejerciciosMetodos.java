/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_20052026_ejerciciosmetodos;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_20052026_ejerciciosMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            imprimirMenu();
            //leer los valores...
            int op = leerYValidar(0,900000000, "Ingrese una opcion del menu");
            switch (op) {
                case 1: // permutaciones 
                    calcularPermutaciones();
                    break;
                case 2: // valores comunes 
                    valoresComunes();
                  break;
                case 3: // triangulos
                    triangulo();
                    break;
                default: // salir 
                    continuar=false;
                    System.out.println("Adios.....");
                    break; 
            }// fin del switch 
            
        }// fin del while 
        
    }// fin del main 
    public static void triangulo(){
        int altura = leerYValidar(7,900000000, "Ingrese la altura del triangulo");
        System.out.println("El numero es "+altura);
    }
    
    public static void valoresComunes(){
        int valor1 = leerYValidar(0,12,"Ingrese el Valor1");
        int valor2 = leerYValidar(0,12,"Ingrese el Valor2");
        System.out.println("Los numeros son "+ valor1+" "+valor2);
    }
    public static void calcularPermutaciones(){
        int n = leerYValidar(0,900000000, "Ingrese el Valor1");
        int r = leerYValidar(0,900000000, "Ingrese el Valor2");
        
        int factorialN = 1;
        for (int i = 1; i <= n; i++) {
            factorialN*=i; 
        }
        
        int factorialR = 1;
        for (int i = 1; i <= n-r; i++) {
            factorialR*=i;
        }
        
        int resultado = factorialN/factorialR;
        
        System.out.println("El resultado es... "+resultado);
           
    }
    
    public static int leerYValidar(int valorInferior, int valorSuperior, String mensaje){
         Scanner entrada = new Scanner(System.in);
        int numero = 0;
            do {
                System.out.println(mensaje);
             numero = entrada.nextInt();
            } while (numero<=valorInferior|| numero>=valorSuperior);
        return numero;
    }
   
        
    public static void imprimirMenu(){
        System.out.println("_________MENU_________");
        System.out.println("1. Permutaciones");
        System.out.println("2. Valores comunes");
        System.out.println("3. Triangulos");
        System.out.println("4. Salir");
        
    }// fin del metodo
    
    
}
