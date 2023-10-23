package Modelo;

public class Apuesta_NumeroRango extends Apuesta {
    private int rangoMinimo;
    private int rangoMaximo;

    public Apuesta_NumeroRango(String tipo, String valor, int monto, int rangoMinimo, int rangoMaximo) {
        super(tipo, valor, monto);
        this.rangoMinimo = rangoMinimo;
        this.rangoMaximo = rangoMaximo;
    }

    @Override
    public int calcularGanancia() {
        // Lógica para calcular ganancia según rango
        return 0;
    }
}
