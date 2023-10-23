package Modelo;

import java.util.List;

public class ApuestaNumeroCompartido extends Apuesta {
    private List<Integer> numerosApostados;
    private int cantidadNumeros;

    public ApuestaNumeroCompartido(String tipo, String valor, int monto, List<Integer> numerosApostados) {
        super(tipo, valor, monto);
        this.numerosApostados = numerosApostados;
        this.cantidadNumeros = numerosApostados.size();
    }

    @Override
    public int calcularGanancia() {
        // Lógica para calcular ganancia según números apostados compartidos
        return 0;
    }
}