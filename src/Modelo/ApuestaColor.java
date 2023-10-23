package Modelo;

public class ApuestaColor extends Apuesta {
    private String color;

    public ApuestaColor(String tipo, String valor, int monto, String color) {
        super(tipo, valor, monto);
        this.color = color;
    }

    @Override
    public int calcularGanancia() {
        // Lógica para calcular ganancia según color
        return 0;
    }
}
