# Variables
SRC=src
BIN=bin
MAIN=aplicacion.MetodoMontecarlo3

# Target para compilar el proyecto
all: compile

# Compilar los archivos .java
compile:
	mkdir -p $(BIN)
	javac -d $(BIN) $(SRC)/mates/Matematicas.java $(SRC)/aplicacion/MetodoMontecarlo3.java

# Ejecutar el programa con un número específico de tiros
run:
	java -cp $(BIN) $(MAIN)

# Ejecutar el programa con un número de tiros desde la línea de comandos
run_tiros:
	@read -p "Ingrese el número de tiros: " tiros; \
	java -cp $(BIN) $(MAIN) $$tiros

# Limpiar la carpeta bin/
clean:
	rm -rf $(BIN)/*

# Generar Javadoc
javadoc:
	javadoc -d doc $(SRC)/mates/Matematicas.java $(SRC)/aplicacion/MetodoMontecarlo3.java
