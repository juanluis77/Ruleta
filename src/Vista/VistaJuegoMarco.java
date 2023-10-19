package Vista;
import javax.swing.*;
import java.awt.Color;
public class VistaJuegoMarco extends JFrame{

    private RuletaRedonda ruletaRedonda;

    public VistaJuegoMarco() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        // Crea el panel de la ruleta redonda
        ruletaRedonda = new RuletaRedonda(800);

        // Añade el panel de la ruleta redonda a la ventana
        add(ruletaRedonda);

        // Muestra la ventana
        setVisible(true);
    }
}