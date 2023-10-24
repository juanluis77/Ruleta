package Modelo;
public class ApuestaColor extends Apuesta {
    private ColorRuleta color;
    public ApuestaColor(double monto, ColorRuleta color) {
        super(monto);
        this.color = color;
    }
    @Override
    public boolean ganado(int resultadoRuleta) {
        // Lógica para determinar si se ganó basado en el color.
        // Supongamos que los números rojos son 1, 3, 5, ..., 35 y los negros son 2, 4, 6, ..., 36.
        if (color == ColorRuleta.ROJO && resultadoRuleta % 2 == 1) {
            return true;
        }
        if (color == ColorRuleta.NEGRO && resultadoRuleta % 2 == 0) {
            return true;
        }
        return false;
    }
    @Override
    public double calcularGanancia() {
        // Lógica para calcular ganancia según color
        return monto * 2;
    }
}

