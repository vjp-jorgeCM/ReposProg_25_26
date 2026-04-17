/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escaperoom;

/**
 *
 * @author alumno
 */

import java.io.*;
import java.util.*;

public class Escaperoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables de rutas relativas
        String archivoEntrada = "C:\\Users\\alumno\\Documents\\Proyectos_java\\Escaperoom\\src\\ficherosescaperoom\\datos_empleados.txt";
        String archivoSalida = "C:\\Users\\alumno\\Documents\\Proyectos_java\\Escaperoom\\src\\ficherosescaperoom\\sospechosos_zona_cero.txt";

        int contador = 0;

        // Filtros
        try (
            BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))
        ) {

            String linea;
            
            br.readLine();

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String telefono = datos[1];
                String ubicacion = datos[2];
                String rol = datos[3];

                if (ubicacion.equals("Zona Cero")) {
                    bw.write(nombre + ";" + telefono + ";" + ubicacion + ";" + rol);
                    bw.newLine();
                    contador++;
                }
            }

            System.out.println("Archivo creado correctamente");
            System.out.println("Empleados en Zona Cero: " + contador);

        } catch (IOException e) {
            System.out.println("Error en el sistema: " + e.getMessage());
        }
    }
}



examenED instance = new examenED();

