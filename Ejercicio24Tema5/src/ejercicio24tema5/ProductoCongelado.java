/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24Tema5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 21/11/2025
 */
public class ProductoCongelado extends Producto {
    private double temperatura;
    
    public ProductoCongelado(String caducidad, String lote, double temp) {
        super(caducidad, lote);
        this.temperatura = temp;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(double temp) {
        this.temperatura = temp;
    }
    
    
    public void mostrarInformacion() {
        System.out.println("Productor congelado");
        super.mostrarDatos();
        System.out.println("Temperatura recomendada: " + temperatura + " celsius");
    }
}
