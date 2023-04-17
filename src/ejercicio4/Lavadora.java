package ejercicio4;

public class Lavadora extends Electrodomestico {

    // Declaramos los atributos de la clase

    /**
     * Atributo que guarda la carga de la lavadora
     */
    private double carga;

    // Declaramos los constructores

    /**
     * Constructor por defecto
     */
    public Lavadora() {
        super();
        this.carga = 5;
    }

    /**
     * Constructor con el precio y el peso
     */
    public Lavadora(double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = 5;
    }



    /**
     * Constructor con todos los parámetros
     */
    public Lavadora(double precioBase, String color, ConsumoEnergeticoPermitido consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Declaramos los métodos de la clase

    //Metodos getter y setter
    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }

    /**
     * Método que devuelve el precio final de la lavadora
     */

    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}

