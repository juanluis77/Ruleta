package Vista;
import Controlador.JuegoRuleta;
import Modelo.Jugador;

import java.util.List;
import java.util.Scanner;
import Modelo.Ruleta;
public class Main {

    public static void main(String[] args) {
        JuegoRuleta juego = new JuegoRuleta();
        Scanner scanner = new Scanner(System.in);
        Ruleta ruleta = new Ruleta();
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
               // juego.mostrarTablero();
                juego.mostrarOpcionesApuesta(jugadorActual);
                seguirApostando = juego.procesarApuesta(jugadorActual);
            }
            seguirApostando = true; // Resetear la variable para el próximo jugador
        }


        System.out.println("! Apuestas cerradas !, Las apuestas de los jugadores se completaron");
        System.out.println();
        System.out.println("Es turno de Turno del Crupier :");
        System.out.println("Preciona enter para girar la ruleta");
        scanner.nextLine();  // Esperar a que el usuario presione Enter
        int resultado = ruleta.girar();  // Asumiendo que tienes una función en "juego" para girar la ruleta
        System.out.println("El resultado es: " + resultado);

        List<Jugador> ganadores = juego.verificarApuestas(resultado);

        System.out.println("Estadísticas del juego:");
        if (ganadores.isEmpty()) {
            System.out.println("No hubo ganadores esta vez.");
        } else {
            System.out.println("Nombres de los ganadores:");
            for (Jugador ganador : ganadores) {
                System.out.println(ganador.getNombre());
                // Aquí puedes agregar más detalles, como la cantidad apostada, etc.
            }
        }
    }
}

