package ejercicio02;

public class Tecnico extends Operario{
    /**
     * Constructor por defecto de la clase Tecnico
     */
    public Tecnico() {
    }

    /**
     * Constructor con parámetros de la clase Tecnico
     */
    public Tecnico(String nombre) {
        super(nombre);
    }

    /**
     * Método que especifica como se imprime un objeto de la clase
     * @return el nombre del empleado y el cargo
     */
    @Override
    public String toString() {
        return "Empleado: " + getNombre() + " -> Operario -> Tecnico";
    }
}
