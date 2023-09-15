/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basededatos;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Calculadorademonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        System.out.println(" ingrese cantidad");
        Double cantidad = calculadora.nextDouble();
        
        double euro = cantidad /18.21;
        double dolar = cantidad / 17.07;
        double yen = cantidad / 0.12;
        double libra = cantidad / 21.18;
        
        System.out.println(" la cantidad en euros " + euro);
        System.out.println(" la cantidad en dolar " + dolar);
        System.out.println(" la cantidad en yen " + yen);
        System.out.println(" la cantidad en libra " + libra);
       
        

        

               
                
        }
        

    }
    

