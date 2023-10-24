package Modelo;

public abstract class Apuesta {
    protected double monto;
    public Apuesta(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public abstract double calcularGanancia();
    public abstract boolean ganado(int numeroResultado);
}
