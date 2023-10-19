package Modelo;

public abstract class Jugador{
    public String nombre;
    protected int fichas;

    public Jugador(String nombre, int fichas) {
        this.nombre = nombre;
        this.fichas = fichas;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public abstract int comprarFichas();
}