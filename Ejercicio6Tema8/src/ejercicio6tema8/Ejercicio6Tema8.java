/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema8;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio6Tema8 {

    public static void main(String[] args) {
        //Creamos scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos empleados desea introducir? ");
        int numEmpleados = sc.nextInt();
        sc.nextLine();
        
        //Almacenamos la longitud del array en un método
        Empleado[] empleados = new Empleado[numEmpleados];
        
        //Vamos almacenando la información usando un búcle para 
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("\n- EMPLEADO " + (i + 1) + " -");

            System.out.print("Introduzca el nombre del empleado: ");
            String nombre = sc.nextLine();

            System.out.print("¿Cuántas horas trabajó este mes? ");
            int horas = sc.nextInt();

            System.out.print("¿Cuál es su tarifa por hora de trabajo? ");
            double tarifa = sc.nextDouble();
            sc.nextLine();

            empleados[i] = new Empleado(nombre, horas, tarifa);

            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON ÉXITO –");
        }

        System.out.println("\nSUELDO BRUTO DE LOS EMPLEADOS");

        for (Empleado e : empleados) {
            System.out.println(
                e.getNombre() + " trabajó " + e.getHorasTrabajadas() +
                " horas, cobra " + e.getTarifaHora() +
                " euros la hora por lo que le corresponde un sueldo de " +
                e.calcularSueldoBruto() + " euros."
            );
        }
        sc.close();
    }
}

