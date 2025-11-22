/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24Tema5;

/**
 *
 * @author Jorge
 */
public class Producto {
    
    //Atributos
    protected String caducidad;
    protected String lote;
    
    //Constructor 
    public Producto(String cad, String lot) {
        this.caducidad = cad;
        this.lote = lot;
    }
    
    public String getCaducidad() {
        return caducidad;
    }
    
    public void setCaducida(String caducidad) {
    this.caducidad = caducidad;
    }
    
    public String getLote() {
        return lote;
    }
    
    public void setLote(String lote) {
        this.lote = lote;
    }
    //Mostramos los datos
    public void mostrarDatos() {
        System.out.println("Fecha de caducidad: " + caducidad);
        System.out.println("Numero de lote: " + lote);
    }
}
