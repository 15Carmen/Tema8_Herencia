package ejercicio03;

public class NoPerecedero extends Producto{
    //Declaramos los atributos de la clase

    /**
     * Atributo que guarda el tipo de producto
     */
    private String tipo;

    //Declaramos los constructores de la clase
    /**
     * Constructor por defecto de la clase NoPerecedero
     */
    public NoPerecedero() {

    }

    /**
     * Constructor con parámetros de la clase NoPerecedero
     * @param nombre
     * @param precio
     * @param tipo
     */
    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    //Declarmos los getter y setter de la clase
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Declaramos el método toString de la clase

    /**
     * Método que especifica como se imprime un objeto de la clase
     * @return el nombre del producto, su precio y el tipo de producto
     */
    @Override
    public String toString() {
        return super.toString() + " Producto no perecedero -> Tipo: " + tipo;
    }
}
