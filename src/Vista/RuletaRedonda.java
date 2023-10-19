package Vista;

import java.awt.*;
import javax.swing.*;

public class RuletaRedonda extends JPanel {

    private int diametro;

    public RuletaRedonda(int diametro) {
        this.diametro = diametro;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la ruleta redonda
        g.setColor(Color.black);
        int ancho = diametro / 2;

        // Dibuja la mitad superior
        g.fillOval(0, 0, ancho, diametro);

        // Dibuja la mitad inferior
        g.setColor(Color.red);
        g.fillOval(ancho, 0, diametro - ancho, diametro);

        // Dibuje los números de la ruleta
        for (int i = 0; i < 37; i++) {
            // Dibuje el número
            g.setColor(Color.white);
            g.drawString(String.valueOf(i + 1), i * diametro / 37, diametro / 2);

            // Dibuje el marco del número
            g.setColor(Color.black);
            g.drawRect(i * diametro / 37 - 3, diametro / 2 - 10, 6, 20);
        }
    }
}