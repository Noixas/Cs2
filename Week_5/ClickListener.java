
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 An action listener that prints a message.
*/
public class ClickListener implements ActionListener
{
  InputConverter from;
  InputConverter to;

  public ClickListener(InputConverter a, InputConverter b)
  {
from = a;
to = b;
  }
 public void actionPerformed(ActionEvent event)
 {

   if(from.getCurrencyOption() == to.getCurrencyOption()){
     to.setTextArea("Error, same currency");
   }
   else{
    try {
      //0 USD
      //1 Euros
      //2 GBP

       float input = Float.parseFloat(from.getInput());
       int indexFROM = from.getCurrencyOption();
       int indexTO = to.getCurrencyOption();
       switch(indexFROM)
       {
         case 0:
         if(indexTO == 1) //Dollar to euro
         {
           setOutput(input*.84f);
         }
         else{ //dollar to gbp
           setOutput(input*0.75f);

         }
         break;
         case 1:
         if(indexTO == 0)//euro to dollar
         {
           setOutput(input*1.18f);
         }
         else{ //euro to gbp
           setOutput(input*0.89f);
         }
         break;
         case 2:
         if(indexTO == 0) //gbp to dollar
         {
           setOutput(input*1.32f);

         }
         else{//gbp to euro
           setOutput(input*1.12f);
         }
         break;

       }

    }catch(Exception e)
    {
      System.out.println("Just numbers");
      from.setTextArea("");
      to.setTextArea("Write numbers only");
    }
  }
 }
 private void setOutput(float out)
 {
   to.setTextArea(" "+out);
 }
}
