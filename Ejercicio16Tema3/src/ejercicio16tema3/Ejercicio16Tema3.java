/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;

        for (int i = 21; i < 160; i += 2) {
            System.out.println(i);
            contador++;
        }

        System.out.println("\nTotal de números impares impresos: " + contador);
    }
}

