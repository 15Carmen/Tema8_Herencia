package ejercicio01;

public class Hora {

    /**
     * Atrobuto que guarda la hora
     */
    public int hora = 0;

    /**
     * Atributo que guarda los minutos
     */
    public int minuto = 0;

    /**
     * Constructor vacio de la clase
     */
    public Hora() {
    }

    /**
     * Constructor de la clase
     *
     * @param hora   valor de la hora
     * @param minuto valor de los minutos
     */
    public Hora(int hora, int minuto) {
        if (hora <= 0 || hora >= 23) {
            this.hora = hora;
        }

        if (minuto <= 0 || minuto >= 59) {
            this.minuto = minuto;
        }
    }

    /**
     * Método que incrementa la hora en 1 minuto
     */
    public void inc() {
        // Incrementa el minuto
        minuto++;

        if (minuto == 60) {      // Si el minuto es 60
            // Pone el minuto a 0 e incrementa la hora en 1
            minuto = 0;
            hora++;
            if (hora == 24) {   // Si la hora es 24
                // Pone la hora a 0
                hora = 0;
            }
        }
    }

    /**
     * Metodo getter que devuelve la hora
     *
     * @return la hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Método getter que devuelve los minutos
     *
     * @return los minutos
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Método setter que asigna un valor a la hora si es válido
     *
     * @param hora valor que se quiere asignar a la hora
     * @return true si el valor es válido, false en caso contrario
     */
    public boolean setHora(int hora) {

        boolean valido = false;

        // Si la hora está entre 0 y 23 es válida
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            valido = true;
        }

        return valido;
    }

    /**
     * Método setter que asigna un valor a los minutos si es válido
     *
     * @param minuto valor que se quiere asignar a los minutos
     * @return true si el valor es válido, false en caso contrario
     */
    public boolean setMinuto(int minuto) {

        boolean valido = false;

        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
            valido = true;
        }

        return valido;
    }

    /**
     * Método toString que devuelve la hora en formato hh:mm
     *
     * @return la hora en formato hh:mm
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
}