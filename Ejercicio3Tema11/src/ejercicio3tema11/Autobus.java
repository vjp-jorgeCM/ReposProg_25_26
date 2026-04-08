/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3tema11;

/**
 *
 * @author alumno
 */
import java.util.HashMap;

public class Autobus {
    private String matricula;
    private HashMap<String, Conductor> conductores;

    //Constructor
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }

    //Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void agregarConductor(Conductor c) {
        conductores.put(c.getDni(), c);
    }

    public HashMap<String, Conductor> getConductores() {
        return conductores;
    }

    public int numeroConductores() {
        return conductores.size();
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nConductores: " + conductores.values();
    }
}
