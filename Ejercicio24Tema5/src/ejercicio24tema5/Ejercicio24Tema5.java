/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24Tema5;

/**
 *
 * @author Alejandro Miranda Cuadrado
 * @since 21/11/2025
 */
public class Ejercicio24Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de los objetos.
        ProductoFresco fresco = new ProductoFresco("06/02/2026", "C212", "05/03/2025", "Alemania");
        
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("05/04/2025", "F245", "ORG-2025-35");
                
        ProductoCongelado congelado = new ProductoCongelado("10/07/2027", "H534", -20);  
        
        //Asignacion de un método
        fresco.mostrarInformacion();
        System.out.println();
        refrigerado.mostrarInformacion();
        System.out.println("");
        congelado.mostrarInformacion();
        System.out.println();
        
    }
    
}
