package Modelo;
import java.util.*;

public class RuletaR extends Ruleta{
    private boolean tieneCeroDoble;
    public int fichas;
    public RuletaR(int numeroCasillas, int tamanoMesa, int precioFichas, int numeroFichas) {
        super(numeroCasillas, tamanoMesa, precioFichas, numeroFichas);
        this.tieneCeroDoble = true;
    }

}