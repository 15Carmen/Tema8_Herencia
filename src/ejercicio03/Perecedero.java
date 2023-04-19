package ejercicio03;

public class Perecedero extends Producto{
    //Declaramos los atributos de la clase

    /**
     * Atributo que guarda el número de días que tiene el producto para caducar
     */
    int diasCaducar;

    //Declaramos los constructores de la clase
    /**
     * Constructor por defecto de la clase Perecedero
     */
    public Perecedero() {

    }

    /**
     * Constructor con parámetros de la clase Perecedero
     * @param nombre
     * @param precio
     * @param diasCaducar
     */
    public Perecedero(String nombre, double precio, int diasCaducar) {
        super(nombre, precio);
        this.diasCaducar = diasCaducar;
    }

    //Declarmos los getter y setter de la clase


    public int getDiasCaducar() {
        return diasCaducar;
    }
    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }

    //Declaramos el método toString de la clase

    /**
     * Método que especifica como se imprime un objeto de la clase
     * @return el nombre del producto, su precio y el número de días que tiene para caducar
     */
    @Override
    public String toString() {
        return super.toString() + " Producto perecedero -> Días para caducar: " + diasCaducar;
    }

    @Override
    public double calcularPrecio(int cantidad) {
        double total = super.calcularPrecio(cantidad);

        switch (diasCaducar) {
            case 1 -> total = total * 0.15;
            case 2 -> total = total * 0.10;
            case 3 -> total = total * 0.05;
        }

        return total;
    }
}
