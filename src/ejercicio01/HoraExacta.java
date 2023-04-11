package ejercicio01;

public class HoraExacta extends Hora{
    /**
     * Atributo que guarda los segundos
     */
    public int segundo = 0;

    /**
     * Constructor de la clase hija
     */
    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (segundo <= 0 || segundo >= 59) {
            this.segundo = segundo;
        }
    }

    /**
     * Método getter que devuelve los segundos
     * @return los segundos
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Método setter que asigna el valor introducido a los segundos siempre que este sea entre 0 y 59
     * @param segundo valor que se le quiere asignar a los segundos
     */
    public void setSegundo(int segundo) {
        if (segundo <= 0 || segundo >= 59) {
            this.segundo = segundo;
        }
    }

    /**
     * Método que incrementa la hora en 1 segundo
     */
    public void inc() {
        // Incrementa el segundo
        segundo++;

        if (segundo == 60) {      // Si el segundo es 60
            // Pone el segundo a 0 e incrementa el minuto en 1
            segundo = 0;
            minuto++;
            if (minuto == 60) {   // Si el minuto es 60
                // Pone el minuto a 0 e incrementa la hora en 1
                minuto = 0;
                hora++;
                if (hora == 24) {   // Si la hora es 24
                    // Pone la hora a 0
                    hora = 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
