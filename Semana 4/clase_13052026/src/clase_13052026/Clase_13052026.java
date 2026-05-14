/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_13052026;

/**
 *
 * @author claudiacortes
 */
public class Clase_13052026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //For

        // Ejemplo de como simular un for con un while 
//       int x1 = 0;
//        while (x1<=7) {
//            System.out.println(x1);
//            x1++;
//        }
        for (int x = 0; x <= 3; x++) {
            System.out.println(x);
            //x++;
        }

        //Switch 
//       String dia = "Lunes";
//       
//        if (dia.equals("Lunes")) {
//            
//        }else if(dia.equals("Martes")){
//            
//        }else{
//            System.out.println("Valor invalido");
//        }
//        
//        int diaNumero = 2;
//        
//        if (diaNumero==1) {
//            System.out.println("Lunes");
//        }else if(diaNumero==2){
//            System.out.println("Martes");
//        }else{
//            System.out.println("Valor invalido");
//        }
        int diaSemana = 1;
        System.out.println("El dia de la semana es.....");
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes ");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
        //Rule switch 
        // no necesita el break, con esta forma del switch entramos unicamente a un caso 
        switch (diaSemana) {
            case 1->{
                    System.out.println("Lunes");
            }
            case 2->{
                System.out.println("Martes");
            }

        }
        

        int numeroParImpar = 0;

        switch (numeroParImpar) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
                System.out.println("Par");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Impar");
                break;
            default:
                System.out.println("Numero no valido");
        }
        
        /*
        Ahorcado....
            Leer desde la consola una palabra.... 
            contador de intentos: 5 vidas 
            vamos a ir preguntando a el usuario por una letra.
                -> si la letra existe en la palabra secreta ingresada, vamos a sustituirla en la cadena 
                -> si la letra no existe en la palabra, vamos a restar una vida. 
           el juego termina cuando nuestra vidas llegan a 0 o cuando adivinamos la palabra....
        
        ingrese una palabra: 
        gato
        cantidad de vidas: 5....
        La palabra oculta es: * * * *
        ingrese una letra: N 
        -> la letra no existe en la aplaabra secreta, perdio una vida...
        
        .
        cantidad de vidas: 4....
        La palabra oculta es: * * * *
        ingrese una letra: a
        -> La letra si existe en la palabra... felicidades... 
        
        cantidad de vidas: 4....
        La palabra oculta es: * a * *
         ingrese una letra: g
        -> La letra si existe en la palabra... felicidades... 
        
        cantidad de vidas: 4....
        La palabra oculta es: g a * *
        
        
        */

    }// fin del main

}// fin de la clase. 
