
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ClickListener implements ActionListener {

    private Calculator calculator;
    private JTextField input;
    private JTextField output;
    private JButton plus;
    private JButton minus;
    private JButton z;
    

    public ClickListener(Calculator calculator, JTextField input, JTextField output,
            JButton plus, JButton minus, JButton z) {
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        this.plus = plus;
        this.minus = minus;
        this.z = z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == plus) {
            pressPlus();
        } else if(e.getSource() == minus) {
            pressMinus();
        } else if(e.getSource() == z) {
            pressZed();
        }
        calculator.getValue();
    }
    
    private void setOutput() {
        output.setText("" + calculator.getValue());
        z.setEnabled(true);
        
    }
    
    private void pressPlus(){
        try {
            calculator.plus(Integer.parseInt(input.getText()));
            setOutput();
        }catch (NumberFormatException exception){
        }
        input.setText("");
    }
    
      private void pressMinus(){
        try {
            calculator.minus(Integer.parseInt(input.getText()));
            setOutput();
        }catch (NumberFormatException exception){
        }
        input.setText("");
    }
    
    private void pressZed(){
        calculator.Z();
        output.setText("0");
        input.setText("");
        z.setEnabled(false);
    }
}
