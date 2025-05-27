import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;

public class q2 extends JFrame implements ActionListener {
  int count = 0;
  JButton b = new JButton("save");
  JTextArea t = new JTextArea("hello", 30, 30);
  JFrame f = new JFrame("Question");

  q2() {
    f.setSize(800, 800);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new FlowLayout());

    f.add(t);
    f.add(b);

    b.addActionListener(this);
  }

  public void displayfiledetails() 
   {
    try
    {
    FileReader fr = new FileReader("inputdata.txt");
    int i = 0;
    while ((i = fr.read()) != -1) {
      System.out.print((char) i);

    }
    System.out.println();
    fr.close();

    }catch(IOException e)
    {
      System.out.println(e.getMessage());
    }
  }

  void Write(String data) {
    try
    {
    FileWriter fr = new FileWriter("inputdata.txt");
    fr.write(data);
    fr.close();

    displayfiledetails();
    StringTokenizer st = new StringTokenizer(data, "\n ");
    while (st.hasMoreTokens()) {
      String p = st.nextToken();
      count++;

    }
    System.out.print("Total no of words:");
    System.out.println(count);
   }
   catch(IOException e)
    {
      System.out.println(e.getMessage());
    }

  }

  public void actionPerformed(ActionEvent e) {
    try {
      if (e.getSource() == b) {
        count = 0;
        Write(t.getText());

      }
    } catch (Exception k) {
    }
  }

  public static void main(String args[]) {
    new q2();

  }
}