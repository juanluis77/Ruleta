package Modelo;

public class Apuesta_Columna extends Apuesta {
    private int columnaId;  // 1, 2 o 3

    public Apuesta_Columna(double monto, int columnaId) {
        super(monto);
        if (columnaId < 1 || columnaId > 3) {
            throw new IllegalArgumentException("El identificador de columna debe ser 1, 2 o 3");
        }
        this.columnaId = columnaId;
    }

    @Override
    public boolean ganado(int numeroResultado) {
        switch (columnaId) {
            case 1:
                // Los números de la primera columna
                int[] columna1 = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
                for (int num : columna1) {
                    if (numeroResultado == num) return true;
                }
                break;
            case 2:
                // Los números de la segunda columna
                int[] columna2 = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35};
                for (int num : columna2) {
                    if (numeroResultado == num) return true;
                }
                break;
            case 3:
                // Los números de la tercera columna
                int[] columna3 = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};
                for (int num : columna3) {
                    if (numeroResultado == num) return true;
                }
                break;
        }
        return false;  // Si no coincide con ningún número de la columna seleccionada
    }

    @Override
    public double calcularGanancia() {
        return monto * 2;  // Esta es una ganancia de ejemplo, puedes ajustarla según las reglas de tu juego
    }
}
