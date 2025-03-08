package mates;

import java.util.function.LongFunction;
/**
 * Clase que proporciona métodos matemáticos.
 */
public class Matematicas {
    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo.
     * El parámetro `pasos` indica el número de puntos generados.
     *  @param pasos Número de puntos generados en la simulación.
     *  @return Aproximación del número PI.
     */
    public static double generarNumeroPiLambda(long pasos) {
        // Definimos funcion la cual coge un nuemro n y devuelva la aproximacion de PI
        LongFunction<Double> montecarloPi = (n) -> {
            // Contador de dardos dentro del circulo
            long dentro = 0;
            // Bucle donde generamos el nuemro de tiros de forma aleatoria
            for (long i = 0; i < n; i++) {
                double x = Math.random();
                double y = Math.random();
                // Comprobacion de si el punto generado esta dentro del area del circulo o esta fuera de este
                if (x * x + y * y <= 1) {
                    dentro++;
                }
            }

            return 4.0 * dentro / n;
        };
        return montecarloPi.apply(pasos);
    }
}
