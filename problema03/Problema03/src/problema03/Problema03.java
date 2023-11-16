/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre del empleado");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        String tipo = entrada.nextLine();
        System.out.println("Ingrese el sueldo del empleado");
        double sueldo = entrada.nextDouble();
        double inSueldo = 0;
        double fSueldo = 0;
        
        switch (tipo) {

            case ("1"):
                inSueldo = (sueldo * 0.05);
                fSueldo = sueldo + inSueldo;
                break;

            case ("2"):
                inSueldo = (sueldo * 0.07);
                fSueldo = sueldo + inSueldo;
                break;

            case ("3"):
                inSueldo = (sueldo * 0.09);
                fSueldo = sueldo + inSueldo;
                break;

            case ("4"):
                inSueldo = (sueldo * 0.12);
                fSueldo = sueldo + inSueldo;
                break;

            default:
                inSueldo = (sueldo * 0.15);
                fSueldo = sueldo + inSueldo;
                break;

        }
        System.out.printf("El incremento de sueldo es: %.2f\n"
                + "Su nuevo sueldo es: %.2f\n", inSueldo, fSueldo);
    }

}
