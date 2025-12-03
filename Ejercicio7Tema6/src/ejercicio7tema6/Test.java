/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7tema6;

/**
 *
 * @author Acid
 */
public class Test {
    
    public static void main(String[] args) {
        // Prueba con Televisor
        Televisor tv = new Televisor();
        tv.encender();
        tv.mostrarInfo();
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        System.out.println("Volumen después de subir 3 veces: " + tv.isEncendido());
        tv.cambiarCanal(5);
        tv.bajarVolumen();
        tv.apagar();
        tv.mostrarInfo();

        // Prueba con Radio
        Radio radio = new Radio();
        radio.encender();
        radio.mostrarInfo();
        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();
        System.out.println("Volumen después de subir 3 veces: " + radio.isEncendido());
        radio.cambiarCanal(95.5f);
        radio.bajarVolumen();
        radio.apagar();
        radio.mostrarInfo();
    }
}
