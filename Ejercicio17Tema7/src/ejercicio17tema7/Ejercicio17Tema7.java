/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio17Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el array principal que definirá la cantidad de vectores y llamamos a los métodos 
        int[] vector = new int[10];
        rellenarVector(vector);
        mostrarVector(vector);
        ordenarVector(vector);
        mostrarVector(vector);
        
    }
    
    public static void rellenarVector(int[] vector) {
        //Método para rellenar cada uno de los vectores con un número aleatorio
        int i;
        
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 9);
        }
    }
    
    public static void mostrarVector(int[] vector) {
        //Método que nos sirve para mostrar cada uno de los vectores que rellenamos con un número aleatorio
        int i;
        
        for (i = 0; i < vector.length; i++) {
            System.out.println("El valor de la posicion " + i + " es: " + vector[i]);
        }
    }
    
    public static void ordenarVector(int[] vector) {
        //Método que nos ayuda a ordenar los números usando el método burbuja y usando 3 variables para rellenar cada uno de los vectores de mayor a menor
        int i;
        int j;
        int aux;
        
        for (i = 0; i < vector.length - 1; i++) {
            for (j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j + 1] > vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }
}