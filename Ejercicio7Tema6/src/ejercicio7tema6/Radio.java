/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7tema6;

/**
 *
 * @author Acid
 */
class Radio implements ControlRemoto {
    private boolean encendido;
    private float emisora;
    private int volumen;

    // Constructor
    public Radio() {
        this.encendido = false;
        this.emisora = 80.0f;
        this.volumen = 15;
    }

    // Get y Set del estado de encendido
    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean encendido) { this.encendido = encendido; }

    // Métodos propios de la clase
    public void mostrarInfo() {
        System.out.println("Radio:");
        System.out.println("Encendido: " + encendido);
        System.out.println("Emisora: " + emisora);
        System.out.println("Volumen: " + volumen);
        System.out.println("-----------------------");
    }

    // Implementación de la interfaz
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Radio encendida.");
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Radio apagada.");
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen -= 5;
            if (volumen < 0) volumen = 0;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen += 5;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float emisora) {
        if (encendido) {
            this.emisora = emisora;
            System.out.println("Emisora actual: " + this.emisora);
        }
    }
}
