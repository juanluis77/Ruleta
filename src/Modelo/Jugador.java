package Modelo;

public class Jugador {
    private String nombre;
    private double saldo;
    private int apuestaActual;
    private int opcionApuesta;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.saldo = saldo;

    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void apostar(double monto) {
        this.saldo -= monto;
    }

    public void ganar(double monto) {
        this.saldo += monto;
    }
    // El método apostarNumero en la clase Jugador sería algo como:
    public void apostarNumero(int numero, int monto) {
        // Aquí lógica para guardar la apuesta del jugador.
        // Podrías tener una lista o un mapa de apuestas para este jugador y agregar la nueva apuesta.
    }
}

