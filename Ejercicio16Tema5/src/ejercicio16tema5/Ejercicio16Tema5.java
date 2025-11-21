/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema5;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio16Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Alumno alumno1 = crearAlumno();
         Alumno alumno2 = crearAlumno();
         Alumno alumno3 = crearAlumno();
        
        mostrarAlumno(alumno1);
        mostrarAlumno(alumno2);
        mostrarAlumno(alumno3);
    }
    public static Alumno crearAlumno(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del Alumno ");
        
        String alumno = sc.nextLine();
        
        System.out.println("Introduce la nota del Alumno: ");
        
        int nota = sc.nextInt();
        
        sc.nextLine();
        
        return new Alumno(alumno,nota);
        
    }
    public static void mostrarAlumno(Alumno alumno){
        alumno.mostrarDatos();
    }
    
}
