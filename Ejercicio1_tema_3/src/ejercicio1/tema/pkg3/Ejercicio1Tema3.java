/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.tema.pkg3;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        
        int entrada = scanner.nextInt();
        
        if(entrada > 0) {
           System.out.println("El número es positivo!");
        }
        else {
            System.out.println("El número es negativo!");
        }
    }
    
}
