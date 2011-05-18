package adbexplorer.util;

import javax.swing.*;
 
public class MessageBoxes {
 
  public static void ShowMessage(String title, String text, int messageType)
  {
    JOptionPane.showMessageDialog(null, text, title, messageType);
  }
  
  public static void ShowMessage(String text)
  {
    ShowMessage(text,"Java ADB Explorer");
  }
 
  public static void ShowMessage(String title,String text)
  {
    ShowMessage(title, text, JOptionPane.NO_OPTION);
  }
 
  public static void ShowError(String title,String text)
  {
    ShowMessage(title, text, JOptionPane.ERROR_MESSAGE);
  }
 
  public static void ShowWarning(String title,String text)
  {
    ShowMessage(title, text, JOptionPane.WARNING_MESSAGE);
  }
 
  public static void ShowInfo(String title,String text)
  {
    ShowMessage(title, text, JOptionPane.INFORMATION_MESSAGE);
  }
}
