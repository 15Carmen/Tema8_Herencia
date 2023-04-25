package ejercicio04;

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
        this.carga = carga;
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

    //Declarmos el método toString


    @Override
    public String toString() {
        String cadena = "Lavadora: " + super.toString();
        cadena += ", carga: " + carga + "kg";

        return cadena;
    }

    /**
     * Método que devuelve el precio final de la lavadora
     */
    public double precioFinal() {
        // Llamamos al método precioFinal de la clase padre y lo guardamos en una variable
        double precioFinal = super.precioFinal();

        //Si la carga es mayor que 30 kg, se incrementa el precio en 50€
        if (carga > 30) {
            precioFinal += 50;
        }
        // Devolvemos el precio final
        return precioFinal;
    }
}

