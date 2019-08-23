package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame();
        this.frame.setPreferredSize(new Dimension(400, 200));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(this.frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField text = new JTextField("I was copied here from the JTextArea");
        JLabel label = new JLabel();
        JButton copy = new JButton("Copy!");

        ActionEventListener action = new ActionEventListener(text, label);
        copy.addActionListener(action);

        container.add(text);
        container.add(copy);
        container.add(label);

    }
}
