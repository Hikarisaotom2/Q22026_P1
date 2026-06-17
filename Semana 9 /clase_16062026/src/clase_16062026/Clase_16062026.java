/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_16062026;

/**
 *
 * @author claudiacortes
 */
public class Clase_16062026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1.agregar de abajo hacia arriba 
        2. sacar de arriba hacia abajo
        3. Cada vez que llamamos un metodo, lo metemos en la caja 
        4. Cuando podemos hacer return, sacamos elementos de la caja 

        5. Nos enfocamos en una cosa a la vez 
         */

        int num = 100;
        int fac = factorial(num);
        System.out.println("El factorial de "+num+" es "+fac);
        
        /*
        Metodo recursivo que nos ayude a imprimir una lista. 
        lista = [1,2,3,4]
        imprimirLista(lista)
        
        */
        
//        int [] lista  = {1,2,3,4};
//        
//        imprimirLista(lista,0);
//        
    }
    
    public static void imprimirLista(int [] lista, int i){
         /*
                    1.agregar de abajo hacia arriba 
                    2. sacar de arriba hacia abajo
                    3. Cada vez que llamamos un metodo, lo metemos en la caja 
                    4. Cuando podemos hacer return, sacamos elementos de la caja 

                    5. Nos enfocamos en una cosa a la vez 
         */   
        if(i==lista.length){ // caso base 
            // paramos el ciclo...
        }else{// caso recursivo 
            System.out.println(lista[i]);
//             i ++;
//             i = i+1;
             i+=1;
            imprimirLista(lista, i);
        }
        
    }// fin del metodo 

    public static int factorial(int numero) {
        // Todo lo que esta dentro del metodo, es lo que se va a repetir. 
        if (numero == 1 || numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }// fin dle metodo 

}
