package controllers;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Core {

    

    // mengosongkan inputan Text
    public void emptyInput(JTextField... fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }

    // mengosongkan inputan Text Area
    public void emptyInputArea(JTextArea... fields) {
        for (JTextArea field : fields) {
            field.setText("");
        }
    }

    // mengosongkan inputan Combo
    public void emptyCombo(JComboBox... fields) {
        for (JComboBox field : fields) {
            field.setSelectedIndex(0);
        }
    }
}
