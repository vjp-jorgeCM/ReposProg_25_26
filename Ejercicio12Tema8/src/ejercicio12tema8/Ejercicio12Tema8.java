/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12tema8;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio12Tema8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---- PARTE 1: Crear dos objetos ----
        Mueble mueble1 = new Mueble(); // constructor por defecto
        Mueble mueble2 = new Mueble(150, "Mesa de comedor"); // constructor parametrizado

        // Cambiar descripción usando setters
        mueble1.setDescripcion("Silla de oficina");
        mueble1.setPrecio(75);

        // Mostrar información
        System.out.println("INFORMACIÓN DE LOS MUEBLES");
        mueble1.mostrarInfo();
        mueble2.mostrarInfo();

        // ---- PARTE 2: Vector de muebles ----
        Mueble[] muebles = new Mueble[4];

        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Rellenar muebles");
            System.out.println("2. Mostrar muebles");
            System.out.println("3. Mostrar muebles por precio");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    for (int i = 0; i < muebles.length; i++) {
                        System.out.println("\nMUEBLE " + (i + 1));

                        System.out.print("Descripción: ");
                        String descripcion = sc.nextLine();

                        System.out.print("Precio: ");
                        double precio = sc.nextDouble();
                        sc.nextLine();

                        muebles[i] = new Mueble(precio, descripcion);
                    }
                    System.out.println("Muebles rellenados correctamente.");
                    break;

                case 2:
                    System.out.println("\nLISTADO DE MUEBLES");
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null) {
                            muebles[i].mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nIntroduce el precio máximo: ");
                    double precioMax = sc.nextDouble();

                    System.out.println("Muebles con precio igual o menor a " + precioMax + " euros:");
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null && muebles[i].getPrecio() <= precioMax) {
                            muebles[i].mostrarInfo();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

