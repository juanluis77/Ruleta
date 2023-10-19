package Modelo;
import java.util.*;


public abstract class Ruleta{

    public int numeroCasillas;
    private int tamanoMesa;
    protected int precioFichas;
    public int numeroFichas;

    public Ruleta(int numeroCasillas, int tamanoMesa, int precioFichas, int numeroFichas) {
        this.numeroCasillas = numeroCasillas;
        this.tamanoMesa = tamanoMesa;
        this.precioFichas = precioFichas;
        this.numeroFichas = 0;
    }
    
    public int getPrecioFichas(){
        return precioFichas;
    }

    public int girar() {
        // Genera un número aleatorio entre 0 y el número de casillas
        return new Random().nextInt(numeroCasillas);
    }
    
    
    
}