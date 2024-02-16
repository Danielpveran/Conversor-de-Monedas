/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coversor.de.moneda;

import java.util.Scanner; // Agrega esta línea

/**
 *
 * @author Sandra Verano
 */
public class TallerCOnversorMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Opcion;
        Scanner scanner = new Scanner(System.in);
        
        double TasadeCambioD_P = 3909.13;
        
        System.out.println("Ingrese el valor en pesos Colombianos: ");
        double pesosColombianos = scanner.nextDouble();
        
        double dolaresEstadounidenses = pesosColombianos / TasadeCambioD_P;
        
        System.out.println(pesosColombianos + " equivaldrian a " + dolaresEstadounidenses + " en dolares");
        

    }
    
}