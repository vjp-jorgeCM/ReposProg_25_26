/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19tema5;

/**
 *
 * @author Jorge
 *
 */
public class Empleado {
    
    //Atributos
    private final String nombre;
    private final int numhoras;
    private final double tarifa;
    
    //Constructor del empleado (no he usado un constructor por defecto porque en elo ejercicio pide que el usuario introduzca los datos).
    public Empleado(String nom, int ho, double ta) {
        this.nombre = nom;
        this.numhoras = ho;
        this.tarifa = ta;
    }
    
    //Método para calcular el sueldo bruto.
    public double calcularSueldo() {
        if (numhoras <= 40) {
            return numhoras * tarifa;
        }
        else {
            int horasNormales = 40;
            int horasExtra = numhoras - 40;
            return (horasNormales * tarifa) + (horasExtra * tarifa * 1.5);
        }
    }
    
    //Método para mostrar los datos.
    public void mostrarDatos() {
        
        System.out.println(nombre + " trabajo " + numhoras + " horas, cobra " + + tarifa + " euros/hora, por lo que le corresponde un sueldo de " + calcularSueldo() + " euros.");
    }
}

