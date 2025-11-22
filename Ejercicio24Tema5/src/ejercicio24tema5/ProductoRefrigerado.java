/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24Tema5;

/**
 *
 * @author alumno
 */
public class ProductoRefrigerado extends Producto {
    private String organismo;
    
    
    public ProductoRefrigerado(String caducidad, String lote, String organismo) {
        super(caducidad, lote);
        this.organismo = organismo;
    }
    
    public String getOrganismo() {
        return organismo;
    }
    
    public void setOrganismo(String org) {
        this.organismo = org;
    }
    
    
    public void mostrarInformacion() {
        System.out.println("Producto refrigerado");
        super.mostrarDatos();
        System.out.println("Codigo organismo supervision: " + organismo);
    }
}
