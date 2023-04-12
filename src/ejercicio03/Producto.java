package ejercicio03;

public class Producto {
    //Declaramos los atributos de la clase

    /**
     * Atributo que guarda el nombre del producto
     */
    private String nombre;
    /**
     * Atributo que guarda el precio del producto
     */
    private double precio;

    //Declaramos los constructores de la clase
    /**
     * Constructor por defecto de la clase Producto
     */
    public Producto() {

    }

    /**
     * Constructor con parámetros de la clase Producto
     * @param nombre
     * @param precio
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Declarmos los getter y setter de la clase


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Declaramos el método toString de la clase

    /**
     * Método que especifica como se imprime un objeto de la clase
     * @return el nombre del producto y su precio
     */
    @Override
    public String toString() {
        return "Producto: " + nombre + " Precio: " + precio;
    }
}
