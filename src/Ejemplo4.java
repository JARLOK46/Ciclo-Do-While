import javax.swing.JOptionPane;

public class Ejemplo4 {
    public static void main(String[] args) {
        int numero;

        do {
            String input = JOptionPane.showInputDialog(null, "Ingrese un numero para ver su tabla de multiplicar (1-10):");
            if (input == null) break;
            numero = Integer.parseInt(input);
        } while (numero < 1 || numero > 10);

        String resultado = "Tabla de multiplicar del " + numero + ":\n\n";
        int i = 1;
        do {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
            i++;
        } while (i <= 10);

        JOptionPane.showMessageDialog(null, resultado);
    }
}
