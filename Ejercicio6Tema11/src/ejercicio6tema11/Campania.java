/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6tema11;

/**
 *
 * @author alumno
 */
import java.util.ArrayList;

public class Campania {
    //Array list y atributos
    private String nombre;
    private ArrayList<Donacion> donaciones;

    //Constructor
    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new ArrayList<>();
    }

    //Añadir donación ordenada de mayor a menor
    public void anadirDonacion(Donacion d) {
        int i = 0;

        // buscamos posición correcta
        while (i < donaciones.size() && donaciones.get(i).getCantidad() > d.getCantidad()) {
            i++;
        }

        donaciones.add(i, d); // inserta en orden
    }

    //Mostrar todas
    public void mostrarDonaciones() {
        for (Donacion d : donaciones) {
            System.out.println(d);
        }
    }

    //Mostrar por nombre
    public void mostrarPorNombre(String nombre) {
        for (Donacion d : donaciones) {
            if (d.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(d);
            }
        }
    }

    //Número de donaciones
    public int numeroDonaciones() {
        return donaciones.size();
    }

    //Total recaudado
    public double totalRecaudado() {
        double total = 0;
        for (Donacion d : donaciones) {
            total += d.getCantidad();
        }
        return total;
    }
}
