import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class school {
    private JButton addResultButton;
    private JPanel panel1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textMaths;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;

    public static void main(String[] args) {
        JFrame frame = new JFrame("school");
        frame.setContentPane(new school().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public school() {
        addResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ma1, en2, sc3, hs4, hss5, ge6, Final ;
                double agreeGrd;

                ma1 = Integer.parseInt(textMaths.getText());
                en2 = Integer.parseInt(textField7.getText());
                sc3 = Integer.parseInt(textField8.getText());
                hs4 = Integer.parseInt(textField9.getText());
                hss5 = Integer.parseInt(textField10.getText());
                ge6 = Integer.parseInt(textField6.getText());


                Final = ma1 + en2 + sc3 + hs4 + hss5 + ge6;

                textField2.setText(String.valueOf(Final));

                agreeGrd = Final/6;
                textField3.setText(String.valueOf(agreeGrd));

                if( agreeGrd > 50 ){

                    textField5.setText("pass");
                }
                else {
                    textField5.setText("Fail");
                }

            }
        });
    }

}


