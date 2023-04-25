package ejercicio05;

import java.util.Scanner;

public class Main {

    //Declaramos el scanner para leer por consola
    static Scanner sc = new Scanner(System.in);

    /**
     * Método principal de la clase Main
     *
     * @param args
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int opcion;
        int posicion = 0;

        //Creamos el array de polígonos
        Poligono[] poligonos = new Poligono[10];

        do {
            pintarMenu1();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1 -> {
                    crearTriangulo(posicion, poligonos);
                    posicion++;
                }
                case 2 -> {
                    crearRectangulo(posicion, poligonos);
                    posicion++;
                }
                case 3 -> {
                    for (Poligono poligono : poligonos) {
                        if (poligono != null) {
                            System.out.println(poligono);
                        }
                    }
                }
                case 0 -> System.out.println("Hasta pronto!");
            }
        } while (opcion != 0);

    }


    private static void pintarMenu1() {
        System.out.println("""
                [1] Triángulo
                [2] Rectángulo
                [3] Mostrar contenido del array
                [0] Salir
                """);
    }

    /**
     * Método que crea un triángulo y lo guarda en el array de polígonos
     *
     * @param posicion  posición del array donde se va a guardar el triángulo
     * @param poligonos array de polígonos
     */
    private static void crearTriangulo(int posicion, Poligono[] poligonos) {
        //Declaramos las variables
        int numeroLados;                //
        double lado1, lado2, lado3;

        System.out.println("Examen sorpresa! ¿Cuántos lados tiene un triángulo?");
        do {
            numeroLados = sc.nextInt();
            sc.nextLine();

            if (numeroLados != 3) {
                System.out.println("No es un rectángulo, prueba otra vez");
            }
        } while (numeroLados != 3);

        System.out.println("Introduce el primer lado del triángulo");
        lado1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduce el segundo lado del triángulo");
        lado2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduce el tercer lado del triángulo");
        lado3 = sc.nextDouble();
        sc.nextLine();

        poligonos[posicion] = new Triangulo(numeroLados, lado1, lado2, lado3);

    }

    /**
     * Método que crea un rectángulo y lo guarda en el array de polígonos
     *
     * @param posicion  posición del array donde se va a guardar el rectángulo
     * @param poligonos array de polígonos
     */
    private static void crearRectangulo(int posicion, Poligono[] poligonos) {

        //Declaramos las variables
        int numeroLados;
        double lado1, lado2;

        System.out.println("Examen sorpresa! ¿Cuántos lados tiene un rectángulo?");
        do {
            numeroLados = sc.nextInt();
            sc.nextLine();

            if (numeroLados != 4) {
                System.out.println("No es un rectángulo, prueba otra vez");
            }
        } while (numeroLados != 4);

        System.out.println("Introduce el primer lado del rectángulo");
        lado1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduce el segundo lado del rectángulo");
        lado2 = sc.nextDouble();
        sc.nextLine();

        poligonos[posicion] = new Rectangulo(numeroLados, lado1, lado2);

    }
}
