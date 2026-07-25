import javax.swing.JOptionPane;

public class Ejemplo3 {
    public static void main(String[] args) {
        int numero;
        int conteo = 0;

        do {
            String input = JOptionPane.showInputDialog(null, "Ingrese un numero entero positivo:");
            if (input == null) break;
            numero = Integer.parseInt(input);
        } while (numero <= 0);

        int temp = numero;
        do {
            temp /= 10;
            conteo++;
        } while (temp != 0);

        JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene " + conteo + " digito(s).");
    }
}
