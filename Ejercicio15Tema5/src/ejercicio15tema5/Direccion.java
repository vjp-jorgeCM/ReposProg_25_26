/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author alumno
 */
public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    
    //Constructores
    
    public Direccion(){
        this.calle = "";
        this.numero = 0;
        this.piso = 0;
        this.ciudad = "";
    }
    
    public Direccion(String cal, int num, int pi, String ciud){
        this.calle = cal;
        this.numero = num;
        this.piso = pi;
        this.ciudad = ciud;
    }
    public String getCalle(){
        return calle;
    }
    
    public void setCalle(String cal){
        calle = cal;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int num){
        numero = num;
    }
    public int getPiso(){
        return piso;
    }
    public void setPiso(int pi){
        piso = pi;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciud){
        ciudad = ciud;
    }
    
    public String mostrarDireccion(){
        return calle + "Nº " + numero + "Nº " + piso + " " + ciudad; 
    }
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", ciudad=" + ciudad + '}';
    }
    
}
