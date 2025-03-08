package aplicacion;

import mates.Matematicas;

import java.util.Scanner;
/**
 * Programa que calcula una aproximación de PI usando el método de Montecarlo.
 */
public class MetodoMontecarlo3 {
    public static void main(String[] args) {
        long pasos;
        if (args.length > 0) {
            pasos = Long.parseLong(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de tiros para la simulación: ");
            pasos = scanner.nextLong();
            scanner.close();
        }
        System.out.println("El número PI es " + Matematicas.generarNumeroPiLambda(pasos));
    }
}
