package Modelo;

public class Apostar_Numero extends Apuesta {
    private int numeroApostado;

    public Apostar_Numero(String tipo, String valor, int monto, int numeroApostado) {
        super(tipo, valor, monto);
        this.numeroApostado = numeroApostado;
    }

    @Override
    public int calcularGanancia() {
        // Lógica para calcular ganancia según número apostado
        return 0;
    }
}
