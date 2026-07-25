import javax.swing.JOptionPane;
import java.util.Random;

public class Ejemplo5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int secreto = rand.nextInt(100) + 1;
        int intento;
        int intentos = 0;

        JOptionPane.showMessageDialog(null, "Adivina el numero entre 1 y 100!");

        do {
            String input = JOptionPane.showInputDialog(null, "Tu intento (" + intentos + " intentos):");
            if (input == null) break;
            intento = Integer.parseInt(input);
            intentos++;

            if (intento > secreto) {
                JOptionPane.showMessageDialog(null, "Muy alto!");
            } else if (intento < secreto) {
                JOptionPane.showMessageDialog(null, "Muy bajo!");
            } else {
                JOptionPane.showMessageDialog(null, "Correcto! Adivinaste en " + intentos + " intento(s).");
            }
        } while (intento != secreto);
    }
}
