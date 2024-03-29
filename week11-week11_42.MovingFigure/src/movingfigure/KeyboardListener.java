/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Chetan Tuteja
 */
public class KeyboardListener implements KeyListener {

    private Figure figure;
    private Component component;

    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.figure.move(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.figure.move(1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.figure.move(0, -1);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.figure.move(0, 1);
        }

        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
