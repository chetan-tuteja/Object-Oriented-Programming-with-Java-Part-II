/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Chetan Tuteja
 */
public class ActionEventListener implements ActionListener {

    private JTextField text;
    private JLabel label;
    
    public ActionEventListener(JTextField text, JLabel label) {
        this.text = text;
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.label.setText(this.text.getText());
        this.text.setText("");
    }
}
