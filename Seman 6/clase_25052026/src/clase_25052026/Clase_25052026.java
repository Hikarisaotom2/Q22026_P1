/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_25052026;

/**
 *
 * @author claudiacortes
 */
public class Clase_25052026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Contains 
        String cadena = "como estas coco";
        String resultado = WordReplace(cadena, "mo", "zapato");
        System.out.println("Cadena original "+ cadena);
        System.out.println("la cadena con replace "+resultado);
    }// fin del main

    public static boolean contains(String cadena, String buscar) {
        boolean encontramos = false;
        for (int i = 0; i < cadena.length() - buscar.length(); i++) {
            String subCadena = cadena.substring(i, i + buscar.length());
            if (subCadena.equalsIgnoreCase(buscar)) {
                encontramos = true;
                break;
            }

        }// fin del for 

        return encontramos;

    }

    public static String WordReplace(String cadena, String search, String replace) {
        boolean existe = contains(cadena, search);
        String cadenaNueva = "";
        if (existe) {
            //vamos a reemplazar
            for (int i = 0; i < cadena.length() - search.length(); i++) {
                String subCadena = cadena.substring(i, i + search.length());
                if (subCadena.equalsIgnoreCase(search)) {
                    int pos = i;
                    String cadena1 = cadena.substring(0, i);
                    String cadena2 = cadena.substring(i + search.length(), cadena.length());
                    cadenaNueva = cadena1 + replace + cadena2;
                    break;
                }

            }// fin del for 
            
            return cadenaNueva;
        }
        return "";
    }

}// fin de la clase
