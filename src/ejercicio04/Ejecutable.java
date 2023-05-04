package ejercicio04;

/**
 * Clase principal del ejercicio 4
 */
public class Ejecutable {

    /**
     * Método principal del ejercicio 4
     * @param args
     */
    public static void main(String[] args) {



        //Creamos los objetos de las clases Electrodomestico, Lavadora y Television
        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico(200, "rojo", Electrodomestico.ConsumoEnergeticoPermitido.E, 30);
        Electrodomestico e3 = new Electrodomestico(300, 40);
        Electrodomestico l1 = new Lavadora();
        Electrodomestico l2 = new Lavadora(300, "azul", Electrodomestico.ConsumoEnergeticoPermitido.A, 40, 40);
        Electrodomestico l3 = new Lavadora(560, 100, 60);
        Electrodomestico t1 = new Television();
        Electrodomestico t2 = new Television(400, "negro", Electrodomestico.ConsumoEnergeticoPermitido.C, 50, 40, true);
        Electrodomestico t3 = new Television(300, 60, 70, false);

       //Introducimos los objetos que acabamos de crear en el array
        //Creamos un array de 10 electrodomesticos
        Electrodomestico[] arrayElec = {e1, e2, e3, l1, l2, l3, t1, t2, t3};

        //Recorremos el array y lo mostramos por pantalla
        for (Electrodomestico elec: arrayElec) {
            System.out.println(elec);
        }



    }
}
