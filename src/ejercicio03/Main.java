package ejercicio03;

public class Main {

    public static void main(String[] args) {

        NoPerecedero np = new NoPerecedero("Coca-Cola", 1.5, "Bebida");

        double precio = np.calcularPrecio(2);
        System.out.println(precio);
    }
}
