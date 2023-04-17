package ejercicio4;

public class Electrodomestico {

    // Declaramos los atributos de la clase

    /**
     * Atributo que guarda el precio base del electrodomestico
     */
    private double precioBase;

    /**
     * Atributo que guarda el color del electrodomestico
     */
    private enum ColorPermitido {blanco, negro, rojo, azul, gris}
    private String color;

    /**
     * Atributo que guarda el consumo energetico del electrodomestico
     */
    public enum ConsumoEnergeticoPermitido {A, B, C, D, E, F}
    private ConsumoEnergeticoPermitido consumoEnergetico;


    /**
     * Atributo que guarda el peso en kg del electrodomestico
     */
    double peso;

    //Declaramos los constructores

    /**
     * Constructor por defecto
     */
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = String.valueOf(ColorPermitido.blanco);
        this.consumoEnergetico = ConsumoEnergeticoPermitido.F;
        this.peso = 5;
    }

    /**
     * Constructor solo con los parámetros peso y precio
     */
    public Electrodomestico(double precioBase, double peso){
        this.precioBase = precioBase;
        this.color = String.valueOf(ColorPermitido.blanco);
        this.consumoEnergetico = ConsumoEnergeticoPermitido.F;
        this.peso = peso;
    }

    /**
     * Constructor con todos los parámetros
     */
    public Electrodomestico(double precioBase, String color, ConsumoEnergeticoPermitido consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = String.valueOf(color);
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    //Declaramos los métodos getter y setter


    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public ConsumoEnergeticoPermitido getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(ConsumoEnergeticoPermitido consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Declaramos los métodos de la clase

    /**
     * Método que comprueba que la letra introducida se encuentra entre las letras del enum ConsumoEnergeticoPermitido
     * Si no se encuentra, se asigna la letra F
     * @param letra letra que se quiere comprobar
     * @return true si la letra se encuentra en el enum, false si no se encuentra
     */
    private boolean comprobarConsumoEnergetico(char letra){
        boolean encontrado = false;
        for (ConsumoEnergeticoPermitido consumo : ConsumoEnergeticoPermitido.values()) {
            if (consumo.name().equals(String.valueOf(letra))) {
                encontrado = true;
            }else {
                letra = ConsumoEnergeticoPermitido.F.name().charAt(0);
            }
        }
        return encontrado;
    }

    /**
     * Método que comprueba que el color introducido se encuentra entre los colores del enum ColorPermitido
     * Si no se encuentra, se asigna el color blanco
     * @param color color que se quiere comprobar
     * @return true si el color se encuentra en el enum, false si no se encuentra
     */
    private boolean comprobarColor(String color){
        boolean encontrado = false;
        for (ColorPermitido colorPermitido : ColorPermitido.values()) {
            if (colorPermitido.name().equals(color.toLowerCase())) {
                encontrado = true;
            }else{
                color = String.valueOf(ColorPermitido.blanco);
            }
        }
        return encontrado;
    }

    /**
     * Método que calcula el precio final del electrodoméstico. Según el consumo energético,
     * aumentará su precio base, y según su tamaño, también aumentará su precio base
     */
    public double precioFinal(){

        double precioFinal = this.precioBase;

        switch (this.consumoEnergetico){
            case A:
                precioFinal += 100;
                break;
            case B:
                precioFinal += 80;
                break;
            case C:
                precioFinal += 60;
                break;
            case D:
                precioFinal += 50;
                break;
            case E:
                precioFinal += 30;
                break;
            case F:
                precioFinal += 10;
                break;
        }

        if (this.peso >= 0 && this.peso <= 19){
            precioFinal += 10;
        }else if (this.peso >= 20 && this.peso <= 49){
            precioFinal += 50;
        }else if (this.peso >= 50 && this.peso <= 79){
            precioFinal += 80;
        }else if (this.peso >= 80){
            precioFinal += 100;
        }
        this.precioBase = precioFinal;

        return precioFinal;
    }
}
