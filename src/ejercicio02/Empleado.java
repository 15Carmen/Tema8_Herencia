package ejercicio02;

public class Empleado {
    /**
     * Atributo que almacena el nombre del empleado
     */
    private String nombre;

    /**
     * Constructor por defecto
     */
    public Empleado() {
    }

    /**
     * Constructor con parámetros
     * @param nombre Nombre del empleado
     */
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Métodoo que especifica como se imprime un objeto de la clase
     * @return el nombre del empleado
     */
    @Override
    public String toString() {
        return "Empleado: " + nombre;
    }
}
