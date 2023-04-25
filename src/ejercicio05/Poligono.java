package ejercicio05;

public abstract class Poligono {

    /**
     * Atributo que guarda el número de lados del polígono
     */
    protected int numeroLados;

    /**
     * Constructor de la clase Poligono
     */
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    /**
     * Método getter del atributo numeroLados
     */
    public int getNumeroLados() {
        return numeroLados;
    }

    /**
     * Método que devuelve como se va a imprimir el objeto por consola
     * @return cadena de texto
     */
    @Override
    public String toString() {
        return "Polígono con " + numeroLados +" lados";
    }

    /**
     * Método abstracto que calcula el área del polígono
     * @return área del polígono
     */
    public abstract double area();
}
