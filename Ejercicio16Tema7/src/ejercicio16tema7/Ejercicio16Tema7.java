/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema7;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio16Tema7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Arrays de alumnos y asignaturas
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};

        // Creamos el array de las notas
        double[][] notas = new double[6][4];
        int opcion;

        // Menú que se ejecuta hasta que el usuario decida salir del programa
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Rellenar las notas de los alumnos.");
            System.out.println("2. Mostrar las notas introducidas.");
            System.out.println("3. Alumno con mejor nota media.");
            System.out.println("4. Alumno con mayor cantidad de suspensos.");
            System.out.println("5. Asignatura más difícil.");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    rellenarNotas(entrada, alumnos, asignaturas, notas);
                    break;
                case 2:
                    mostrarNotas(alumnos, asignaturas, notas);
                    break;
                case 3:
                    alumnoMejorMedia(alumnos, notas);
                    break;
                case 4:
                    alumnoMasSuspensos(alumnos, notas);
                    break;
                case 5:
                    asignaturaMasDificil(asignaturas, notas);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 6);

        entrada.close();
    }

    // Método para rellenar notas
    public static void rellenarNotas(Scanner entrada, String[] alumnos, String[] asignaturas, double[][] notas) {
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.print("Nota de " + alumnos[i] + " en " + asignaturas[j] + ": ");
                notas[i][j] = entrada.nextDouble();
            }
        }
    }

    // Método para mostrar notas
    public static void mostrarNotas(String[] alumnos, String[] asignaturas, double[][] notas) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("\nAlumno: " + alumnos[i]);
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println(asignaturas[j] + ": " + notas[i][j]);
            }
        }
    }

    // Método para obtener el alumno con mejor media
    public static void alumnoMejorMedia(String[] alumnos, double[][] notas) {
        double mejorMedia = 0;
        int mejorAlumno = 0;
        for (int i = 0; i < alumnos.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double media = suma / notas[i].length;
            if (media > mejorMedia) {
                mejorMedia = media;
                mejorAlumno = i;
            }
        }
        System.out.println("El mejor alumno es " + alumnos[mejorAlumno] + " con una media de " + mejorMedia);
    }

    // Método para obtener el alumno con más suspensos
    public static void alumnoMasSuspensos(String[] alumnos, double[][] notas) {
        int maxSuspensos = 0;
        int alumnoSuspensos = 0;
        for (int i = 0; i < alumnos.length; i++) {
            int suspensos = 0;
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < 5) {
                    suspensos++;
                }
            }
            if (suspensos > maxSuspensos) {
                maxSuspensos = suspensos;
                alumnoSuspensos = i;
            }
        }
        System.out.println("El alumno que más ha suspendido es " + alumnos[alumnoSuspensos] + " con " + maxSuspensos + " suspensos.");
    }

    // Método para obtener la asignatura más difícil
    public static void asignaturaMasDificil(String[] asignaturas, double[][] notas) {
        double peorMedia = Double.MAX_VALUE;
        int peorAsignatura = 0;
        for (int j = 0; j < asignaturas.length; j++) {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            double media = suma / notas.length;
            if (media < peorMedia) {
                peorMedia = media;
                peorAsignatura = j;
            }
        }
        System.out.println("La asignatura más complicada es " + asignaturas[peorAsignatura] + " con una media de " + peorMedia);
    }
}
