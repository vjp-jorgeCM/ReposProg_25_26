/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4tema6;

/**
 *
 * @author Acid
 */

class Perro extends Canido {
    public Perro(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    @Override
    public void sonido() {
        System.out.println(getNombre() + "Ladra");
    }

    @Override
    public void alimentacion() {
        System.out.println("Alimentacion: Carnivora");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Domestico");
    }

    @Override
    public void nombreCientifico() {
        System.out.println("Nombre cientifico: Canis lupus familiaris");
    }
}