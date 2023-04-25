package ejercicio05;

public class Rectangulo extends Poligono{

    /**
     * Atributos que guardan los lados del rectángulo
     */
    private double lado1;
    private double lado2;

    /**
     * Constructor por defecto de la clase Rectangulo
     */
    public Rectangulo(double lado1, double lado2) {
        super(4);
        this.lado1 = 1;
        this.lado2 = 1;
    }

    /**
     * Constructor parametrizado de la clase Rectangulo
     * @param numeroLados numero de lados del rectángulo (4)
     * @param lado1 base del rectángulo
     * @param lado2 altura del rectángulo
     */
    public Rectangulo(int numeroLados, double lado1, double lado2) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Declaramos los métodos getter y setter de los atributos de la clase Rectangulo

    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Método que devuelve como se va a imprimir el objeto por consola
     * @return cadena de texto
     */
    @Override
    public String toString() {
        return super.toString() + ". Es un rectángulo de " + lado1 + "x" + lado2 + " cm. y su área es de " + area() + " cm2";
    }

    /**
     * Método heredado de la clase Poligono que calcula el área del rectángulo
     * @return área del rectángulo
     */
    @Override
    public double area() {
         double area;
         area = lado1 * lado2;

         return area;
    }
}
