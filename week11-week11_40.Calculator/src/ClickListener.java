/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Chetan Tuteja
 */
public class ClickListener implements ActionListener {

    private JTextField input, output;
    private JButton button, button2;

    public ClickListener(JTextField input, JTextField output, JButton button, JButton button2) {
        this.input = input;
        this.output = output;
        this.button = button;
        this.button2 = button2;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (this.button.getText().equals("+")) {
            performAddition();
        } else if (this.button.getText().equals("-")) {
            performSubtraction();
        } else if (this.button.getText().equals("Z")) {
            resetValue();
        }
    }

    private void performAddition() {
        if (this.output.getText().equals("0")) {
            this.button2.setEnabled(true);
        }

        int out = Integer.parseInt(this.output.getText());
        int in = 0;
        try {
            in = Integer.parseInt(this.input.getText());
        } catch (NumberFormatException e) {
            this.input.setText("");
        }

        this.input.setText("");
        this.output.setText("" + (out + in));

        if ((out + in) == 0) {
            this.button2.setEnabled(false);
        }
    }

    private void performSubtraction() {
        if (this.output.getText().equals("0")) {
            this.button2.setEnabled(true);
        }

        int out = Integer.parseInt(this.output.getText());
        int in = 0;
        try {
            in = Integer.parseInt(this.input.getText());
        } catch (NumberFormatException e) {
            this.input.setText("");
        }

        this.input.setText("");
        this.output.setText("" + (out - in));

        if ((out - in) == 0) {
            this.button2.setEnabled(false);
        }
    }

    private void resetValue() {
        this.button.setEnabled(false);
        this.input.setText("");
        this.output.setText("0");
    }
}
