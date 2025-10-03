/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author Jorge Castiñeira Monroy
 */
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        
        String entrada = scanner.nextLine();
        
        if (entrada.length() == 4) {
            System.out.println("La primera cifra es: " + entrada.charAt(0));
            System.out.println("La segunda cifra es: " + entrada.charAt(1));
            System.out.println("La tercera cifra es: " + entrada.charAt(2));
            System.out.println("La cuarta cifra es: " + entrada.charAt(3));
        } else {
            System.out.println("Error: Debe introducir exactamente 4 caracteres.");
        }
        scanner.close();
    }
}
