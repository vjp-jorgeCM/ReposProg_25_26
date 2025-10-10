/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema3;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio9Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();
        System.out.print("Introduce el cuarto número: ");
        int num4 = scanner.nextInt();

        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num1 > num4) {
            temp = num1;
            num1 = num4;
            num4 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num2 > num4) {
            temp = num2;
            num2 = num4;
            num4 = temp;
        }

        if (num3 > num4) {
            temp = num3;
            num3 = num4;
            num4 = temp;
        }

        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
    }
    
}
