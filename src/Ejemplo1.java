import javax.swing.JOptionPane;

public class Ejemplo1 {
    public static void main(String[] args) {
        int numero;
        int suma = 0;

        do {
            String input = JOptionPane.showInputDialog(null, "Ingrese un numero entero (negativo para terminar):");
            if (input == null) break;
            numero = Integer.parseInt(input);
            if (numero >= 0) {
                suma += numero;
                JOptionPane.showMessageDialog(null, "Suma acumulada: " + suma);
            }
        } while (numero >= 0);

        JOptionPane.showMessageDialog(null, "La suma total de los numeros positivos es: " + suma);
    }
}
