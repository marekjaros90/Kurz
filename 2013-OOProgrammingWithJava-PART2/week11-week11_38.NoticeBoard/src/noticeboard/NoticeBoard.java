package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField up = new JTextField();
        JButton copyButton = new JButton("Copy!");
        JLabel label = new JLabel("I was copied her from the JTextArea");
        
        ActionEventListener copier = new ActionEventListener(up, label);
        copyButton.addActionListener(copier);
        
        container.add(up);
        container.add(copyButton);
        container.add(label);
        
    }
}
