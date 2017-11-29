import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class InputConverter extends JPanel {
  private int _width;
  private int _height;
  private JComboBox<String> combo;
  private boolean output;
  private JTextArea textArea ;
  public InputConverter(int width, int height, boolean out)
  {
    _width = width;
    _height = height;
    setLayout(new GridLayout(1, 2));
    combo = new JComboBox<String>();
    JPanel a = new JPanel();
    JPanel b = new JPanel();
    output = out;

    combo.setPreferredSize(new Dimension(_width /2,_height));
    combo.addItem("U.S. dollars (USD)");
    combo.addItem("Euros (EUR)");
    combo.addItem("British pounds (GBP)");
     String select = (String) combo.getSelectedItem();
     textArea = new JTextArea();
     textArea.setPreferredSize(new Dimension(_width /2,_height));

     if(output){
       textArea.setEditable(false);
       textArea.setText("OUTPUT");
       combo.setSelectedIndex(1);
     }
     a.add(textArea);
     b.add(combo);
     add(a);
     add(b);
  }
  public int getCurrencyOption()
  {
    return combo.getSelectedIndex();
  }
  public void setTextArea(String text)
  {
    textArea.setText(text);
  }
  public String getInput()
  {
    return textArea.getText();
  }


}
