package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checker extends JFrame{
    private JPanel pMain;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton btnOrder;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    Checker(){
        JCheckBox[] foods = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
        double[] prices = {100, 80, 65, 55, 50, 40};
        JRadioButton[] rbYear = {rbNone, rb5, rb10, rb15};

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = 0;
                int i = 0;

                for(JCheckBox j: foods){

                    if(j.isSelected()){
                        amount += prices[i];
                    }
                    i++;
                }


                for(JRadioButton rb : rbYear){
                    if(rb.isSelected()){
                        if(rb.getText().equals("None")){

                        }else if(rb.getText().equals("5% Off")){
                            amount -= (amount*.05);
                        }else if(rb.getText().equals("10% Off")){
                            amount -= (amount*.1);
                        }else if(rb.getText().equals("15% Off")){
                            amount -= (amount*.15);
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "The total price is Php " + amount);
            }
        });
    }

    public static void main(String[] args) {
        Checker s = new Checker();
        s.setContentPane(s.pMain);
        s.setSize(400,400);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Food Ordering System");
    }
}
