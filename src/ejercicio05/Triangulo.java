package ejercicio05;

public class Triangulo extends Poligono{

    /**
     * Atributos que guardan los lados del triángulo
     */
    private double lado1;
    private double lado2;
    private double lado3;

    /**
     * Constructor por defecto de la clase Triangulo
     */
    public Triangulo() {
        super(3);
        this.lado1 = 1;
        this.lado2 = 1;
        this.lado3 = 1;
    }

    /**
     * Constructor parametrizado de la clase Triangulo
     * @param numeroLados numero de lados del triángulo (3)
     * @param lado1 primer lado del triángulo
     * @param lado2 segundo lado del triángulo
     * @param lado3 tercer lado del triángulo
     */
    public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //Declaramos los métodos getter y setter de los atributos de la clase Triangulo

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

    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Método que devuelve como se va a imprimir el objeto por consola
     * @return cadena de texto
     */
    @Override
    public String toString() {
        return super.toString() + ". Es un triángulo de " + lado1 + "x" + lado2 + "x" + lado3 + " cm. y su área es de " + area() + " cm2";
    }

    /**
     * Método que calcula el área del triángulo
     * @return área del triángulo
     */
    @Override
    public double area() {
        //Declaramos las variables
        double area;    //Variable que guarda el área del triángulo
        double s;       //Variable que guarda el semiperímetro del triángulo

        //Calculamos el semiperímetro del triángulo
        s = (lado1 + lado2 + lado3) / 2;

        //Calculamos el área del triángulo
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        //Devolvemos el área del triángulo
        return area;
    }
}
