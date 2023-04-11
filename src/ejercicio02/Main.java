package ejercicio02;

public class Main {
    public static void main(String[] args) {
        Empleado E1 = new Empleado("Juan");
        Directivo D1 = new Directivo("Pedro");
        Operario OP1 = new Operario("Luis");
        Oficial OF1 = new Oficial("Ana");
        Tecnico T1 = new Tecnico("Maria");

        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);

    }
}
