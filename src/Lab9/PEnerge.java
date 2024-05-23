import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PEnerge extends JFrame {

    JTextField K;
    JTextField X;

    public PEnerge() {

        super("Вираховування потенціальної енергії води");
        super.setBounds(700, 300, 450, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = super.getContentPane();
        cont.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel kr = new JLabel("Введіть велечину k= ");
        K = new JTextField(2);
        JLabel xr = new JLabel("Введіть велечину x= ");
        X = new JTextField(2);

        cont.add(kr);
        cont.add(X);
        cont.add(xr);
        cont.add(K);

        JButton butt = new JButton("Порахувати");

        cont.add(butt);

        butt.addActionListener(new Button_());
    }

    class Button_ implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double k = Double.parseDouble(K.getText());
                double x = Double.parseDouble(X.getText());
                double result = k * x;
                JOptionPane.showMessageDialog(null, "Результат: " + result + " Дж");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Введіть коректне число.");
            }
        }
    }
}


