package Controlador;

import Modelo.Jugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JuegoRuleta {
    private List<Jugador> jugadores;
    private int numeroRuleta;

    public JuegoRuleta() {
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

// ... otras partes de la clase JuegoRuleta ...

    public void mostrarTablero() {
        System.out.println("0");
        System.out.println("[3 6 9 12 15 18 21 24 27 30 33 36]");
        System.out.println("[2 5 8 11 14 17 20 23 26 29 32 35]");
        System.out.println("[1 4 7 10 13 16 19 22 25 28 31 34]");
    }

    public void mostrarOpcionesApuesta(Jugador jugadorActual) {
        System.out.println("Turno de jugador actual: " + jugadorActual.getNombre());
        System.out.println("Tablero:");
        System.out.println("0");
        System.out.println("[3 6 9 12 15 18 21 24 27 30 33 36]");
        System.out.println("[2 5 8 11 14 17 20 23 26 29 32 35]");
        System.out.println("[1 4 7 10 13 16 19 22 25 28 31 34]");
        System.out.println("Elige un número para apostar en la opción :");
        System.out.println("1. Apostar número individual");
        System.out.println("2. Apostar número par");
        System.out.println("3. Apostar número impar");
        System.out.println("4. Apostar al 0");
        System.out.println("5. Apostar del 1 al 12");
        System.out.println("6. Apostar del 13 al 24");
        System.out.println("7. Apostar del 25 al 36");
        System.out.println("8. Apostar del 1 al 18");
        System.out.println("9. Apostar del 19 al 36");
        System.out.println("10. Apostar del 2 en 1");
        System.out.println("11. Apostar 2 en 1: [3 6 9 12 15 18 21 24 27 30 33 36]");
        System.out.println("12. Apostar 2 en 1: [2 5 8 11 14 17 20 23 26 29 32 35]");
        System.out.println("13. Apostar 2 en 1: [1 4 7 10 13 16 19 22 25 28 31 34]");
        System.out.println("14. Apostar color negro");
        System.out.println("15. Apostar color rojo");
        System.out.println("16. Apostar 2 números con una ficha");
        System.out.println("17. Apostar 4 números con una ficha");
        System.out.println("18. Guardar y apostar");
        System.out.println("Crupier: Elige una opción con la ficha en el tablero. ¿A quién y cuánto desea apostar?");
    }

    public boolean procesarApuesta(Jugador jugadorActual) {
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        scanner.nextLine();

        // Si la opción es guardar y apostar, se retorna false para salir del bucle.
        if (opcion == 18) {
            return false;
        }

        switch (opcion) {
            case 1:
                System.out.println("Para regresar a la lista anterior introduzca 00");
                System.out.println("Para apostar la ficha, ingrese el número a apostar del tablero:");
                int numeroElegido = scanner.nextInt();
                if (numeroElegido == 00) {
                    return true; // Regresar al menú anterior
                }
                System.out.println("Monto mínimo 1, máximo 100:");
                int montoApostado = scanner.nextInt();
                jugadorActual.apostarNumero(numeroElegido, montoApostado);
                break;

            // ... Aquí irían los otros casos del switch para las demás opciones de apuestas

            default:
                System.out.println("Opción no válida. Por favor, intenta nuevamente.");
                return true;
        }
        return true;
    }


    public void girarRuleta() {
        Random rand = new Random();
        this.numeroRuleta = rand.nextInt(37);  // 0-36
    }

    public void mostrarResultados() {
        // Implementación para mostrar los resultados después de girar la ruleta
    }

}

