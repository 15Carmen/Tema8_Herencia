package ejercicio02;

public class Oficial extends Operario{
    /**
     * Constructor por defecto de la clase Oficial
     */
    public Oficial() {
    }

    /**
     * Constructor con parámetros de la clase Oficial
     */
    public Oficial(String nombre) {
        super(nombre);
    }

    /**
     * Método que especifica como se imprime un objeto de la clase
     * @return el nombre del empleado y el cargo
     */
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
