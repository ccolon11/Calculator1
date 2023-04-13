import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 *
 */
public class Calculator {
    private JTextField textField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button11;
    private JButton cButton;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JLabel jLabel1;
    private JPanel panel1;
    double num, rest;
    int totaling;

    /**
     *
     */
    private void arithmetic_operation() {
        switch (totaling) {
            case 1 -> {
                rest = num + Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(rest));
            }
            case 2 -> {
                rest = num - Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(rest));
            }
            case 3 -> {
                rest = num * Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(rest));
            }
            case 4 -> {
                rest = num / Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(rest));
            }
        }
    }
  private Calculator(){
    a1Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "1");
        }
    });
    a2Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "2");
        }
    });
    a3Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "3");
        }
    });
    a4Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "4");
        }
    });
    a5Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "5");
        }
    });
    a6Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "6");
        }
    });
    a7Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "7");
        }
    });
    a8Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "8");
        }
    });
    a9Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "9");
        }
    });
    a0Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + "0");
        }
    });
    button11.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int length = textField1.getText().length();
            int number = textField1.getText().length() - 1;
            String store;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField1.getText());
                back.deleteCharAt(number);
                store = back.toString();
                textField1.setText(store);
            }
        }
    });
    cButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText("");
        }
    });
    button13.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num = Double.parseDouble(textField1.getText());
            totaling = 1;
            textField1.setText("");
            jLabel1.setText(num + "+");
        }
    });
    button14.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num = Double.parseDouble(textField1.getText());
            totaling = 2;
            textField1.setText("");
            jLabel1.setText(num + "-");
        }
    });
    button15.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num = Double.parseDouble(textField1.getText());
            totaling = 3;
            textField1.setText("");
            jLabel1.setText(num + "*");
        }
    });
    button16.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num = Double.parseDouble(textField1.getText());
            totaling = 4;
            textField1.setText("");
            jLabel1.setText(num + "/");
        }
    });
    button17.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            arithmetic_operation();
            jLabel1.setText("");
        }
    });
    button18.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField1.setText(textField1.getText() + ".");
        }
    });

  }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel1);
        frame.setSize (353, 350);
        frame.setLocation(500,250);
        frame.setIconImage(new ImageIcon(Objects.requireNonNull
        (Calculator.class.getResource("logo.png"))).getImage());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }

