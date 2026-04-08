/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3tema11;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio3Tema11 {
    //Creamos un Array
    static Autobus[] darsenas = new Autobus[6];
    static Scanner sc = new Scanner(System.in);

    //Menu
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n1. Aparcar autobús");
            System.out.println("2. Mostrar dársenas libres");
            System.out.println("3. Buscar autobús");
            System.out.println("4. Buscar conductor");
            System.out.println("5. Autobús con más conductores");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> aparcar();
                case 2 -> mostrarLibres();
                case 3 -> buscarAutobus();
                case 4 -> buscarConductor();
                case 5 -> maxConductores();
            }

        } while (opcion != 0);
    }

    //Aparcar
    public static void aparcar() {
        int pos;
        do {
            System.out.print("Posición (0-5): ");
            pos = sc.nextInt();
        } while (pos < 0 || pos >= 6 || darsenas[pos] != null);

        sc.nextLine(); // limpiar buffer
        System.out.print("Matrícula: ");
        String mat = sc.nextLine();

        Autobus bus = new Autobus(mat);

        // añadir conductores
        String seguir;
        do {
            System.out.print("DNI conductor: ");
            String dni = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            bus.agregarConductor(new Conductor(dni, nombre));

            System.out.print("¿Añadir otro? (s/n): ");
            seguir = sc.nextLine();

        } while (seguir.equalsIgnoreCase("s"));

        darsenas[pos] = bus;
    }

    //Mostrar libres
    public static void mostrarLibres() {
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) {
                System.out.println("Dársena libre: " + i);
            }
        }
    }

    //Buscar autobús
    public static void buscarAutobus() {
        sc.nextLine();
        System.out.print("Matrícula: ");
        String mat = sc.nextLine();

        for (Autobus a : darsenas) {
            if (a != null && a.getMatricula().equalsIgnoreCase(mat)) {
                System.out.println(a);
                return;
            }
        }

        System.out.println("No encontrado");
    }

    //Buscar conductor
    public static void buscarConductor() {
        sc.nextLine();
        System.out.print("DNI: ");
        String dni = sc.nextLine();

        for (Autobus a : darsenas) {
            if (a != null && a.getConductores().containsKey(dni)) {
                System.out.println("El conductor está en el autobús: " + a.getMatricula());
                return;
            }
        }

        System.out.println("Conductor no encontrado");
    }

    //Autobús con más conductores
    public static void maxConductores() {
        int max = -1;
        int pos = -1;

        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] != null) {
                int num = darsenas[i].numeroConductores();
                if (num > max) {
                    max = num;
                    pos = i;
                }
            }
        }

        if (pos != -1) {
            System.out.println("Mayor número de conductores en posición: " + pos);
        } else {
            System.out.println("No hay autobuses");
        }
    }
}
