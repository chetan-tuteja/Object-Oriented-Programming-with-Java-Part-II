package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        this.frame = new JFrame("Survey");
        this.frame.setPreferredSize(new Dimension(200, 300));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(this.frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);
    }

    public void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        container.add(new JLabel("Are you?"));
        JCheckBox c1 = new JCheckBox("Yes!");
        JCheckBox c2 = new JCheckBox("No!");
        JRadioButton b1 = new JRadioButton("No reason.");
        JRadioButton b2 = new JRadioButton("Because it is fun!");
        JButton button = new JButton("Done!");

        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);

        container.add(c1);
        container.add(c2);
        container.add(new JLabel("Why?"));
        container.add(b1);
        container.add(b2);
        container.add(button);
    }

    public JFrame getFrame() {
        return frame;
    }
}
