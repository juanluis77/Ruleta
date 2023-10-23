package Modelo;

public class Apuesta_NumeroPar extends Apuesta {
    private boolean par;

    public Apuesta_NumeroPar(String tipo, String valor, int monto, boolean par) {
        super(tipo, valor, monto);
        this.par = par;
    }

    @Override
    public int calcularGanancia() {
        // Lógica para calcular ganancia según si es par
        return 0;
    }
}
