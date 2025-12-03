/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7tema6;

/**
 *
 * @author Acid
 */
public class Televisor {
    private boolean encendido;
    private int canal;
    private int volumen;

    // Constructor
    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }

    // Get y Set del estado de encendido
    public boolean isEncendido(){ 
        return encendido; 
    }
    public void setEncendido(boolean encendido){ 
        this.encendido = encendido; 
    }

    // Métodos propios de la clase
    
    public void mostrarInfo() {
        System.out.println("Televisor:");
        System.out.println("Encendido: " + encendido);
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("-----------------------");
    }

    // Implementación de la interfaz
    
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Televisor encendido. Canal actual: " + canal);
        }
    }

    
    public void apagar() {
        if (encendido) {
            System.out.println("La TV se apagará en 10s");
            encendido = false;
        }
    }

    
    public void bajarVolumen() {
        if (encendido) {
            if (volumen > 0) volumen--;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    
    public void subirVolumen() {
        if (encendido) {
            volumen++;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = (int) canal;
            System.out.println("Canal actual: " + this.canal);
        }
    }
}
