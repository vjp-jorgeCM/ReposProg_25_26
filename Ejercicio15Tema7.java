/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema7;

/**
 *
 * @author Acid
 */
import java.util.Scanner;
public class Ejercicio15Tema7 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ventas = new int[12]; //Creamos un array de 12 vectores
        String[] meses = { //Creamos un array con todos los meses del año
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int opcion;
        boolean ventasRellenas = false;

        do { //Usamos do while para crear un menu que se repita hasta que el usuario escriba correctamente una de las opciones o escriba la opción 7 que está asignada a salir
            System.out.println("\nMENÚ");
            System.out.println("1. Rellenar ventas mensuales");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al revés");
            System.out.println("4. Mostrar suma total de ventas");
            System.out.println("5. Mostrar ventas de meses pares");
            System.out.println("6. Mostrar mes con más ventas");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    rellenarVentas(ventas);
                    ventasRellenas = true;
                    System.out.println("Ventas generadas correctamente.");
                    break;

                case 2:
                    if (ventasRellenas)
                        mostrarVentas(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 3:
                    if (ventasRellenas)
                        mostrarVentasReves(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 4:
                    if (ventasRellenas)
                        System.out.println("Total de ventas del año: " + sumaVentas(ventas));
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 5:
                    if (ventasRellenas)
                        mostrarVentasMesesPares(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 6:
                    if (ventasRellenas)
                        mostrarMesMayorVenta(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 7);

        sc.close();
    }

    // 1. Rellenar ventas con valores aleatorios entre 10 y 100
    public static void rellenarVentas(int[] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int)(Math.random() * 91) + 10;
        }
    }

    // 2. Mostrar ventas
    public static void mostrarVentas(int[] ventas, String[] meses) {
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }

    // 3. Mostrar ventas al revés
    public static void mostrarVentasReves(int[] ventas, String[] meses) {
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }

    // 4. Suma total de ventas
    public static int sumaVentas(int[] ventas) {
        int suma = 0;
        for (int v : ventas) {
            suma += v;
        }
        return suma;
    }

    // 5. Ventas de meses pares
    public static void mostrarVentasMesesPares(int[] ventas, String[] meses) {
        for (int i = 1; i < ventas.length; i += 2) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }

    // 6. Mes con más ventas
    public static void mostrarMesMayorVenta(int[] ventas, String[] meses) {
        int max = ventas[0];
        int pos = 0;

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > max) {
                max = ventas[i];
                pos = i;
            }
        }

        System.out.println("El mes con más ventas es " + meses[pos] + " con " + max + " coches."); //Muestra el mes con más ventas
    }
}

