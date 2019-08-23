
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(400, 200));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField textOut = new JTextField("0");
        textOut.setEnabled(false);

        JTextField textIn = new JTextField();

        container.add(textOut);
        container.add(textIn);

        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("Z");
        b1.addActionListener(new ClickListener(textIn, textOut, b1, b3));
        b2.addActionListener(new ClickListener(textIn, textOut, b2, b3));
        b3.setEnabled(false);
        b3.addActionListener(new ClickListener(textIn, textOut, b3, b3));

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
