
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    @Override
    public void run() {
        this.calculator = new Calculator();
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        
        JTextField input = new JTextField("");
                     
        container.add(output);
        container.add(input);
        container.add(createPanel(input, output));
    }

    public JFrame getFrame() {
        return frame;
    }
    
    private JPanel createPanel(JTextField input, JTextField output) {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton z = new JButton("z");
        
        panel.add(plus);
        panel.add(minus);
        panel.add(z);
        
        ClickListener listner = new ClickListener(this.calculator, input, output,
                plus, minus, z);
        
        plus.addActionListener(listner);
        minus.addActionListener(listner);
        z.addActionListener(listner);
        
        z.setEnabled(false);
        
        return panel;
    }
}