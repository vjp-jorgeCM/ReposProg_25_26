/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema11;

/**
 *
 * @author alumno
 */

import java.util.Scanner;
public class Ejercicio6Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creamos un Scanner en el cual insertaremos la campaña
        Scanner sc = new Scanner(System.in);
        Campania campania = new Campania("Campaña COVID");

        int opcion;

        //Menu
        do {
            System.out.println("\n1. Añadir donación");
            System.out.println("2. Mostrar donaciones");
            System.out.println("3. Mostrar por nombre");
            System.out.println("4. Número de donaciones");
            System.out.println("5. Total recaudado");
            System.out.println("6. Donaciones ordenadas (ya lo están)");
            System.out.println("7. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cantidad: ");
                    double cantidad = sc.nextDouble();
                    sc.nextLine();

                    campania.anadirDonacion(new Donacion(nombre, cantidad));
                    break;

                case 2:
                    campania.mostrarDonaciones();
                    break;

                case 3:
                    System.out.print("Nombre a buscar: ");
                    String nom = sc.nextLine();
                    campania.mostrarPorNombre(nom);
                    break;

                case 4:
                    System.out.println("Número de donaciones: " + campania.numeroDonaciones());
                    break;

                case 5:
                    System.out.println("Total recaudado: " + campania.totalRecaudado() + "€");
                    break;

                case 6:
                    System.out.println("Las donaciones ya están ordenadas de mayor a menor.");
                    campania.mostrarDonaciones();
                    break;
            }

        } while (opcion != 7);
    }
}