/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16tema5;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private int nota;
    
    public Alumno(){
    this.nombre = "";
    this.nota = 0;
    
    }
    public Alumno(String nom, int not){
        this.nombre=nom;
        this.nota=not;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public boolean notaValida(){
        return nota >= 0 && nota <= 10;
    }

    public String getNota(){
        if(!notaValida()){
            System.out.println("Nota fuera de rango");
        }
        if(nota <= 4) return "Suspenso";
        if(nota >= 5) return "Bien";
        if(nota>=7) return "Muy bien";
        if(nota==10){
            return "Sobresaliente";
            } else {
            return "Introduce un número valido del 0 al 10!";
        }
    }
    
    public void mostrarDatos(){
      System.out.println("El nombre del alumno es: " + nombre);
      System.out.println("La nota del alumno es: " + nota);
      System.out.println("-------------------------------");
    }
}

    

