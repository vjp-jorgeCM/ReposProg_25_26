/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10tema7;

/**
 *
 * @author Acid
 */
public class Ejercicio10Tema7 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int[] vector = new int[10]; //Creamos un vector de 10 casillas

        rellenarVector(vector); //Llamamos al metodo que nos rellena los vectores
        System.out.print("Se han generado los siguientes números: ");
        mostrarVector(vector); //Llamamos al método que enseña los números generados inicialmente

        sustituirRepetidosPorCero(vector); //Llamamos al método que sustituye los números repetidos por 0
        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        mostrarVector(vector);
    }

    // Método para rellenar el vector con números aleatorios entre 1 y 8
    public static void rellenarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random() * 8) + 1;
        }
    }

    // Método para mostrar el vector
    public static void mostrarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    // Método para sustituir los valores repetidos por 0
    public static void sustituirRepetidosPorCero(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    v[j] = 0;
                }
            }
        }
    }
}
