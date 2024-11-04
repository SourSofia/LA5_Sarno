package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checker extends JFrame{
    private JButton checkYearButton;
    private JTextField yearTextField;
    private JPanel pMain;

    Checker(){
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearTextField.getText());
                boolean isLeapYear;

                isLeapYear = (year % 4 == 0);

                isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

                if (isLeapYear) {
                    JOptionPane.showMessageDialog(null, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }

    public static void main(String[] args) {
        Checker s = new Checker();
        s.setContentPane(s.pMain);
        s.setSize(300, 150);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Leap Year Checker");
    }
}
