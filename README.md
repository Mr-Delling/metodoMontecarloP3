# metodoMontecarloP3

Este programa calcula una aproximación del número Pi utilizando el método de Montecarlo con expresiones lambda en Java.

## Estructura del Proyecto

- `mates/Matematicas.java`: Contiene la lógica para la simulación de Montecarlo usando expresiones lambda.
- `aplicacion/MetodoMontecarlo3.java`: Programa principal que permite ingresar el número de tiros por línea de comandos o por teclado.
- `Makefile`: Facilita la compilación y ejecución del programa.
- `README.md`: Explicación del proyecto.

## Requisitos

- Make 

## Compilación y Ejecución

Para compilar el proyecto --> make
Para ejecutar el programa con un número de tiros específico --> make run_tiros
Para ejecutar el programa manualmente --> make run 
Para limpiar la carperta bin/ --> make clean
Para generar el javadoc --> make javadoc


## Explicación del Método Montecarlo

El método de Montecarlo se basa en generar puntos aleatorios en un cuadrado y calcular la proporción que cae dentro de un círculo inscrito. 
La aproximación de Pi se obtiene con la fórmula:

\[ \pi \approx 4 \times \frac{\text{puntos dentro del círculo}}{\text{puntos totales}} \]

## Diagrama UML para PlantUML (solo con los paquetes y las clases)

@startuml
package "metodoMontecarloPractica3" {
    package "Practica3" {
        package "src" {
            package "aplicacion" {
                class MetodoMontecarlo3 {
                    + main(String[] args): void
                }
            }
            package "mates" {
                class Matematicas {
                    + generarNumeroPiIterativo(long pasos): double
                }
            }
        }
    }
}

MetodoMontecarlo3 --> Matematicas : "Usa"
@enduml
## Diagrama UML general 

metodoMontecarloPractica3/
|--> Practica3/
|       |--> .idea/
|       |--> out/
|       |--> bin/
|       |--> src/
|       |       |--> aplicacion
|       |       |       |--> MetodoMontecarlo3.java
|       |       |--> mates
|       |       |       |-->Matematicas.java
|       |--> .gitignore
|       |--> Makefile
|--> LICENSE
|--> README.ms


## Autor
Alejandro Santamaria

