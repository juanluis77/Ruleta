package Modelo;

public class ApuestaNumeroCompartido extends Apuesta {
    private int primerNumero;
    private int segundoNumero;

    public ApuestaNumeroCompartido(double monto, int primerNumero, int segundoNumero) {
        super(monto);
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    @Override
    public double calcularGanancia() {
        // Lógica para calcular ganancia al apostar por números compartidos.
        return monto * 17;  // Suponiendo que la ganancia es 17 veces.
    }
    @Override
    public boolean ganado(int numeroGanador) {
        return numeroGanador == primerNumero || numeroGanador == segundoNumero;
    }

}