package Modelo;

public class Apuesta_NumeroRango extends Apuesta {
    private int inicioRango;
    private int finRango;

    public Apuesta_NumeroRango(double monto, int inicioRango, int finRango) {
        super(monto);
        this.inicioRango = inicioRango;
        this.finRango = finRango;
    }
    // Métodos getter para obtener los valores del rango
    public int getInicioRango() {
        return inicioRango;
    }

    public int getFinRango() {
        return finRango;
    }

    @Override
    public double calcularGanancia() {
        // Lógica para calcular ganancia al apostar por un rango.
        return monto * 3;  // Suponiendo que la ganancia es triple.
    }
    @Override
    public boolean ganado(int numeroGanador) {
        return numeroGanador >= inicioRango && numeroGanador <= finRango;
    }
}
