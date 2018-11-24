package Mias;

import javax.swing.*;

public class Marco {
   public static void main(String[] args) {
      JFrame f = new JFrame("");
      f.setAlwaysOnTop(true);
      f.setSize(300,300);
      f.setVisible(true);
      JDialog d = new JDialog(f, "Dialog", true);
      d.setSize(300,300);
      d.setLocationRelativeTo(null);
      d.setVisible(true);
   }
}
