package Controller;

import javax.swing.JTextField;

public class CoreController {
    
    // mengosongkan inputan
    public void emptyInput(JTextField... fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
    
}
