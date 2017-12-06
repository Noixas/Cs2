
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 An action listener that prints a message.
*/

public class ClickLogin implements ActionListener
{
private Login log;
  public ClickLogin(Login pLogin)
  {
    log = pLogin;
  }
 public void actionPerformed(ActionEvent event)
 {
   log.submitPassword();
 }
}
