/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Basededatos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Basededatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner( System.in);
        System.out.println("Escribe tu nombre");
        String nombre = lectura.nextLine();
        System.out.println("Escribe tu edad");
        int edad = lectura.nextInt();
        
        System.out.println("Hola " + nombre + " ericktu edad es: " + edad);
        
    }
    
}
