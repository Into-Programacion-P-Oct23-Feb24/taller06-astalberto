/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el Nombre del propietario");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el valor del vehículo");
        double valorV = entrada.nextDouble();
        System.out.println("Ingrese el Tipo de vehículo");
        entrada.nextLine();
        String tipo = entrada.nextLine();
        double valorP = 0;
        
        switch (tipo) {

            case ("1"):
                valorP = (0.01 * valorV)/100 + 2;
                tipo = "Vehículo liviano particular";
                break;

            case ("2"):
                valorP = (0.02 * valorV)/100 + 2.5;
                tipo = "Vehículo grande particular";
                break;

            case ("3"):
                valorP = (0.04 * valorV)/100 + 1.5;
                tipo = "Taxi";
                break;

            case ("4"):
                valorP = (0.05 * valorV)/100 + 2.2;
                tipo = "Bus urbano";
                break;

            default:
                System.out.println("Tipo de vehículo no encontrado");

        }
        System.out.printf("Peaje 'Buena vía' Propietario: %s Tipo: %s Valor: %.2f"
                + " Peaje: %.2f\n", nombre, tipo, valorV, valorP);
    }

}
