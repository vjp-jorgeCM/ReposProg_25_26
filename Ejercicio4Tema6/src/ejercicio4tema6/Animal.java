/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4tema6;

/**
 *
 * @author Acid
 */
abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters
    public String getNombre(){ 
        return nombre; 
}
    public int getEdad(){ 
        return edad; 
}
    public double getPeso(){ 
        return peso; 
}

    // Setters
    public void setNombre(String nombre){ 
        this.nombre = nombre; 
}
    public void setEdad(int edad){ 
        this.edad = edad; 
}
    public void setPeso(double peso){ 
        this.peso = peso; 
}

    // Métodos abstractos
    public abstract void sonido();
    public abstract void alimentacion();
    public abstract void habitat();
    public abstract void nombreCientifico();

    // Método para mostrar datos generales
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
    }
}
