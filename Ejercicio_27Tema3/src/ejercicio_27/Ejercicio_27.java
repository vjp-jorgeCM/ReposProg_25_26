/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_27Tema4;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int opcion = 0;

        // Pedir los dos números
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();

        // Bucle principal del menú
        do {
            System.out.println("\n===== MENÚ DE OPERACIONES =====");
            System.out.println("1. Sumar los números");
            System.out.println("2. Restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                        break;
                    case 4:
                        try {
                            if (num2 == 0) {
                                throw new ArithmeticException("Error: División entre 0 no permitida.");
                            }
                            System.out.println("Resultado de la división: " + (num1 / num2));
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa... ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debes introducir un número entero.");
                scanner.next();
            }

        } while (opcion != 5);

        scanner.close();
    }
}
