/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el primer número");
        double n1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo número");
        double n2 = entrada.nextDouble();
        entrada.nextLine();

        double total = 0;

        if (n1 > n2) {

            System.out.println("Ingrese la operacion a realizar ( +, -, *, / )");
            String operacion = entrada.nextLine().toLowerCase();

            switch (operacion) {

                case ("+"):
                case ("suma"):
                    total = n1 + n2;
                    break;

                case ("-"):
                case ("resta"):
                    total = n1 - n2;
                    break;

                case ("*"):
                case ("multiplicacion"):
                    total = n1 * n2;
                    break;

                case ("/"):
                case ("division"):
                    total = n1 / n2;
                    break;

                default:
                    System.out.println("Operacion no encontrada");

            }
            System.out.printf("El resultado de la operación es: %.2f\n",
                    total);

        } else {
            System.out.println("El primer numero ingresado es menor al segundo");
        }
    }

}
