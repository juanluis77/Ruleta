package Vista;
import Controlador.JuegoRuleta;
import Modelo.Jugador;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        JuegoRuleta juego = new JuegoRuleta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de jugadores:");
        int cantidadJugadores = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea restante

        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Introduce el nombre del jugador " + (i + 1) + ":");
            String nombreJugador = scanner.nextLine();
            Jugador jugador = new Jugador(nombreJugador);
            juego.agregarJugador(jugador);
        }

        boolean seguirApostando = true;
        for (Jugador jugadorActual : juego.getJugadores()) {
            while (seguirApostando) {
                System.out.println("Turno de jugador actual: " + jugadorActual.getNombre());
                juego.mostrarTablero();
                juego.mostrarOpcionesApuesta(jugadorActual);
                System.out.println("crupier: elige una opcion, con la ficha en el tablero a quien y cuanto desea apostar?");
                seguirApostando = juego.procesarApuesta(jugadorActual);
            }
            seguirApostando = true; // Resetear la variable para el próximo jugador
        }

        // Aquí iría el código que procesa la apuesta y muestra los resultados
        System.out.println("Gracias por jugar!");
    }
}

