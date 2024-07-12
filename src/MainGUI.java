

import javax.swing.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    public static void main(String[] args) {
        // Crear el marco (frame) de la aplicación
        JFrame frame = new JFrame("Inserción de Datos de Estudiantes");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Hacer visible la ventana
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Crear y ubicar el JLabel y JTextField para el nombre
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(10, 20, 80, 25);
        panel.add(nombreLabel);

        JTextField nombreText = new JTextField(20);
        nombreText.setBounds(100, 20, 165, 25);
        panel.add(nombreText);

        // Crear y ubicar el JLabel y JTextField para la cédula
        JLabel cedulaLabel = new JLabel("Cédula:");
        cedulaLabel.setBounds(10, 50, 80, 25);
        panel.add(cedulaLabel);

        JTextField cedulaText = new JTextField(20);
        cedulaText.setBounds(100, 50, 165, 25);
        panel.add(cedulaText);

        // Crear y ubicar el JButton para insertar
        JButton insertButton = new JButton("Insertar");
        insertButton.setBounds(10, 80, 80, 25);
        panel.add(insertButton);

        // Agregar un ActionListener al botón
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreText.getText();
                String cedula = cedulaText.getText();
                Estudiante estudiante = new Estudiante(nombre, cedula);
                JOptionPane.showMessageDialog(null, "Estudiante ingresado: " + estudiante);
            }
        });
    }
}
