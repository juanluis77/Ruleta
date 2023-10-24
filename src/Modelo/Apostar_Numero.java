package Modelo;

public class Apostar_Numero extends Apuesta {
    private int numeroApostado;

    public Apostar_Numero(double monto, int numeroApostado) {
        super(monto);
        this.numeroApostado = numeroApostado;
    }

    @Override
    public double calcularGanancia() {
        // Lógica para calcular ganancia al apostar por número.
        return monto * 35; // Retorno de ejemplo.
    }
    public boolean ganado(int resultadoRuleta) {
        return numeroApostado == resultadoRuleta;
    }
}

