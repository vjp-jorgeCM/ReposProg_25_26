/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24Tema5;

/**
 *
 * @author Jorge
 */
public class ProductoFresco extends Producto {
    //Atributos
    private String envasado;
    private String pais;
    
    //Constructor
    public ProductoFresco(String caducidad, String lot, String env, String pai) {
        super(caducidad, lot);
        this.envasado = env;
        this.pais = pai;
    }
    
    @Override
    public String getCaducidad() {
        return envasado;
    }
    
    public void setCaducidad(String cad) {
        this.caducidad = cad;
    }
    
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pai) {
        this.pais = pai;
    }
    

    public void mostrarInformacion() {
        System.out.println("Producto fresco");
        super.mostrarDatos();
        System.out.println("Fecha de envasado: " + envasado);
        System.out.println("Pais de origen: " + pais);
    }
}
