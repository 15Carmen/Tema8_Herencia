package ejercicio04;

public class Television extends Electrodomestico{
    // Declaramos los atributos de la clase

    /**
     * Atributo que guarda el tamaño de la pantalla en pulgadas
     */
    private double resolucion;

    /**
     * Atributo que guarda si la television tiene TDT o no
     */
    private boolean sintonizador;

    // Declaramos los constructores

    /**
     * Constructor por defecto
     */
    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizador = false;
    }

    /**
     * Constructor con el precio y el peso
     */

    public Television(double precioBase, double peso, double resolucion, boolean tdt) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizador = tdt;
    }

    /**
     * Constructor con todos los parámetros
     */
    public Television(double precioBase, String color, ConsumoEnergeticoPermitido consumoEnergetico, double peso, double pulgadas, boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = pulgadas;
        this.sintonizador = tdt;
    }

    // Declaramos los métodos de la clase

    //Metodos getter y setter
    public double getResolucion() {
        return resolucion;
    }
    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    //Declarmos el método toString


    @Override
    public String toString() {
        String cadena = "Television: " + super.toString();
        cadena += ", resolucion: " + resolucion;

        if (sintonizador) {
            cadena += ", TDT: Si";
        } else {
            cadena += ", TDT: No";
        }

        return cadena;
    }

    /**
     * Método que devuelve el precio final de la television
     */
    public double precioFinal() {
        // Llamamos al método precioFinal de la clase padre y lo guardamos en una variable
        double precioFinal = super.precioFinal();

        //Si la resolución es mayor que 40 pulgadas, se incrementa el precio en un 30%
        if (resolucion > 40) {
            precioFinal = precioFinal + (precioFinal * 0.3);
        }

        //Si tiene TDT, se incrementa el precio en 50€
        if (sintonizador) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
