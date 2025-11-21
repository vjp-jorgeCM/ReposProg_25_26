/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19tema5;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ejercicio19Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de los empleados con métodos.
        Empleado em1 = crearEmpleado();
        Empleado em2 = crearEmpleado();
        Empleado em3 = crearEmpleado();
        
        //Métodos para mostrar los datos introducidos por el usuario.
        mostrarSueldo(em1);
        mostrarSueldo(em2);
        mostrarSueldo(em3);
        
    }
    
    public static Empleado crearEmpleado() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre del empleado: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Horas trabajadas: ");
        int horas = entrada.nextInt();
        
        System.out.println("Tarifa por hora: ");
        double tarifa = entrada.nextDouble();
        entrada.nextLine();
        
        return new Empleado(nombre, horas, tarifa);
    }
    
    public static void mostrarSueldo(Empleado em) {
        em.mostrarDatos();
        System.out.println("------------------------------------------------");
    }
}
