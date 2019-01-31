package Kryptering;

import javax.swing.*;

public class GUIDesign extends JFrame{
    private JButton openButton;
    private JButton saveButton;
    private JButton cryptButton;
    private JButton decryptButton;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Open: Öppna en fil\nSave: Spara en fil\nCrypt: Kryptera ett meddelande\nDecrypt: Dekryptera ett meddelande");

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
