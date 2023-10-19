package Modelo;

public class JugadorActivo extends Jugador implements Apuesta{
    public int dinero;

    public JugadorActivo(String nombre, int fichas, int dinero) {
        super(nombre,fichas);
        this.dinero = dinero;
    }

    @Override
    public int comprarFichas(){
        return comprarFichas(dinero, null);
    }

    private int comprarFichas(int montoDinero, Ruleta ru){
        int cantidadFichas = 0;
        int totalPrecioFichas;
        totalPrecioFichas = ru.getPrecioFichas(); 
        if(montoDinero <  totalPrecioFichas){
            cantidadFichas = totalPrecioFichas * 2;
        }else{
            return 0;
        }
        return cantidadFichas;
    }

    @Override
    public void apostar(){}

}