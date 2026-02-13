/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema9;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio9Tema9 {

    public static void main(String[] args) {
        //Creamos el scanner que el usuario rellenará para insertar el usuario y la contraseña para luego pasarlo a un if que nos ayudará a comprobar si la contraseña y el usuario cumple los criterios
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (verificarContrasena(usuario, contrasena)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida.");
        }

        scanner.close();
    }

    public static boolean verificarContrasena(String usuario, String contrasena) {

        //Verificar que tenga al menos 6 caracteres
        if (contrasena.length() < 6) {
            System.out.println("Error: La contraseña debe tener al menos 6 caracteres.");
            return false;
        }

        //Verificar que tenga al menos 2 dígitos
        int contadorDigitos = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isDigit(contrasena.charAt(i))) {
                contadorDigitos++;
            }
        }

        if (contadorDigitos < 2) {
            System.out.println("Error: La contraseña debe contener al menos 2 dígitos.");
            return false;
        }

        //Verificar que el usuario no forme parte de la contraseña
        if (contrasena.contains(usuario)) {
            System.out.println("Error: La contraseña no puede contener el nombre de usuario.");
            return false;
        }

        return true;
    }
}

