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
     * Método que devuelve el nombre del empleado
     * @return el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna el nombre del empleado
     * @param nombre nombre que se le quiere asignar al empleado
     */
    public void setNombre(String nombre) {
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
