/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema4;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

    public class Ejercicio14Tema4 {

    public static void main(String[] args) {
        int numero = pedirNumero(); // Método que pide y valida el número
        mostrarMultiplosDeTres(numero); // Método que hace los cálculos y muestra resultados
    }

    // Método para pedir un número al usuario
    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un número mayor que 0 y que sea multiplo de 3: ");
            num = sc.nextInt();
            if (!esMayorQueCero(num)) {
                System.out.println("Error: el número debe ser mayor que 0. Inténtalo de nuevo.");
            }
        } while (!esMayorQueCero(num));
        return num;
    }

    // Método para comprobar que el número es mayor que 0
    public static boolean esMayorQueCero(int n) {
        return n > 0;
    }

    // Método para mostrar los múltiplos de 3 y contar cuántos hay
    public static void mostrarMultiplosDeTres(int numero) {
        int contador = 0;
        System.out.println("\nMúltiplos de 3 entre 1 y " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }
        System.out.println("\n\nTotal de múltiplos de 3 mostrados: " + contador);
    }
}
