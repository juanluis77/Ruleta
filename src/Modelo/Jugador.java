package Modelo;

public class Jugador {
    private String nombre;
    private double saldo;


    public Jugador(String nombre) {
        this.nombre = nombre;
        this.saldo = 1;

    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void apostar(double monto) {
        this.saldo -= monto;
    }

    public void ganar(double monto) {
        this.saldo += monto;
    }
}

