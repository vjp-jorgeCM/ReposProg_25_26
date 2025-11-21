/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author alumno
 */
public class Empleado {
    //Creamos los atributos
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Hacemos un constructor por defecto
    public Empleado(String n, int sal, Direccion dir){
        this.nombre = n;
        this.salario = sal;
        this.direccion = dir;
    }
    //Hacemos un constructores parametrizado
    public Empleado(String nombre, int salario, int numero, String calle, int piso, String ciudad){
        this.nombre="";
        this.salario=0;
        direccion = new Direccion(calle, numero, piso, ciudad);
    }
    
    //Getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public int getSalario(){
        return salario;
    }
    public void setSalario(int sala){
        this.salario = sala;
    }
    public Direccion getDireccion(){
        return direccion;
    }
    public void setDireccion(Direccion dir){
        this.direccion = dir;
}   //Creamos 
    public void mostrarDatos(){
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Direccion: " + direccion.mostrarDireccion());
        System.out.println("[-----------------------]");
    }
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", direccion=" + direccion + '}';
    }
    
}
