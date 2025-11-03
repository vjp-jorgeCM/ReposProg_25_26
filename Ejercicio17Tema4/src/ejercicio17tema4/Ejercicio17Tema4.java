/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema4;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio17Tema4 {

    // Método para generar una letra aleatoria entre 'a' y 'z'
    public static char generarLetraAleatoria() {
        int codigo = (int) (Math.random() * 26) + 97; // 97 = 'a'
        return (char) codigo;
    }

    // Método principal del juego
    public static void jugar() {
        Scanner entrada = new Scanner(System.in);
        char letraSecreta = generarLetraAleatoria();
        char intento;
        int intentos = 0;
        boolean acertado = false;

        System.out.println("Adivina la letra (entre 'a' y 'z'):");

        do {
            System.out.print("Introduce una letra: ");
            intento = entrada.nextLine().charAt(0);
            intentos++;

            if (intento == letraSecreta) {
                acertado = true;
                System.out.println("¡Correcto! La letra era '" + letraSecreta + "'.");
                System.out.println("Has necesitado " + intentos + " intentos.");
            } else if (intento < letraSecreta) {
                System.out.println("La letra que buscas está después en el alfabeto.");
            } else {
                System.out.println("La letra que buscas está antes en el alfabeto.");
            }

        } while (!acertado);

        entrada.close();
    }

    // Método main
    public static void main(String[] args) {
        jugar();
    }
}

