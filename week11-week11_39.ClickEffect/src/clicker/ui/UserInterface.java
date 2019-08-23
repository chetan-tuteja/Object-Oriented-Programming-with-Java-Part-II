package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import clicker.applicationlogic.*;
import java.awt.BorderLayout;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Calculator calc;

    public UserInterface(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JLabel label = new JLabel("" + this.calc.giveValue());
        JButton click = new JButton("Click!");

        ClickListener listener = new ClickListener(this.calc, label);
        click.addActionListener(listener);

        container.add(label, BorderLayout.NORTH);
        container.add(click, BorderLayout.CENTER);
    }

    public JFrame getFrame() {
        return frame;
    }
}
