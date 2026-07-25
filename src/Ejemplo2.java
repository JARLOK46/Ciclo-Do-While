import javax.swing.JOptionPane;

public class Ejemplo2 {
    public static void main(String[] args) {
        int opcion;

        do {
            String menu = "===== MENU PRINCIPAL =====\n"
                    + "1. Saludar\n"
                    + "2. Sumar dos numeros\n"
                    + "3. Mostrar fecha actual\n"
                    + "4. Salir\n\n"
                    + "Seleccione una opcion:";
            String input = JOptionPane.showInputDialog(null, menu);
            if (input == null) break;
            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Hola, bienvenido al programa!");
                    break;
                case 2:
                    String aStr = JOptionPane.showInputDialog(null, "Ingrese el primer numero:");
                    if (aStr == null) break;
                    String bStr = JOptionPane.showInputDialog(null, "Ingrese el segundo numero:");
                    if (bStr == null) break;
                    int a = Integer.parseInt(aStr);
                    int b = Integer.parseInt(bStr);
                    JOptionPane.showMessageDialog(null, "La suma es: " + (a + b));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Fecha: 2025-07-25");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida, intente de nuevo.");
            }
        } while (opcion != 4);
    }
}
