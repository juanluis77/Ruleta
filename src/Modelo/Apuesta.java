package Modelo;

public abstract class Apuesta {
    protected String tipo;
    protected String valor;
    protected int monto;

    public Apuesta(String tipo, String valor, int monto) {
        this.tipo = tipo;
        this.valor = valor;
        this.monto = monto;
    }

    public abstract int calcularGanancia();
}
