/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema3;

/**
 *
 * @author alumno
 */

import java.util.Scanner;
import javax.swing.UIDefaults;

public class Ejercicio6Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca una nota: ");
        
        int entrada = scanner.nextInt();
                 
            switch (entrada) {
                case 0,1, 2, 3, 4:
                    System.out.println("¡Es un suspenso!");
                    break;
                case 5, 6, 7, 8, 9, 10:
                    System.out.println("¡Es un aprobado!");
                    break;
                default:
                    System.out.println("Solo se permiten números del 0 al 10!");
                    break;
            }
        }   
    }
