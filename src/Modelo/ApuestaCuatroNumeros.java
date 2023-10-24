package Modelo;

public class ApuestaCuatroNumeros extends Apuesta {
    private int[] numeros;

    public ApuestaCuatroNumeros(double monto, int[] numeros) {
        super(monto);
        this.numeros = numeros;
    }

    @Override
    public boolean ganado(int numeroGanador) {
        for (int num : numeros) {
            if (numeroGanador == num) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calcularGanancia() {
        // Lógica para calcular ganancia al apostar por cuatro números.
        return monto * 8;  // Suponiendo que la ganancia es 8 veces.
    }
}
