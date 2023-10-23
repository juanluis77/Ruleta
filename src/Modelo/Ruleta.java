package Modelo;

import java.util.Random;

public class Ruleta {
    private int numeroGanador;

    public int girar() {
        Random random = new Random();
        numeroGanador = random.nextInt(37); // Números del 0 al 36
        return numeroGanador;
    }

    public int getNumeroGanador() {
        return numeroGanador;
    }
}

