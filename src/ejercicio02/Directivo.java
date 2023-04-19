package ejercicio02;

public class Directivo extends Empleado{

    /**
     * Constructor con parámetros de la clase Directivo
     */
    public Directivo(String nombre) {
        super(nombre);
    }

    /**
     * Método que especifica como se imprime un objeto de la clase
     * @return el nombre del empleado y el cargo
     */
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }

}
