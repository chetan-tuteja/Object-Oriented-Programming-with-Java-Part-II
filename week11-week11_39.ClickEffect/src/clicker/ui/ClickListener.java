/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Chetan Tuteja
 */
public class ClickListener implements ActionListener {

    private Calculator calc;
    private JLabel label;
    
    public ClickListener(Calculator calc, JLabel label) {
        this.calc = calc;
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.calc.increase();
        this.label.setText("" + this.calc.giveValue());
    }
}
