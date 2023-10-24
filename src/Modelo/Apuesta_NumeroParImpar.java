package Modelo;

public class Apuesta_NumeroParImpar extends Apuesta implements Ganable {
    private String tipo;  // Puede ser "PAR" o "IMPAR"

    public Apuesta_NumeroParImpar(double monto, String tipo) {
        super(monto);
        if (!tipo.equals("PAR") && !tipo.equals("IMPAR")) {
            throw new IllegalArgumentException("El tipo debe ser 'PAR' o 'IMPAR'");
        }
        this.tipo = tipo;
    }

    @Override
    public boolean ganado(int numeroResultado) {
        if (tipo.equals("PAR")) {
            return numeroResultado % 2 == 0;
        } else {
            return numeroResultado % 2 != 0;
        }
    }
    @Override
    public double calcularGanancia() {
        System.out.println("Monto de superclase: " + super.monto);
        System.out.println("Monto de subclase: " + this.monto);
        return monto * 2;
    }
}

