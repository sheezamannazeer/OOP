import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.StringTokenizer;

public class q3 extends JFrame implements ActionListener
{
  int count = 0;
  JButton b = new JButton("save");
  JTextArea t = new JTextArea("hello", 30, 30);
  JFrame f = new JFrame("Question");

  q3()
  {
    f.setSize(800,800);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);

    b.addActionListener(this);
  }

  public void displayfiledetails()
  {
    try
    {
        int i=0;
        FileReader fr= new FileReader("test.txt");
        while((i=fr.read())!=-1)
        {
            System.out.println((char)i);
        }
        System.out.println("");
        fr.close();

    }
    catch(IOException e)
    {
        System.out.println(e.getMessage());
    }
  }
  void write(String data)
  {
    try
    {
        FileWriter fw = new FileWriter("file1.txt");
        fw.write(data);
        fw.close();

        displayfiledetails();
        StringTokenizer st= StringTokenizer(data,"\n");
        while(st.hasMoreTokens())
        {
            String p=st.nextToken();
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
}

public void actionPerformed(ActionEvent e) {
    try {
      if (e.getSource() == b) {
        count = 0;
        write(t.getText());

      }
    } catch (Exception k) {
    }
  }

  public static void main(String args[]) {
    new q2();

  }
}