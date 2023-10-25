package Controlador;

import Modelo.*;

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

    public void mostrarOpcionesApuesta(Jugador jugadorActual) {
       // System.out.println("Turno de jugador actual: " + jugadorActual.getNombre());
        System.out.println("Tablero:");
        System.out.println("0");
        System.out.println("[3 6 9 12 15 18 21 24 27 30 33 36]");
        System.out.println("[2 5 8 11 14 17 20 23 26 29 32 35]");
        System.out.println("[1 4 7 10 13 16 19 22 25 28 31 34]");
        System.out.println("Elige un número para apostar en la opción :");
        System.out.println("1. Apostar número individual");
        System.out.println("2. Apostar número par he impar ");
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

        Apuesta apuesta = null;
        switch (opcion) {
            case 1:
                System.out.println("Para regresar a la lista anterior introduzca 00");
                System.out.println("Para apostar la ficha, ingrese el número a apostar del tablero:");
                int numeroElegido = scanner.nextInt();
                if (numeroElegido == 00) {
                    return true; // Regresar al menú anterior
                }
                System.out.println("Ingresa el monto de tu apuesta:");
                double monto = scanner.nextDouble();
                apuesta = new Apostar_Numero(monto, numeroElegido);
                break;

            case 2:
                System.out.println("Para regresar a la lista anterior introduzca 00");
                // Apostar número par
                boolean numeroValidoPar = false;
                int numeroPar = 0;

                while(!numeroValidoPar) {
                    System.out.println("Introduce el número par al que deseas apostar:");
                    numeroPar = scanner.nextInt();
                    if (numeroPar == 00) {
                        return true; // Regresar al menú anterior
                    }
                    else if (numeroPar % 2 == 0) {
                        numeroValidoPar = true;
                    } else {
                        System.out.println("El número introducido no es par. Por favor, intenta de nuevo.");
                    }
                }

                System.out.println("¿Cuánto deseas apostar al número " + numeroPar + "?");
                double montoPar = scanner.nextDouble();
                apuesta = new Apostar_Numero(montoPar, numeroPar);  // Usando la clase que ya tienes para apostar a un número individual
                break;

            case 3:
                System.out.println("Para regresar a la lista anterior introduzca 00");
                // Apostar número impar
                boolean numeroValidoImpar = false;
                int numeroImpar = 0;

                while(!numeroValidoImpar) {
                    System.out.println("Introduce el número impar al que deseas apostar:");
                    numeroImpar = scanner.nextInt();
                    if (numeroImpar == 00) {
                        return true; // Regresar al menú anterior
                    }
                    else if (numeroImpar % 2 != 0) {
                        numeroValidoImpar = true;
                    } else {
                        System.out.println("El número introducido no es impar. Por favor, intenta de nuevo.");
                    }
                }

                System.out.println("¿Cuánto deseas apostar al número " + numeroImpar + "?");
                double montoImpar = scanner.nextDouble();
                apuesta = new Apostar_Numero(montoImpar, numeroImpar);  // Usando la clase que ya tienes
                break;
            case 4:
                System.out.println("Para regresar a la lista anterior introduzca 00");
                // Apostar al 0
                System.out.println("¿Cuánto deseas apostar al número 0?");
                double montoApostar = scanner.nextDouble();

                if (montoApostar == 00) {
                    // Aquí deberías salir del switch y regresar al menú principal.
                    return true;  // Si estás dentro de un bucle.
                } else {
                    // Continuar con la lógica para la apuesta.
                    apuesta = new Apostar_Numero(montoApostar, 0);
                }
            case 5:
                System.out.println("Apostar del 1 al 12");
                System.out.println("Para regresar a la lista anterior introduzca 00");

                double montoRango1al12;
                System.out.println("¿Cuánto deseas apostar al rango del 1 al 12?");
                montoRango1al12 = scanner.nextDouble();

                if (montoRango1al12 == 00) {
                    return true; // Regresar al menú anterior
                }

                apuesta = new Apuesta_NumeroRango(montoRango1al12, 1, 12);
                break;
            case 6:
                System.out.println("Apostar del 13 al 24");
                System.out.println("Para regresar a la lista anterior introduzca 00");

                double montoRango13al24;
                System.out.println("¿Cuánto deseas apostar al rango del 13 al 24?");
                montoRango13al24 = scanner.nextDouble();

                if (montoRango13al24 == 00) {
                    return true; // Regresar al menú anterior
                }

                apuesta = new Apuesta_NumeroRango(montoRango13al24, 13, 24);
                break;
            case 7:
                System.out.println("Apostar del 25 al 36");
                System.out.println("Para regresar a la lista anterior introduzca 00");

                double montoRango25al36;
                System.out.println("¿Cuánto deseas apostar al rango del 25 al 36?");
                montoRango25al36 = scanner.nextDouble();

                if (montoRango25al36 == 00) {
                    return true; // Regresar al menú anterior
                }

                apuesta = new Apuesta_NumeroRango(montoRango25al36, 25, 36);
                break;
            case 8:
                System.out.println("Apostar del 1 al 18");
                System.out.println("Para regresar a la lista anterior introduzca 00");

                double montoRango1al18;
                System.out.println("¿Cuánto deseas apostar al rango del 1 al 18?");
                montoRango1al18 = scanner.nextDouble();

                if (montoRango1al18 == 00) {
                    return true; // Regresar al menú anterior
                }

                apuesta = new Apuesta_NumeroRango(montoRango1al18, 1, 18);
                break;
            case 9:
                System.out.println("Apostar del 19 al 36");
                System.out.println("Para regresar a la lista anterior introduzca 00");

                double montoRango19al36;
                System.out.println("¿Cuánto deseas apostar al rango del 19 al 36?");
                montoRango19al36 = scanner.nextDouble();

                if (montoRango19al36 == 00.0) {
                    return true; // Regresar al menú anterior
                }

                apuesta = new Apuesta_NumeroRango(montoRango19al36, 19, 36);
                break;
            case 10:
                System.out.println("Apostar 2 en 1: [3 6 9 12 15 18 21 24 27 30 33 36]");
                System.out.println("Para regresar a la lista anterior introduzca 00");

                double montoCol1;
                System.out.println("¿Cuánto deseas apostar a la columna [3 6 9 12 15 18 21 24 27 30 33 36]?");
                montoCol1 = scanner.nextDouble();

                if (montoCol1 == 00) {
                    return true; // Regresar al menú anterior
                }

                // Aquí puedes crear una clase Apuesta_Columna para manejar este tipo de apuestas
                apuesta = new Apuesta_Columna(montoCol1, 1);  // Suponiendo que 1 representa esta columna en particular.
                break;


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

