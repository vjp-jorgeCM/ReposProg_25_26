/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author alumno
 */
public class Ejercicio15Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos las direcciones
        Direccion d1 = new Direccion("Calle San Anton", 2, 3, "Pamplona");
        Direccion d2 = new Direccion("Calle San Andreas" , 2, 3, "Madrid");
        Direccion d3 = new Direccion("Calle Polimonios" , 5, 7, "Valencia");
        
        //Creamos los empleados
        Empleado e1 = new Empleado("Jorge", 2232, d3);
        Empleado e2 = new Empleado("Alejandro", 2232, d3);
        Empleado e3 = new Empleado("Pablo", 2232, d1);
        
        //Mostramos los datos de los empleados y sus direcciones correspondientes
        e1.mostrarDatos();
        e2.mostrarDatos();
        e3.mostrarDatos();
    }
            
}
