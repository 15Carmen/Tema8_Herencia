package ejercicio01;

public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(12, 59);
        HoraExacta horaExacta = new HoraExacta(23, 59, 59);

        System.out.println("ejercicio01.Hora -> " + hora);
        System.out.println("ejercicio01.Hora exacta -> " + horaExacta);

        hora.inc();
        horaExacta.inc();

        System.out.println("ejercicio01.Hora -> " + hora);
        System.out.println("ejercicio01.Hora exacta -> " + horaExacta);


    }
}
