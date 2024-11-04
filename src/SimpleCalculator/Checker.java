package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checker extends JFrame {
    private JPanel pMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JButton btnCompute;

    public Checker() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                int result = 0;

                switch (cbOperations.getSelectedIndex()) {
                    case 0 -> result = num1 + num2;
                    case 1 -> result = num1 - num2;
                    case 2 -> result = num1 * num2;
                    case 3 -> result = num1 / num2;
                    default -> {
                    }
                }

                lblResult.setText(String.valueOf(result));
            }
        });
    }

    public static void main(String[] args) {
        Checker s = new Checker();
        s.setContentPane(s.pMain);
        s.setSize(800,300);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Simple Calculator");
    }
}
