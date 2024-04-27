package example;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BottomLineBorderExample extends JFrame {

    public BottomLineBorderExample() {
        setTitle("Bottom Line Border Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        textField.setBorder(new BottomBorder(Color.BLUE, 2)); // Atur border bottom untuk JTextField

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setBorder(new BottomBorder(Color.RED, 2)); // Atur border bottom untuk JTextArea

        panel.add(textField);
        panel.add(textArea);

        add(panel);
    }

    // Kelas untuk membuat border bottom
    class BottomBorder extends AbstractBorder {

        private Color color;
        private int thickness;

        public BottomBorder(Color color, int thickness) {
            this.color = color;
            this.thickness = thickness;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(color);
            g2.fillRect(x, y + height - thickness, width, thickness); // Gambar border di bagian bawah
            g2.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(0, 0, thickness, 0); // Atur padding di bagian bawah
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BottomLineBorderExample().setVisible(true);
        });
    }
}
